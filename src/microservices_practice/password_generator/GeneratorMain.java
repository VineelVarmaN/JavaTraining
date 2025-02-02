package microservices_practice.password_generator;

/**
 * will trigger getPasswordCreated function from PasswordCreation class
 *
 */
public class GeneratorMain {
    public static void main(String[] args) {
        //create the password with all combination according to desired length
        PasswordCreation objPasswordCreation = new PasswordCreation();
        System.out.println(objPasswordCreation.getPasswordCreated());
    }
}
