package by.home.chaplinskiy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music music1 = context.getBean("musicPopBean", PopMusic.class);
        MusicPlayer musicPlayerPop = new MusicPlayer(music1);
        musicPlayerPop.playMusic();

        Music music2 = context.getBean(RockMusic.class);
        MusicPlayer musicPlayerRock = new MusicPlayer(music2);
        musicPlayerRock.playMusic();
        context.close();

    }

}
