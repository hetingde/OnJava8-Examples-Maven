package streams;// streams/SortedComparator.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.util.Comparator;

public class SortedComparator {
    public static void
    main(String[] args) throws Exception {
        FileToWords.stream("D:\\Proj\\OnJava8-Examples-Maven\\streams\\src\\main\\java\\streams\\Cheese.dat")
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .map(w -> w + " ")
                .forEach(System.out::print);
    }
}
/* Output:
you what to the that sir leads in district And
*/
