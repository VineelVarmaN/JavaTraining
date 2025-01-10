package javatraining.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class FilterLogicExamples1 {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Pillow", 3000));
        productList.add(new Product(2, "snacks", 2500));
        productList.add(new Product(3, "Bat", 14000));
        //to print the elements
        productList.forEach(n-> System.out.println(n.id+" "+n.name+" "+n.price));
        //to print only filtered elements with all elements.
        productList.stream().filter(n-> n.price>2500).forEach(n-> System.out.println(n));
        //to print filtered and mapped elements for only price.
        productList.stream().filter(n-> n.price>2500).map(n->n.price).forEach(n-> System.out.println(n));
    }
}
