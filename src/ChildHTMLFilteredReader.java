public class ChildHTMLFilteredReader extends HTMLFilteredReader {

    public ChildHTMLFilteredReader(String url){
        super(url);
    }

    /**
     * takes the text and search for a set of given words in this text and returns the index
     * @param text word to be searched
     * @return index of the word
     */
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
