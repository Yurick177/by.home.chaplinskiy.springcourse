package by.home.chaplinskiy.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private final Random random;
    List<Music> genreList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(GenreMusic genreMusic, Random random) {
        this.genreList = genreMusic.getMusicList();
        this.random = random;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void playMusic() {
        int i = random.nextInt(2);
        System.out.println(genreList.get(i).getSong() + " " + getName() + " " + getVolume());
    }

}
