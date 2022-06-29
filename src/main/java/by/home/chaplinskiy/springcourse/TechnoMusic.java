package by.home.chaplinskiy.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TechnoMusic implements Music {
    private List<String> technoMusicList = new ArrayList<>();

    public void addMusicInList() {
        technoMusicList.add("TechnoMusic1");
        technoMusicList.add("TechnoMusic2");
        technoMusicList.add("TechnoMusic3");
    }

    @Override

    public String getSong() {
        return "TechnoMusic la-la-la";
    }

}
