import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Player {
  public void playmp3() {
    String songName = "Win sound.mp3";
    String pathToMp3 = "./assets" +"/"+ songName;
    BasicPlayer myPlayer = new BasicPlayer();
    BasicController playerController = (BasicController) myPlayer;
    File file = new File(pathToMp3);
    try {
      playerController.open(file);
      playerController.play();

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
