import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;

import java.io.File;
import java.util.Collection;

/**
 * Created by Thomas Dudek on 8/7/2017.
 */
public class FileReader {

    public Collection<File> GetFiles(String path) {

        return FileUtils.listFiles(new File(path), new String[]{"mp3"}, true);

    }
}
