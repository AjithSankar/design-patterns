package structural.adapter;

// Adapter for MP4
public class Mp4PlayerAdapter implements MediaPlayer {

    Mp4Player mp4Player;

    public Mp4PlayerAdapter(Mp4Player mp4Player) {
        this.mp4Player = mp4Player;
    }

    @Override
    public void play(String fileName) {
        mp4Player.playMp4(fileName);
    }
}
