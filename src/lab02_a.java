import cs1.SimpleURLReader;

public class lab02_a {
    public static void main(String[] args){

        SimpleURLReader url = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");

        System.out.println(url.getPageContents());
        System.out.println("Number of lines: " + url.getLineCount());
    }
}