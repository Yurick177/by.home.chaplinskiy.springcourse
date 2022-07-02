package by.home.chaplinskiy.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer technoMusicPlayer = context.getBean(MusicPlayer.class);
        MusicPlayer technoMusicPlayer2 = context.getBean(MusicPlayer.class);
        System.out.println(technoMusicPlayer2 == technoMusicPlayer);
        System.out.println(technoMusicPlayer.playMusic());
        System.out.println(technoMusicPlayer.getName());
        System.out.println(technoMusicPlayer.getVolume());

    }

}
