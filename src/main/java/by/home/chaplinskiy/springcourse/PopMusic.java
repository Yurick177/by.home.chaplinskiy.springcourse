package by.home.chaplinskiy.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("musicPopBean")
public class PopMusic implements Music {

    private List<String> popMusicList = new ArrayList<>();

    public void addMusicInList() {
        popMusicList.add("PopMusic1");
        popMusicList.add("PopMusic2");
        popMusicList.add("PopMusic3");
    }

    @Override
    public List<String> getSong() {
        return popMusicList;
    }

}
