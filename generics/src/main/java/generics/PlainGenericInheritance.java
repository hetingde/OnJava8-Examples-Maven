package generics;// generics/PlainGenericInheritance.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

class GenericSetter<T> { // Not self-bounded
    void set(T arg) {
        System.out.println("GenericSetter.set(generics.Base)");
    }
}

class DerivedGS extends GenericSetter<generics.Base> {
    void set(generics.Derived derived) {
        System.out.println("DerivedGS.set(generics.Derived)");
    }
}

public class PlainGenericInheritance {
    public static void main(String[] args) {
        generics.Base base = new generics.Base();
        generics.Derived derived = new generics.Derived();
        DerivedGS dgs = new DerivedGS();
        dgs.set(derived);
        dgs.set(base); // Overloaded, not overridden!
    }
}
/* Output:
DerivedGS.set(generics.Derived)
GenericSetter.set(generics.Base)
*/
