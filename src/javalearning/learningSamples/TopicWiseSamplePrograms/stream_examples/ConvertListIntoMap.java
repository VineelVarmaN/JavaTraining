package javalearning.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product2{
    int id;
    String name;
    float price;

    public Product2(int id, String name, float price) {
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
        return "Product2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ConvertListIntoMap {
    public static void main(String[] args) {
        int productId = 1;
        List<Product2> product2List = new ArrayList<>();
        product2List.add(new Product2(productId++,"chair",250));
        product2List.add(new Product2(productId++,"pen",20));
        product2List.add(new Product2(productId++,"book",100));
        product2List.add(new Product2(productId++,"shirt",600));
        for (Product2 product : product2List){
            System.out.println(product);
        }
        //convert the list into map
        Map<Integer,String> product2Map = product2List.stream().collect(Collectors.toMap(p->p.id,p->p.name));
        for (Map.Entry<Integer,String> products: product2Map.entrySet()){
            System.out.println(products);
        }
    }
}
