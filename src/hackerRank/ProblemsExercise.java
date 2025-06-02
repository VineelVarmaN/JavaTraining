package hackerRank;

public class ProblemsExercise {
    public static void main(String[] args) {
        String one = "Coding";
        String two = "Chaf";
        StringBuffer stringBuffer = new StringBuffer(two);
        stringBuffer.replace(2,3,"e");
        stringBuffer.toString();
        System.out.println(one+" "+stringBuffer);
    }
}
