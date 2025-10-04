package javaCoding.W3Resource.basic_part1;

public class CodeExecutionTimeInNanoseconds {
    public static void main(String[] args) {
        long duration = System.nanoTime();
        for (int i = 0; i<100; i++){
            System.out.println("time to iterate and get the value for "+i+" = "+duration);
        }
        System.out.println("Time to complete the execution : "+duration);
    }
}
