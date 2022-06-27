package by.home.chaplinskiy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Device {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Device(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Device " + id + " " + musicPlayer.playMusic();
    }

}
