/**
 * Created by Thomas Dudek on 8/8/2017.
 */
public class Mp3FileData {
    public String getFileArtist() {
        return FileArtist;
    }

    public void setFileArtist(String fileArtist) {
        FileArtist = fileArtist;
    }

    public String getFileTitle() {
        return FileTitle;
    }

    public void setFileTitle(String fileTitle) {
        FileTitle = fileTitle;
    }

    public String getFileGenere() {
        return FileGenere;
    }

    public void setFileGenere(String fileGenere) {
        FileGenere = fileGenere;
    }

    public String getId3Artist() {
        return Id3Artist;
    }

    public void setId3Artist(String id3Artist) {
        Id3Artist = id3Artist;
    }

    public String getId3Title() {
        return Id3Title;
    }

    public void setId3Title(String id3Title) {
        Id3Title = id3Title;
    }

    public String getId3Genere() {
        return Id3Genere;
    }

    public void setId3Genere(String id3Genere) {
        Id3Genere = id3Genere;
    }

    private String FileArtist;
    private String FileTitle;
    private String FileGenere;

    private String Id3Artist;
    private String Id3Title;
    private String Id3Genere;
}
