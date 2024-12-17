package javatraining.learningSamples.TopicSamplePrograms.exceptionhandling;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("inside try 1");
            try {
                System.out.println("inside try 2");
                int[] i = {1,2,3,4};
                System.out.println(i[10]);
                try {
                    System.out.println("inside try 3");
                }catch (ArithmeticException e){
                    System.out.println("try 3 error is : "+ e);
                }
            }catch (ArithmeticException e){
                System.out.println("try 2 error is : "+ e);
            }
        }catch (Exception e){
            System.out.println("try 1 error is : "+ e);
        }
    }
}
