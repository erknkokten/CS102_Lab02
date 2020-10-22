public class HTMLFilteredReader_Test {
    public static void main(String[] args){
        HTMLFilteredReader url = new HTMLFilteredReader("https://scrapethissite.com/pages/simple/");
        System.out.println(url.getPageContents());
        //System.out.println(url.getUnfilteredPageContents());

    }
}
