package javalearning.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.ArrayList;
import java.util.List;

class Product3{
    int id;
    String name;
    float price;

    public Product3(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class CollectAsListProductExample {
    public static void main(String[] args) {
        int productId = 1;
        List<Product3> product3List = new ArrayList<>();
        product3List.add(new Product3(productId++,"chair",250));
        product3List.add(new Product3(productId++,"pen",20));
        product3List.add(new Product3(productId++,"book",100));
        product3List.add(new Product3(productId++,"shirt",600));
        for (Product3 product: product3List){
            System.out.println(product);
        }
        //filter the products above 200 and collect it to list
        List<Product3> filteredData = product3List.stream().filter(p-> p.price>200).toList();
        System.out.println("The below filtered data : ");
        for (Product3 products : filteredData){
            System.out.println(products);
        }
    }
}
