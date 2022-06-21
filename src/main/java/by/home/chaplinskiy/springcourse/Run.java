package by.home.chaplinskiy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        Music musicTechno = context.getBean("musicTechnoBean", Music.class);
        MusicPlayer musicPlayer1 = new MusicPlayer(musicTechno);
        musicPlayer1.playMusic();

        Music musicPop = context.getBean("musicPopBean", Music.class);
        MusicPlayer musicPlayer2 = new MusicPlayer(musicPop);
        musicPlayer2.playMusic();

        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer3 = new MusicPlayer(music);
        musicPlayer3.playMusic();

        MusicPlayer musicPlayer4 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer4.playMusic();

        MusicPlayer musicPlayer5 = context.getBean("musicPlayerTechno", MusicPlayer.class);
        musicPlayer5.playMusic();
        System.out.println();

        MusicPlayer musicPlayer6 = context.getBean("musicPlayerPop", MusicPlayer.class);
        musicPlayer6.playMusic();
        System.out.println(musicPlayer6.getVolume());
        System.out.println(musicPlayer6.getName());
        System.out.println();

        MusicPlayer musicPlayer7 = context.getBean("musicPlayerRock", MusicPlayer.class);
        musicPlayer7.playMusic();
        System.out.println(musicPlayer7.getVolume());
        System.out.println(musicPlayer7.getName());
    }

}
