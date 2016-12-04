package ru.seet61.MavenTest;
import org.joda.time.LocalTime;

/**
 * Created by seet on 03.12.16.
 */
public class MavenTest {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("Текущее локальное время: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
