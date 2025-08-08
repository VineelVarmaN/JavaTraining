package javalearning.newtopicslearned;

/**
 * TextBlocks feature is used to declare multi-line strings more efficiently
 * TextBlock start with """ and ends with """
 */
public class TextBlockExample {
    public static void main(String[] args) {
        String text1 = "Learning multi=line strings";
        String text2 = """
                Learning multi-line strings
                """;
        System.out.println(text1);
        System.out.println(text2);
        //creating multi line strings using new line feature
        String text3 = "Which language you love?\n"+
                "Java.\n"+
                "Which version we use?\n"+
                "21";
        System.out.println("Multi line text using new line feature = \n"+text3);
        //creating multi line strings using TextBlock feature.
        String text4 = """
                Which language you love?
                Java.
                Which version we use?
                21
                """;
        System.out.println("Multi line text using TextBlock = \n"+text4);
    }
}
