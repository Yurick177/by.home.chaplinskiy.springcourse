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

    }

}
