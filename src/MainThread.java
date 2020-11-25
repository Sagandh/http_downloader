import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public class MainThread implements Runnable{
    private List<String> lists = null;
    private String url = "";

//TODO THAT SHIT NULLPOINTER EXEPTION
    public MainThread(List<String> list) {
        try{
            this.lists = list;
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        int counter = 0;
        for (String list : lists) {
            url = list;
            try {
                new HttpDownloader(GetURL.get(url)).download(newfilename(counter));
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            counter++;
        }
    }

    private String newfilename(int counter){
        return ("newfile_" + (++counter));
    }


}
