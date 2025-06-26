package W3Resource.constructors;

class Cat{
    String name;
    int age;

    public Cat() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Cat catObj = new Cat();
        catObj.setAge(0);
        catObj.setName("Unknown");
        System.out.println("The name is : "+catObj.getName());
        System.out.println("The age is : "+catObj.getAge());
    }
}
