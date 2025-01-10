package javatraining.learningSamples.TopicWiseSamplePrograms.Lambda;

interface Sayable{
    public String say();
}
public class NoParameterExample {
    public static void main(String[] args) {
        Sayable s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
