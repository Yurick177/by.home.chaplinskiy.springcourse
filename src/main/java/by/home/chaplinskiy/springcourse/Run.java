package by.home.chaplinskiy.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer technoMusicPlayer = context.getBean(MusicPlayer.class);
        System.out.println(technoMusicPlayer.playMusic());

        Device device1 = context.getBean(Device.class);
        System.out.println(device1);
    }

}
