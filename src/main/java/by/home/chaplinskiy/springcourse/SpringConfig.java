package by.home.chaplinskiy.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Random;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public TechnoMusic technoMusic() {
        return new TechnoMusic();
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(GenreMusic genreMusic, Random random) {
        return new MusicPlayer(genreMusic, random);
    }

    @Bean
    public GenreMusic genreMusic(TechnoMusic technoMusic,RockMusic rockMusic, PopMusic popMusic){
        return new GenreMusic(technoMusic,rockMusic,popMusic);
    }

    @Bean
    public Random getRandom(){
        return new Random();
    }

}
