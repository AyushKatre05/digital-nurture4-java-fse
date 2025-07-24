interface MediaPlayer {
    void play(String audioType, String fileName);
}
class AudioPlayer implements MediaPlayer {
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3: " + fileName);
        } else {
            MediaAdapter adapter = new MediaAdapter(audioType);
            adapter.play(audioType, fileName);
        }
    }
}
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedPlayer;

    MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) advancedPlayer = new VlcPlayer();
    }

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) advancedPlayer.playVlc(fileName);
    }
}
interface AdvancedMediaPlayer {
    void playVlc(String fileName);
}
class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc: " + fileName);
    }
}
