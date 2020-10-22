import cs1.SimpleURLReader;

public class Test {
    public static void main(String[] args){

        //PART A
        SimpleURLReader url = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");
        System.out.println(url.getPageContents());
        System.out.println("Number of lines: " + url.getLineCount());
        System.out.println("************************************");

        //PART B
        MySimpleURLReader url_1 = new MySimpleURLReader("https://scrapethissite.com/pages/simple");
        System.out.println(url_1.getName());
        System.out.println(url_1.getURL());
        System.out.println("************************************");

        //PART C
        MySimpleURLReader url_2 = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~ozturk/cs102/housman.txt");

        String [] css =  url_1.getCSSLinks();
        for(int i = 0; i<css.length; i++){
            System.out.println(css[i]);
        }
        System.out.println("\nCount of css files is " + url_1.getNumberOfCSSLinks());

        css =  url_2.getCSSLinks();
        for(int i = 0; i<css.length; i++){
            System.out.println(css[i]);
        }
        System.out.println("\nCount of css files in link provided in part a  is " + url_2.getNumberOfCSSLinks());
        System.out.println("************************************");

        //PART D
        HTMLFilteredReader url_3 = new HTMLFilteredReader("https://scrapethissite.com/pages/simple/");
        System.out.println(url_3.getPageContents());
        //System.out.println(url.getUnfilteredPageContents());
        System.out.println("************************************");

        //PART E
        ChildHTMLFilteredReader url_4 = new ChildHTMLFilteredReader("https://scrapethissite.com/pages/simple/");
        System.out.println("Index of \"Turkey\" is " + url_4.wordSearch("Turkey"));
        System.out.println("Index of \"Ankara\" is " + url_4.wordSearch("Ankara"));
        System.out.println("************************************");


    }
}
