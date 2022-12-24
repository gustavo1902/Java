import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
  public static void main(String[] args) {
    // Path to the audio file
    String filePath = "path/to/audio/file.wav";

    try {
      // Create a File object for the audio file
      File audioFile = new File(filePath);

      // Create an AudioInputStream for the audio file
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

      // Get a Clip to play the audio
      Clip audioClip = AudioSystem.getClip();

      // Open the audio stream and load the audio into the Clip
      audioClip.open(audioStream);

      // Play the audio
      audioClip.start();

      // Wait for the audio to finish playing
      while (!audioClip.isRunning())
        Thread.sleep(10);
      while (audioClip.isRunning())
        Thread.sleep(10);

      // Close the audio stream and the Clip
      audioStream.close();
      audioClip.close();
    } catch (UnsupportedAudioFileException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (LineUnavailableException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
