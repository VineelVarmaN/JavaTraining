package javatraining.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Product1{
    int id;
    String name;
    float price;

    public Product1(int id, String name, float price) {
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
        return "Product1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class FindMaxAndMinProductExample {
    public void getMinValues(List<Product1> product1List){
        Optional<Product1> min = product1List.stream().min(Comparator.comparing(Product1::getPrice));
        min.ifPresent(n-> System.out.println("Minimum values are : "+n.price));
    }
    public void getMaxValues(List<Product1> product1List){
        Optional<Product1> max = product1List.stream().max(Comparator.comparing(Product1::getPrice));
        max.ifPresent(n-> System.out.println("Maximum values are : "+n.price));
    }
    public static void main(String[] args) {
        List<Product1> product1List = new ArrayList<>();
        product1List.add(new Product1(1, "chair", 250));
        product1List.add(new Product1(2, "Chocolate", 130));
        product1List.add(new Product1(3, "Wine", 450));
        product1List.add(new Product1(4, "Apple", 590));
        for (Product1 products: product1List){
            System.out.println(products);
        }
        FindMaxAndMinProductExample objFindMaxAndMinProductExample = new FindMaxAndMinProductExample();
        //call getMinValue method to print min price value
        objFindMaxAndMinProductExample.getMinValues(product1List);
        //call getMaxValue method to print max price value
        objFindMaxAndMinProductExample.getMaxValues(product1List);
    }
}
