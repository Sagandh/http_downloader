import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException, NoSuchFieldException {
        List<String> l = new ArrayList<>();
        ListOfURLs listOfURLs = new ListOfURLs("urls.txt");
        for(String i : listOfURLs.microRead()){
            l.add(i);
        }
        Thread t = new Thread(new MainThread(l));
        t.start();
    }
    
}
