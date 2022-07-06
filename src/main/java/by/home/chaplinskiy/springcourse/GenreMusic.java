package by.home.chaplinskiy.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GenreMusic {
    private final List<Music> musicList = new ArrayList<>();

    public GenreMusic(TechnoMusic technoMusic, RockMusic rockMusic, PopMusic popMusic) {
        musicList.add(technoMusic);
        musicList.add(rockMusic);
        musicList.add(popMusic);

    }

    public List<Music> getMusicList() {
        return musicList;
    }

}
