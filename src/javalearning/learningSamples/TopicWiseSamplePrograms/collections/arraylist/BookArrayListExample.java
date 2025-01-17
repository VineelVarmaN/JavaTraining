package javalearning.learningSamples.TopicWiseSamplePrograms.collections.arraylist;

import java.util.ArrayList;

public class BookArrayListExample {
    //create object beans
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int quantity;
    //create constructor
    public BookArrayListExample(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public static void main(String[] args) {
        ArrayList<BookArrayListExample> booksList = new ArrayList<>();
        booksList.add(new BookArrayListExample(1, "Java", "JavaTpoint", "google",10));
        booksList.add(new BookArrayListExample(2, "Git", "abcd", "gitHub",20));
        booksList.add(new BookArrayListExample(3, "Spring", "ranga", "in28minutes",19));
        booksList.add(new BookArrayListExample(4, "MicroServices", "ranga", "in28minutes",11));
        for (BookArrayListExample book: booksList){
            System.out.println("The details of book : "+book.id+" "+book.name+" "+book.author+" "+book.publisher+" "+book.quantity);
        }
    }
}
