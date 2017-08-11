import org.junit.Test;

import java.io.File;

import static org.mockito.Mockito.*;
/**
 * Created by Thomas Dudek on 8/11/2017.
 */
public class DataReadServiceTest {
    @Test
    public void getFiles() {
    }

    @Test
    public void readFromFile() {

        DataReadService service = new DataReadService();
        File file = mock(File.class);
        when(file.getName()).thenReturn("Sylwia Grzeszczak & Liber - Co Z Nami Bedzie.mp3");

        Mp3FileData result = service.ReadFromFile(file);

    }

}