package W3Resource.recursive;

/**
 * Write a Java recursive method to reverse a given string.
 */
public class RecursiveStringReversal {
    public static String getStringReversal(String name){
        String result="";
        //check string should not be null and greater than 1 length
        if (name==null || name.length()<1){
            return name;
        }
//        result+=Character.toString(name.charAt(name.length()-1));
//        String remainingName = name.substring(0,name.length()-1);
//        return result.concat(getStringReversal(remainingName));
        return name.charAt(name.length()-1)+ getStringReversal(name.substring(0,name.length()-1));
    }

    public static void main(String[] args) {
        String name = "Vineel";
        System.out.println(getStringReversal(name));
    }
}
