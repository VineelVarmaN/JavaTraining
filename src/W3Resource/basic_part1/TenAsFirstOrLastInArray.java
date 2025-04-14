package W3Resource.basic_part1;

import java.util.stream.IntStream;

public class TenAsFirstOrLastInArray {
    public boolean getTenAsFirstOrLast(int[] data){
        //check the array length must be greater than or equal to 2
        if (data.length>=2){
            //check if 10 appear as the first or last element.
            if (data[0]==10 && data[data.length-1]==10){
                return true;
            }
        }
        return false;
    }
    public boolean getTenAsFirstOrLastUsingStream(int[] data){
        boolean result = IntStream.of(data).filter(n->data.length>=2).allMatch(n->(data[0]==10 && data[data.length-1]==10));
        return result;
    }
    public static void main(String[] args) {
        int[] data = {10, -20, 0, 30, 40, 60, 10};
        TenAsFirstOrLastInArray objTenAsFirstOrLastInArray = new TenAsFirstOrLastInArray();
        System.out.println(objTenAsFirstOrLastInArray.getTenAsFirstOrLast(data));
        //using stream
        System.out.println("Using stream : "+objTenAsFirstOrLastInArray.getTenAsFirstOrLastUsingStream(data));
    }
}
