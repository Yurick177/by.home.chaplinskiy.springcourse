package by.home.chaplinskiy.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;
    private Music music3;


    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("technoMusic") Music music2,
                       @Qualifier("musicPopBean") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }

    public void playMusic(Genre genre) {
        Random random = new Random();
        int i = random.nextInt(3);
        if (genre == Genre.Techno) {
            System.out.println(music2.getSong().get(i));
        } else if (genre == Genre.Rock) {
            System.out.println(music1.getSong().get(i));
        } else {
            System.out.println(music3.getSong().get(i));
        }

    }

}
