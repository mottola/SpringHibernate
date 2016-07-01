package tech.mottola.springdemo;

/**
 * Created by mottola on 6/29/16.
 */
public class MyApp {
    public static void main(String[] args) {
        // create the object
        Coach trackCoach = new TrackCoach();
        Coach baseballCoach = new BaseballCoach();

        // use the object
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println(baseballCoach.getDailyWorkout());
    }
}
