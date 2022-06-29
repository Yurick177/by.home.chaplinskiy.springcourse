package by.home.chaplinskiy.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {

    private List<String> rockMusicList = new ArrayList<>();

    public void addMusicInList(){
        rockMusicList.add("rockMusic1");
        rockMusicList.add("rockMusic2");
        rockMusicList.add("rockMusic3");
    }

    @Override
    public String getSong() {
        return "RockMusic la-la-la";
    }

}
