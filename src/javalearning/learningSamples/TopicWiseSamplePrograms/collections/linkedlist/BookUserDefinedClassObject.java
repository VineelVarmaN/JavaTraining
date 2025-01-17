package javalearning.learningSamples.TopicWiseSamplePrograms.collections.linkedlist;

import java.util.LinkedList;

/**
 * User defined object class example = Book
 * create bean objects
 * create argument constructor
 */
class Book {
    //create bean objects
    int id;
    String name,author,publisher;
    int quantity;
    //create constructor
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
public class BookUserDefinedClassObject{
    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList<>();
        list.add(new Book(1, "Java", "JavaTpoint", "google",10));
        list.add(new Book(2, "Git", "abcd", "gitHub",20));
        list.add(new Book(3, "Spring", "ranga", "in28minutes",19));
        list.add(new Book(4, "MicroServices", "ranga", "in28minutes",11));
        //traversing through the list
        for (Book bookDetails: list){
            System.out.println("The book details are : "+bookDetails);
        }
    }
}
