import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by tdudek on 8/7/17.
 */
public class mp3fix {

    final static Logger logger = LoggerFactory.getLogger(mp3fix.class);

    public static void main(String[] args) {

        logger.info("Staring...");

        Collection<File> files = (new FileReader()).GetFiles("C:\\Users\\Thomas Dudek\\Desktop\\test\\Polski Pop");

        ArrayList<Mp3FileData> result = (new DataReadService()).GetFiles(files);
    }
}
