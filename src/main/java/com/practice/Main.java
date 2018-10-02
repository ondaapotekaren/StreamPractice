package com.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.*;

public class Main {

    public static void main(String[] args){

        Path path =  Paths.get("C:/" +
                                    "Users/" +
                                    "Viktor/" +
                                    "IdeaProjects/" +
                                    "PracticeProject/" +
                                    "src/" +
                                    "main/" +
                                    "resources/" +
                                    "people.txt");

        try (Stream<String> lines = Files.lines(path)) {

            Spliterator<String> lineSpliterator = lines.spliterator();
            Spliterator<Person> peopleSpliterator = new PersonSpliterator(lineSpliterator);

            Stream<Person> people = StreamSupport.stream(peopleSpliterator, false);
            people
                .distinct()
                .forEach(System.out::println);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
