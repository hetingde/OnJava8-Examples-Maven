package generics;// generics/GenericsAndCovariance.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import generics.Fruit;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<>();
        // Compile Error: can't add any type of object:
//         flist.add(new Apple());
//         flist.add(new Fruit());
//         flist.add(new Object());
        flist.add(null); // Legal but uninteresting
        // We know it returns at least generics.Fruit:
        Fruit f = flist.get(0);
    }
}
