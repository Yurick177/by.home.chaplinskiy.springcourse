package by.home.chaplinskiy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        System.out.println(musicPlayer.playMusic());
    }

}
