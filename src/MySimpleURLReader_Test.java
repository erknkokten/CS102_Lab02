import cs1.SimpleURLReader;

public class MySimpleURLReader_Test {
    public static void main(String[] args) {
        SimpleURLReader url = new MySimpleURLReader("https://scrapethissite.com/pages/simple");
        System.out.println(((MySimpleURLReader) url).getName());
        System.out.println(((MySimpleURLReader) url).getURL());
        System.out.println(url.getPageContents());
        String [] css = ((MySimpleURLReader) url).getCSSLinks();

        for(int i = 0; i<css.length; i++){
            System.out.println(css[i]);
        }
        System.out.println("\nCount of css files is " + ((MySimpleURLReader) url).getNumberOfCSSLinks());

        /*String[] links = ((MySimpleURLReader) url).getLinks();
        for(int i = 0; i<links.length; i++){
            System.out.println(links[i] );
        }*/

    }
}
