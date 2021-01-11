package generics;// generics/OrdinaryArguments.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

class OrdinarySetter {
    void set(generics.Base base) {
        System.out.println("OrdinarySetter.set(generics.Base)");
    }
}

class DerivedSetter extends OrdinarySetter {
    void set(generics.Derived derived) {
        System.out.println("DerivedSetter.set(generics.Derived)");
    }
}

public class OrdinaryArguments {
    public static void main(String[] args) {
        generics.Base base = new generics.Base();
        generics.Derived derived = new generics.Derived();
        DerivedSetter ds = new DerivedSetter();
        ds.set(derived);
        // Compiles--overloaded, not overridden!:
        ds.set(base);
    }
}
/* Output:
DerivedSetter.set(generics.Derived)
OrdinarySetter.set(generics.Base)
*/
