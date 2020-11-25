import java.net.MalformedURLException;
import java.net.URL;

public class GetURL {
    public static URL get(String http) throws MalformedURLException {
        return new URL(http);
    }
}
