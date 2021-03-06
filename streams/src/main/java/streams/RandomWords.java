package streams;// streams/RandomWords.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomWords implements Supplier<String> {
    List<String> words = new ArrayList<>();
    Random rand = new Random(47);

    RandomWords(String fname) throws IOException {
        Path path = Paths.get(fname);
        List<String> lines =
                Files.readAllLines(path);
        // Skip the first line:
        for (String line : lines.subList(1, lines.size())) {
            for (String word : line.split("[ .?,]+"))
                words.add(word.toLowerCase());
        }
        System.out.println(words);
        System.out.println(words.size());
    }

    public String get() {
        return words.get(rand.nextInt(words.size()));
    }

    @Override
    public String toString() {
        return words.stream()
                .collect(Collectors.joining(" "));
    }

    public static void
    main(String[] args) throws Exception {
        System.out.println(
                Stream.generate(new RandomWords("D:\\Proj\\OnJava8-Examples-Maven\\streams\\src\\main\\java\\streams\\Cheese.dat"))
                        .limit(30)
                        .collect(Collectors.toList()));
        System.out.println(
                Stream.generate(new RandomWords("D:\\Proj\\OnJava8-Examples-Maven\\streams\\src\\main\\java\\streams\\Cheese.dat"))
                        .limit(10)
                        .collect(Collectors.joining(" ")));
    }
}
/* Output:
it shop sir the much cheese by conclusion district is
*/
