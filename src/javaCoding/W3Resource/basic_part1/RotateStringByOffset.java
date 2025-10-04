package javaCoding.W3Resource.basic_part1;

public class RotateStringByOffset {
    public static String getRotatedString(String name, int offset){
        StringBuffer stringBuffer = new StringBuffer();
        String tempResult = "";
        //iterate the string and get characters after the offset value
        for (int i = offset; i<name.length(); i++){
            tempResult += name.charAt(i);
        }
        //will
        stringBuffer.append(tempResult).append(name.substring(0,offset));
        return stringBuffer.toString().trim();
    }
    public static String getRotatedStringWithStream(String name, int offset){
        //create a stringBuffer to manipulate string
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(name.substring(offset,name.length())).append(name.substring(0,offset));
        return stringBuffer.toString().trim();
    }

    public static void main(String[] args) {
        String name = "abcdef";
        int offset = 3;
        System.out.println("Input string : "+name);
        System.out.println("Input offset : "+offset);
        System.out.println(getRotatedString(name, offset));
        System.out.println("Using Stream : "+getRotatedStringWithStream(name,offset));
    }
}
