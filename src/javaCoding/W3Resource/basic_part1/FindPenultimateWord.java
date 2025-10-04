package javaCoding.W3Resource.basic_part1;

public class FindPenultimateWord {
    public String getPenultimateWord(String input){
        if (input == ""){
            return "No input is provided";
        }
        String[] words = input.split(" ");
        String penultimateWord = "";
        for (String word: words){
            penultimateWord = words[words.length-2];
        }
        return "Penultimate word: " + penultimateWord;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        FindPenultimateWord objFindPenultimateWord = new FindPenultimateWord();
        System.out.println(objFindPenultimateWord.getPenultimateWord(input));
    }
}
