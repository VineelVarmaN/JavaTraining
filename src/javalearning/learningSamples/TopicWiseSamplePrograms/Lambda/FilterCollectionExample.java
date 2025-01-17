package javalearning.learningSamples.TopicWiseSamplePrograms.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Product1{
    int id;
    String name;
    float price;
    public Product1(int id, String name, float price) {
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
public class FilterCollectionExample {
    public static void main(String[] args) {
        List<Product1> productList = new ArrayList<>();
        productList.add(new Product1(1,"Vineel", 240f));
        productList.add(new Product1(2,"Varma",300f));
        productList.add(new Product1(3,"nemmani", 450f));

        //using lambda to filter data
        Stream<Product1> filteredData = productList.stream().filter(p->p.price>250);
        filteredData.forEach(System.out::println);
    }
}
