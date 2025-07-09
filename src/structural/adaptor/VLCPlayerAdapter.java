package structural.adaptor;

// Adapter for VLC
public class VLCPlayerAdapter implements MediaPlayer {

    VLCPlayer vlcPlayer;

    public VLCPlayerAdapter(VLCPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(String fileName) {
        vlcPlayer.playVlc(fileName);
    }
}
