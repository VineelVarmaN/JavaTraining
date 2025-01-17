package javalearning.learningSamples.TopicWiseSamplePrograms.Lambda;

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
public class ComparatorUsingLambda {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1,"Vineel",250f));
        productsList.add(new Product(2,"Varma", 290f));
        productsList.add(new Product(3,"nemmani",300f));
        for (Product p: productsList){
            System.out.println(p);
        }
    }
}
