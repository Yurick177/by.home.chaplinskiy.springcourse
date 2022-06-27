package by.home.chaplinskiy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private TechnoMusic technoMusic;
    private String name;
    private int volume;

    @Autowired
    public MusicPlayer(TechnoMusic technoMusic) {
        this.technoMusic = technoMusic;
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

    public void setTechnoMusic(TechnoMusic technoMusic) {
        this.technoMusic = technoMusic;
    }

    public void playMusic() {
        System.out.println("Playing: " + technoMusic.getSong());
    }

}
