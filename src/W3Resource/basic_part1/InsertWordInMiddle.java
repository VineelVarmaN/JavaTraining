package W3Resource.basic_part1;

public class InsertWordInMiddle {
    public String finalWord(String name, String insertValue){
        //can add using substring concept
        String word = name.substring(0,7)+insertValue+name.substring(6);
        return word;
    }
    public static void main(String[] args) {
        String name = "Python 3.0";
        String insertValue = "Tutorial";
        InsertWordInMiddle objInsertWordInMiddle = new InsertWordInMiddle();
        System.out.println(objInsertWordInMiddle.finalWord(name,insertValue));
    }
}
