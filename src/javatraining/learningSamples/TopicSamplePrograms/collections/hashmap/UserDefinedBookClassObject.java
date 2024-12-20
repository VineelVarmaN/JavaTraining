package javatraining.learningSamples.TopicSamplePrograms.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

class Book{
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
    //to string method
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
public class UserDefinedBookClassObject {
    public static void main(String[] args) {
        HashMap<Integer,Book> names = new HashMap<>();
        names.put(1,new Book(1,"Let us C","Yashwant Kanetkar","BPB",8));
        names.put(2,new Book(4,"Java","Kanetkar","Google",16));
        names.put(3,new Book(8,"Spring","Yashwant ","Edge",25));
        for (Map.Entry<Integer,Book> bookEntry: names.entrySet()){
            System.out.println(bookEntry.getKey()+" : "+bookEntry.getValue());
        }
    }
}
