
public class HTMLFilteredReader extends MySimpleURLReader{

    //Constructor
    public HTMLFilteredReader(String url){
        super(url);
    }

    public String getPageContents(){
        String[] links = super.getLinks();
        String content = getUnfilteredPageContents();
        String temp=content;
        String part1="<script";
        String part2 = "</script>";
        int index1, index2;

        while(temp.contains(part1) && temp.contains(part2)){
            index1 = temp.indexOf(part1);
            index2 = temp.indexOf(part2,index1);
            temp = (temp.substring(0,index1)).concat(temp.substring(index2 + part2.length()));

        }
        content = temp;
        part1 = "";
        part2 = "";
        int index=0;
        for(int i = 0; i<links.length;i++){
            if(content.contains(links[i])) {
                index = content.indexOf(links[i]);
                part1 = content.substring(0, index);
                part2 = content.substring(index + links[i].length());
                content = part1.concat(part2);
            }
        }
        return content;
    }

    public String getUnfilteredPageContents(){
        return super.getPageContents();
    }

}
