package by.home.chaplinskiy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private Music music;
    private TechnoMusic technoMusic;
    private RockMusic rockMusic;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(TechnoMusic technoMusic, RockMusic rockMusic) {
        this.technoMusic = technoMusic;
        this.rockMusic = rockMusic;
    }

    public MusicPlayer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public String playMusic() {
        return "Playing: " + technoMusic.getSong();
    }

}
