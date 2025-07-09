package structural.adaptor;

import java.util.HashMap;
import java.util.Map;

// Client
public class AudioPlayer {

    private Map<MediaType, MediaPlayer> mediaPlayerMap;

    public AudioPlayer() {
        mediaPlayerMap = new HashMap<>();
        mediaPlayerMap.put(MediaType.MP4, new Mp4PlayerAdapter(new Mp4Player()));
        mediaPlayerMap.put(MediaType.VLC, new VLCPlayerAdapter(new VLCPlayer()));
    }

    public void play(MediaType mediaType, String fileName) {

        MediaPlayer mediaPlayer = mediaPlayerMap.get(mediaType);

        if (mediaPlayer != null) {
            mediaPlayer.play(fileName);
        } else {
            System.out.println("Unsupported mediaType provided: " + mediaType);
        }

    }
}
