package javaCoding.codeChef;

public class PrintTheLength {
    public static void main(String[] args) {
        String sentence = "Coding on CodeChef";
        String[] words = sentence.split(" ");
        for (int i = 0; i< words.length; i++){
            System.out.println(words[i]+" - "+words[i].length());
        }
        System.out.println(sentence+" - "+sentence.length());
    }
}
