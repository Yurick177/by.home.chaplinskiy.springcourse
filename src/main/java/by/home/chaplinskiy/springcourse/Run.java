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

        MusicPlayer musicPlayer6One = context.getBean("musicPlayerPop", MusicPlayer.class);
        musicPlayer6One.playMusic();
        System.out.println(musicPlayer6One.getVolume());
        System.out.println(musicPlayer6One.getName());

        MusicPlayer musicPlayer6Two = context.getBean("musicPlayerPop", MusicPlayer.class);
        musicPlayer6Two.playMusic();
        System.out.println(musicPlayer6Two.getVolume());
        System.out.println(musicPlayer6Two.getName());

        boolean comparison1 = musicPlayer6One == musicPlayer6Two;
        System.out.println(comparison1);
        System.out.println(musicPlayer6One);
        System.out.println(musicPlayer6Two);

        System.out.println();

        MusicPlayer musicPlayer7One = context.getBean("musicPlayerRock", MusicPlayer.class);
        musicPlayer7One.playMusic();
        System.out.println(musicPlayer7One.getVolume());
        System.out.println(musicPlayer7One.getName());

        MusicPlayer musicPlayer8Two = context.getBean("musicPlayerRock", MusicPlayer.class);
        musicPlayer8Two.playMusic();
        System.out.println(musicPlayer8Two.getVolume());
        System.out.println(musicPlayer8Two.getName());

        boolean comparison2 = musicPlayer8Two == musicPlayer7One;
        System.out.println(comparison2);
        System.out.println(musicPlayer7One);
        System.out.println(musicPlayer8Two);

    }

}
