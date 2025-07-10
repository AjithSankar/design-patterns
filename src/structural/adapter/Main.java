package structural.adapter;

public class Main {

    public static void main(String[] args) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(MediaType.MP4, "Hello.mp4");
        audioPlayer.play(MediaType.VLC, "newVlcVideo.vlc");
        audioPlayer.play(MediaType.MP3, "newSong.mp3");

    }
}
