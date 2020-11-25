import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class HttpDownloader {
    private final URL url;
    private File file;

    public HttpDownloader(URL url) {
        this.url = url;
    }

    public void download(String newfile) throws IOException {
        double startTime = System.currentTimeMillis();
        ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
        FileChannel fileChannels = new FileOutputStream(newfile).getChannel();
        fileChannels.transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
        readableByteChannel.close();
        fileChannels.close();
        double finishTime = ((System.currentTimeMillis() - startTime) / 1000);
        int correctTime = (int) finishTime;
        file = new File(newfile);
        double sizeoffile = ((file.length() * 8.0) / 1024);
        int intsize = (int)sizeoffile;
        System.out.println("File " + newfile + " was download in " + correctTime + " seconds");
        System.out.println("size of that file is = " + intsize + "Kb");
    }


}
