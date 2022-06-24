package by.home.chaplinskiy.springcourse;

import org.springframework.stereotype.Component;

@Component("musicPopBean")
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "PopMusic la-la-la";
    }

}
