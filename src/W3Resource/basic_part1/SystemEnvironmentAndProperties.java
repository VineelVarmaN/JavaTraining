package W3Resource.basic_part1;

public class SystemEnvironmentAndProperties {
    public static void getSystemEnvironmentAndProperties(){
        //print the system environment
        System.out.println("Print the system environment : ");
        System.out.print(System.getenv());
        //print the system properties
        System.out.println("\n\nPrint the system properties : ");
        System.out.print(System.getProperties());
    }
    public static void main(String[] args) {
        getSystemEnvironmentAndProperties();
    }
}
