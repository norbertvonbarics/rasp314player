import java.net.MalformedURLException;
import java.net.URL;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Player {
  public void playmp3 (){
    String songName = "Win sound.mp3";
    String pathToMp3 = System.getProperty("./assets") +"/"+ songName;
    BasicPlayer player = new BasicPlayer();
    try {
      player.open(new URL("file:///" + pathToMp3));
      player.play();
    } catch (BasicPlayerException | MalformedURLException e) {
      e.printStackTrace();
    }
  }
}
