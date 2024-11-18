package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class AnimalsCage {
    private Animal animal;
    private Animal animal2;
    private Timer timer;


    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animal1, @Qualifier("dog") Animal animal2, Timer timer) {
        this.animal = animal1;
        this.animal2 = animal2;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString() + " " + animal2.toString());
        System.out.println("At:");
        System.out.println(getTimer().getTime());
        System.out.println("________________________");
    }
    public Timer getTimer() {
        return timer;
    }
}