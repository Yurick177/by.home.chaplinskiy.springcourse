package by.home.chaplinskiy.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class TechnoMusic implements Music {

    private TechnoMusic() {
    }

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
