package org.example.functional.Streams;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Library {
    public static void main(String[] args){
        LinkedList<LibraryReader> readers = new LinkedList<>();
        readers.add(new LibraryReader("James", new String[]{"Dune", "The Stranger", "Peter pan"}));
        readers.add(new LibraryReader("Alex", new String[]{"the Art the War", "Crime and punishment"}));
        readers.add(new LibraryReader("Jessica", new String[]{"Ulysses", "Dune", "The Stranger", "Moby dick"}));
        readers.add(new LibraryReader("Janet", new String[]{"Dune", "Hamlet", "War and peace", "Catch-22"}));
        readers.add(new LibraryReader("Michel", new String[]{"Moby dick", "Lolita", "Catch-22"}));

        readers.stream()
                .flatMap(reader -> reader.getBooks().stream())
                .sorted(Comparator.comparing(String::length))
                .distinct().forEach(b -> System.out.println(b));
    }
}

@Getter
class LibraryReader {
    private String name;
    private List<String> books;

    public LibraryReader(String name, String[] books) {
        this.name = name;
        this.books = new ArrayList<>();
        for( var book : books){
            this.books.add(book);
        }
    }
}
