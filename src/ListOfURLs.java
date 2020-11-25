import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListOfURLs {
    private final String path;
    private String result = "";
    private final List urlLists = new ArrayList<>();
    public ListOfURLs(String path) {
        this.path = path;
    }


    public List<String> microRead()throws IOException{
        FileReader fr = new FileReader(path);
        Scanner scan = new Scanner(fr);
//        int i;
//        char[] buf = new char[256];
        List<String> lists = new ArrayList<>();
        while (scan.hasNextLine()) {
            lists.add(scan.nextLine());
        }
//        while((i = fr.read(buf)) > 0) {
//            if(i < 256){
//                buf = Arrays.copyOf(buf, i);
//            }
//            System.out.println(buf);
//        }
        return lists;
    }



}
