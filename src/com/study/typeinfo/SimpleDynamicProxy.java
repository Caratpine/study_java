package com.study.typeinfo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.*;

import static com.study.print.Print.print;

@FuckAnnotation
public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        boolean hasAnnotation = SimpleDynamicProxy.class.isAnnotationPresent(FuckAnnotation.class);
        if ( hasAnnotation ) {
            FuckAnnotation fuckAnnotation = SimpleDynamicProxy.class.getAnnotation(FuckAnnotation.class);

            print(fuckAnnotation.id());

        }
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

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface FuckAnnotation {
    public int id() default -1;
    public String msg() default "Hi";
}
