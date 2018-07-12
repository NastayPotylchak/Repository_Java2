package Lesson2_2;

import sun.applet.Main;

class MainOfWeek {

final int HOURSOFWEEK = 40;
final int HOURSOFDAY = 8;

public static void main(String[] args) {

    MainOfWeek main = new MainOfWeek();

    int result;

    result = main.getWorkingHours(String.valueOf(DayOfWeek.FRIDAY));

    if (result <= 0) {
        System.out.println("Сегодня выходной");

    }
    else {System.out.printf("До конца рабочей недели осталось %d часов", result); }
}

public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;


}


public int getWorkingHours (String dayEnum) {

    int result = HOURSOFWEEK - HOURSOFDAY * DayOfWeek.valueOf(dayEnum).ordinal();

    return result;

}

}