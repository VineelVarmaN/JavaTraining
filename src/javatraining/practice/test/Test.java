package javatraining.practice.test;

public class Test {
    public static String converstion(String s){
        int sLength = s.length();
        char c = '0';
        String dummy = "";
        String output = "";
        int finalOutput = 0;
        for (int i = 0; i<sLength; i++){
           c = s.charAt(i);
            //System.out.println("character " + c);
            dummy = Character.toString(c);
            //System.out.println("dummy " + dummy);
            if (dummy.equals(" ") || dummy.matches("[a-zA-Z]")){
                //System.out.println("if condition matches " + 0);
                break;
            }
            else {
                output = output + dummy;
                finalOutput = Integer.parseInt(output);
            }
        }
        System.out.println("finalOutput " + finalOutput);
        //System.out.println("output " + output);

     return s;
    }
    public static void main(String[] args) {
        String input = "-042";
        converstion(input);
    }
}
