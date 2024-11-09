package com.JTraining;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Products{
    String company;
    String name;
    int price;

    public Products(String company, String name, int price) {
        this.company = company;
        this.name = name;
        this.price = price;
    }
}
public class StreamJavaExamples {
    public static void main(String[] args) {
        List<Products> productList = new ArrayList<>();
        //below is adding the values to productList collection using .add method
        // new Products() = adding values to particular variables
        productList.add(new Products("Dell", "DellLaptop",20000));
        productList.add(new Products("lenovo", "LenovoLaptop",30000));
        productList.add(new Products("HP", "HPLaptop",40000));
        productList.add(new Products("Samsung", "SamsungLaptop",29000));
        List<Products> result = new ArrayList<>();
                productList.stream().filter(p -> p.price ==30000).collect(Collectors.toList());
        System.out.println(result);
    }
}
