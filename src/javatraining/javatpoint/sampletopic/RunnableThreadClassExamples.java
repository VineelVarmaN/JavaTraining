package javatraining.javatpoint.sampletopic;

class PersonName implements Runnable{
    public void run(){
        for (int i =0; i<5; i++){
            System.out.println("Vineel");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class AnotherPersonName implements Runnable{
    public void run(){
        for (int j =0; j<5; j++){
            System.out.println("Swathi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class RunnableThreadClassExamples {
    public static void main(String[] args) {
        Runnable objPersName = new PersonName();
        Thread t1 = new Thread(objPersName);
        Runnable objAnotherPersName = new AnotherPersonName();
        Thread t2 = new Thread(objAnotherPersName);
        t1.start();
        t2.start();
    }
}
