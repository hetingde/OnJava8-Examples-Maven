package generics;// generics/NonCovariantGenerics.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// {WillNotCompile}

import generics.Apple;
import generics.Fruit;

import java.util.ArrayList;
import java.util.List;

public class NonCovariantGenerics {
    // Compile Error: incompatible types:
//    List<Fruit> flist = new ArrayList<Apple>();
//    List<? extends Fruit> flist = new ArrayList<>();
//    List<Fruit> f=new ArrayList<Apple>();
}
