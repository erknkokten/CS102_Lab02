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



}
