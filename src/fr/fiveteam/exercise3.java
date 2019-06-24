package fr.fiveteam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class exercise3 {

    public static void main(String[] args) {
        String fileName = "/Users/cda/article.txt";

        try {
            Stream<String>  stream = Files.lines(Paths.get(fileName));
            stream.forEach(line -> {
                Arrays.stream(line.split(" ")).forEach(word -> {
                    System.out.println(word);
                });
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
