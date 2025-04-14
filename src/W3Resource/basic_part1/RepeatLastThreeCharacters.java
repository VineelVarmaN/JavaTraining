package W3Resource.basic_part1;

public class RepeatLastThreeCharacters {
    public void lastThreeCharacters(String name){
        String lastThreeChar = name.substring(name.length() - 3);
        System.out.println(lastThreeChar+lastThreeChar+lastThreeChar);
    }
    public static void main(String[] args) {
        String name = "Python 3.0";
        RepeatLastThreeCharacters objRepeatLastThreeCharacters = new RepeatLastThreeCharacters();
        objRepeatLastThreeCharacters.lastThreeCharacters(name);
    }
}
