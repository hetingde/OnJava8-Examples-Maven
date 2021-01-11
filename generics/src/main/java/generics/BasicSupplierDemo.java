package generics;// generics/generics.BasicSupplierDemo.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import onjava.BasicSupplier;

import java.util.stream.Stream;

public class BasicSupplierDemo {
    public static void main(String[] args) {
        Stream.generate(
                BasicSupplier.create(CountedObject.class))
                .limit(5)
                .forEach(System.out::println);
    }
}
/* Output:
generics.CountedObject 0
generics.CountedObject 1
generics.CountedObject 2
generics.CountedObject 3
generics.CountedObject 4
*/
