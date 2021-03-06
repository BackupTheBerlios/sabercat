/*
 * Sabercat.java
 *
 * Created on October 7, 2004, 5:44 PM
 */
import java.io.*;
/**
 *
 * @author  sorenm
 */
public class Sabercat {
    public static void main(String argv[]) {
        Sabercat sc = new Sabercat();
    }
    
    String tag="";
    String title="";
    String artist="";
    String album="";
    String year="";
    String comment="";
    int genre=-1;
    /** Creates a new instance of Sabercat */
    public Sabercat(File file) {
        try {
      
        RandomAccessFile raf = new RandomAccessFile(file, "r");
    
        // Read a character
        String idtag="";
        raf.seek(0);
        for(int i=0; i < 3; i++) {
            System.out.println(raf.readByte());
        }
        // Seek to end of file
        raf.seek(file.length()-128);
        String comments="";
        
        for(int i=0; i < 3; i++) {
            tag += ((char)raf.readByte());
        }
        for(int i=0; i < 30; i++) {
            title +=((char)raf.readByte());
        }
         for(int i=0; i < 30; i++) {
            artist +=((char)raf.readByte());
        }
        for(int i=0; i < 4; i++) {
            year +=((char)raf.readByte());
        }
        for(int i=0; i < 4; i++) {
            comment +=((char)raf.readByte());
        }
        genre = raf.readByte();
        

        }
        catch(Exception e) {
            e.printStackTrace();
            System.out.println( e);
        }
    }
    
    public static final String [] genres = {
	"Blues","Classic Rock","Country","Dance","Disco","Funk","Grunge",
	"Hip-Hop","Jazz","Metal","New Age","Oldies","Other","Pop","R&B",
	"Rap","Reggae","Rock","Techno","Industrial","Alternative","Ska",
	"Death Metal","Pranks","Soundtrack","Euro-Techno","Ambient",
	"Trip-Hop","Vocal","Jazz+Funk","Fusion","Trance","Classical",
	"Instrumental","Acid","House","Game","Sound Clip","Gospel",
	"Noise","AlternRock","Bass","Soul","Punk","Space","Meditative",
	"Instrumental Pop","Instrumental Rock","Ethnic","Gothic",
	"Darkwave","Techno-Industrial","Electronic","Pop-Folk",
	"Eurodance","Dream","Southern Rock","Comedy","Cult","Gangsta",
	"Top 40","Christian Rap","Pop/Funk","Jungle","Native American",
	"Cabaret","New Wave","Psychedelic","Rave","Showtunes","Trailer",
	"Lo-Fi","Tribal","Acid Punk","Acid Jazz","Polka","Retro",
	"Musical","Rock & Roll","Hard Rock","Folk","Folk-Rock",
	"National Folk","Swing","Fast Fusion","Bebob","Latin","Revival",
	"Celtic","Bluegrass","Avantgarde","Gothic Rock",
	"Progressive Rock","Psychedelic Rock","Symphonic Rock",
	"Slow Rock","Big Band","Chorus","Easy Listening","Acoustic",
	"Humour","Speech","Chanson","Opera","Chamber Music","Sonata",
	"Symphony","Booty Brass","Primus","Porn Groove","Satire",
	"Slow Jam","Club","Tango","Samba","Folklore","Ballad",
	"Power Ballad","Rhytmic Soul","Freestyle","Duet","Punk Rock",
	"Drum Solo","Acapella","Euro-House","Dance Hall", "unknown"};
    
}
