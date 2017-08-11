import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Thomas Dudek on 8/8/2017.
 */
public class DataReadService {
    final static Logger logger = LoggerFactory.getLogger(DataReadService.class);

    ArrayList<Mp3FileData> GetFiles(Collection<File> files) {
        ArrayList<Mp3FileData> result = new ArrayList<Mp3FileData>();

        for (File file : files) {
            try {
                Mp3File mp3file = new Mp3File(file);
                Mp3FileData data = new Mp3FileData();

                data.setId3Artist(mp3file.getId3v2Tag().getArtist());
                data.setId3Title(mp3file.getId3v2Tag().getTitle());
                data.setId3Genere(mp3file.getId3v2Tag().getGenreDescription());


                logger.info(String.format("Filename %s has Artist: %s Title: %s Genre: %s", file.getName(), data.getId3Artist(), data.getId3Title(), data.getId3Genere()));
            } catch (UnsupportedTagException | IOException | InvalidDataException e) {
                logger.error(String.format("Error reading tag %s", file.getName()), e);
            }
        }

        return result;
    }

    public Mp3FileData ReadFromFile(File file) {
        Mp3FileData result = new Mp3FileData();
        StringUtils utils = new StringUtils();

        String fileName = FilenameUtils.removeExtension(file.getName());

        String[] values = utils.split(fileName," - ");
        if(values.length == 2)
        {
            result.setFileArtist(utils.trim(values[0]));
            result.setFileTitle(utils.trim(values[1]));
        }
        else
        {
            result.setMismatch(true);
        }

        return result;
    }

}
