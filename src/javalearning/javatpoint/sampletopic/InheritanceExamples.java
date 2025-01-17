package javalearning.javatpoint.sampletopic;

class NemmaniFirstGeneration{
    String father;
    String mother;
    public NemmaniFirstGeneration(String Father, String Mother){
        this.father = Father;
        this.mother = Mother;
    }
    public String displayFirstGeneration(){
        System.out.println("Husband Name is : " + father + " and Wife name is : " + mother);
        return null;
    }
}
//single inheritance
class NemmaniSecondGeneration extends NemmaniFirstGeneration{
    String son;
    String sonWife;

    public NemmaniSecondGeneration(String father, String mother, String son, String sonWife) {
        super(father, mother);
        this.son = son;
        this.sonWife = sonWife;
    }

    public String displaySecondGeneration(){
        System.out.println(son + "is a child of " + father + " and " + mother);
        System.out.println(son + "is a husband of " + sonWife);
        return null;
    }
}
//multi level inheritance
class NemmaniThirdGeneration extends NemmaniSecondGeneration{
    String Grandson;
    String GrandsonWife;

    public NemmaniThirdGeneration(String father, String mother, String son, String sonWife, String Grandson, String GrandsonWife) {
        super(father, mother, son, sonWife);
        this.Grandson = Grandson;
        this.GrandsonWife = GrandsonWife;
    }

    public String displayThirdGeneration(){
        System.out.println(Grandson + " is a grand child of " + father + " and " + mother);
        System.out.println(Grandson + " is a child of " + son + " and " + sonWife);
        System.out.println(Grandson + " is a husband of " + GrandsonWife);
        return null;
    }
}
public class InheritanceExamples {
    public static void main(String[] args) {
        NemmaniFirstGeneration objFirstGen = new NemmaniFirstGeneration("Gopaiah", "Dhanama");
        objFirstGen.displayFirstGeneration();
        NemmaniSecondGeneration objSecGen = new NemmaniSecondGeneration("Gopaiah", "Dhanama",
                "LingaSwamy", "NagaMani");
        objSecGen.displaySecondGeneration();
        NemmaniThirdGeneration objThirdGen = new NemmaniThirdGeneration("Gopaiah", "Dhanama",
                "LingaSwamy", "NagaMani", "Vineel", "Swathi");
        objThirdGen.displayThirdGeneration();

    }
}
