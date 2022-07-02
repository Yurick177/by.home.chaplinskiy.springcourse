package by.home.chaplinskiy.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class TechnoMusic implements Music {

    public static TechnoMusic getTechnoMusic() {
        return new TechnoMusic();
    }

    @PostConstruct
    public void DoMyInitMethod() {
        System.out.println("вызываюсь до метода getBean ");
    }

    @PreDestroy
    public void DoMyDestroy() {
        System.out.println("вызываюсь в конце по завершению программы");
    }

    @Override
    public String getSong() {
        return "TechnoMusic la-la-la";
    }

}
