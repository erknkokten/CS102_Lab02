import cs1.SimpleURLReader;

import java.util.ArrayList;

public class MySimpleURLReader extends SimpleURLReader {

    String url;

    public MySimpleURLReader(String url){
        super(url);
        this.url = url;
    }
    public String getURL(){
        return url;
    }

    public String getName(){
        int last_index = url.lastIndexOf('/');

        String name = url.substring(last_index+1, url.length());

        return name;
    }

    /**
     * This method finds all the links in the page content(HTML)
     * @return links
     */
    public String[] getLinks(){
        String content = super.getPageContents();
        String temp = content;
        int index1 = 0;
        int index2 = 0;
        ArrayList<String> links = new ArrayList<String>();

        while(temp.contains("<") && temp.contains(">")) {
            index1 = temp.indexOf("<");
            index2 = temp.indexOf(">",index1);
            links.add(temp.substring(index1, index2 + 1));
            temp = temp.substring(index2);
        }

        String[] link_list = new String[links.size()];
        for(int i =0; i<links.size();i++){
            link_list[i] = links.get(i);
        }
        return link_list;
    }


    public int getNumberOfCSSLinks() {
        String[] html_link = getLinks();

        int num_css = 0;
        for (int i = 0; i < html_link.length; i++) {
            if (html_link[i].contains(".css")) {
                num_css++;
            }
        }
        return num_css;
    }

    public String[] getCSSLinks(){
        int num_css = getNumberOfCSSLinks();
        String[] html_link = getLinks();

        String[] css = new String[num_css];
        int index = 0;

        for(int i = 0; i< html_link.length; i++){
            if(html_link[i].contains(".css")){

                int end = html_link[i].indexOf(".css") ;
                int last_index = html_link[i].lastIndexOf('/',end);
                css[index] = html_link[i].substring(last_index+1, end+4);
                index++;
            }
        }
        return css;

    }


}
