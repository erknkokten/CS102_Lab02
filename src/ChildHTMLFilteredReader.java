public class ChildHTMLFilteredReader extends HTMLFilteredReader {

    public ChildHTMLFilteredReader(String url){
        super(url);
    }

    public int wordSearch(String text){
        String content = super.getPageContents();
        content = content.trim();
        //System.out.println(content);
        if(content.contains(text)){
            int index = content.indexOf(text);
            return index;
        }
        return content.indexOf(text);
    }
}
