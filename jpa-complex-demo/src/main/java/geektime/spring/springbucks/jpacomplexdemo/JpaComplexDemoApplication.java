package geektime.spring.springbucks.jpacomplexdemo;

import geektime.spring.springbucks.jpacomplexdemo.model.Coffee;
import geektime.spring.springbucks.jpacomplexdemo.model.CoffeeOrder;
import geektime.spring.springbucks.jpacomplexdemo.model.OrderState;
import geektime.spring.springbucks.jpacomplexdemo.repository.CoffeeOrderRepository;
import geektime.spring.springbucks.jpacomplexdemo.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Currency;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@Slf4j
public class JpaComplexDemoApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaComplexDemoApplication.class, args);
	}

	@Autowired
	private CoffeeRepository coffeeRepository;

	@Autowired
	private CoffeeOrderRepository coffeeOrderRepository;

	@Override
	@Transactional
	public void run(ApplicationArguments args) throws Exception {
		initOrders();
		findOrders();
	}

	private void initOrders() {
		Coffee latte = Coffee.builder().name("latte")
						.price(Money.of(CurrencyUnit.of("CNY"), 30.0))
						.build();
		coffeeRepository.save(latte);

		log.info("Coffee: {}", latte);

		Coffee espresso = Coffee.builder().name("espresso")
						.price(Money.of(CurrencyUnit.of("CNY"), 20.0))
						.build();

		coffeeRepository.save(espresso);

		log.info("Coffee: {}", espresso);

		CoffeeOrder order = CoffeeOrder.builder()
					.customer("Li Lei")
					.items(Collections.singletonList(espresso))
					.state(OrderState.INIT)
					.build();

		coffeeOrderRepository.save(order);

		log.info("Order: {}", order);

		order = CoffeeOrder.builder()
				.customer("Liu Mei")
				.items(Arrays.asList(espresso, latte))
				.state(OrderState.INIT)
				.build();

		coffeeOrderRepository.save(order);

		log.info("Order: {}", order);
	}

	public void findOrders() {
		coffeeOrderRepository.findAll(Sort.by(Sort.Direction.DESC, "id"))
				.forEach(c -> log.info("Loading {}", c));

		List<CoffeeOrder> list = coffeeOrderRepository.findTop3ByOrderByUpdateTimeDescIdAsc();
		log.info("findTop3ByOrderByUpdateTimeDescIdAsc: {}", getJoinedOrderId(list));

		list.forEach(o -> {
			log.info("Order {}", o.getId());
			o.getItems().forEach(i -> log.info("  Item {}", i));
		});

		list = coffeeOrderRepository.findByItems_Name("latte");
		log.info("findByItems_Name: {}", getJoinedOrderId(list));
	}

	private String getJoinedOrderId(List<CoffeeOrder> list) {
		return list.stream().map(o -> o.getId().toString())
				.collect(Collectors.joining(","));
	}

}
