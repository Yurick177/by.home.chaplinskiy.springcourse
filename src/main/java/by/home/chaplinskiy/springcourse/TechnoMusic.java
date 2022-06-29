package by.home.chaplinskiy.springcourse;

import org.springframework.stereotype.Component;

@Component
public class TechnoMusic implements Music {

    @Override
    public String getSong() {
        return "TechnoMusic la-la-la";
    }

}
