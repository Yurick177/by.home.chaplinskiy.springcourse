package by.home.chaplinskiy.springcourse;

public class TechnoMusic implements Music{

    public void DoMyInitMethod(){
        System.out.println("вызываюсь до метода getBean ");
    }

    public void DoMyDestroy(){
        System.out.println("вызываюсь в конце по завершению программы");
    }

    @Override
    public String getSong() {
        return "TechnoMusic la-la-la";
    }

}
