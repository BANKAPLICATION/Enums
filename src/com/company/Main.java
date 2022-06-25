package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Today today = new Today(WeekDays.MONDAY);
        today.daysInfo();


        WeekDays w1 = WeekDays.MONDAY;
        WeekDays w2 = WeekDays.SUNDAY;
        System.out.println(today.weekDay);
        // we can compare the sam Enum
        System.out.println(w1 == w2);
        //we can not compare the two other Enums
       // System.out.println(WeekDays.FRIDAY == WeekDays2.FRIDAY); the compile error
        // equals we can but it is not a value

        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays[]arr = WeekDays.values();
        System.out.println(Arrays.toString(arr));
    }
}

enum WeekDays2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
//enum we can not extend
enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so so"),
    THURSDAY("so so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    //by default the construct has a private modifier
    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }

}
class Today {
    WeekDays weekDay;
    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }
    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to the job");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("We are ready to relax!");
        }
        System.out.println("The mood on this day : " + weekDay.getMood());
    }
}
