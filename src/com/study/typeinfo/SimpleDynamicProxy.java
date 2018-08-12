package com.study.typeinfo;

import java.lang.reflect.*;

import static com.study.print.Print.print;

public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject real = new RealObject();
        consumer(real);

        Interface proxy = (Interface)Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{ Interface.class},
                new DynamicProxyHandler(real)
        );
        consumer(proxy);
    }
}

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args)
        throws Throwable {
        print("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);

        if(args != null) {
            for (Object arg : args) {
                print(" " + args);
            }
        }
        return method.invoke(proxied, args);
    }
}
