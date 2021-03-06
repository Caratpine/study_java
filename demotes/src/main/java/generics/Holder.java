package generics;

public class Holder<T> {

    private T a;

    public Holder(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return this.a;
    }

    public static void main(String[] args) {
        Holder<Automobile> h = new Holder<Automobile>(new Automobile());
        Automobile a = h.get();
    }
}


class Automobile {}
