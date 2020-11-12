package com.features;

public class SwitchEnhancements {

    public static void main(String[] args) {
        int choice = 2;

        switch (choice) {
            case 1,2,3:
                System.out.println(choice);
                break;
            default:
                System.out.println("Integer is greater then 3");
        }

        int x = switch (choice) {
            case 1,2,3:
                yield choice;
            default:
                yield -1;
        };
        System.out.println(x);

        SwitchEnhancements se = new SwitchEnhancements();
        System.out.println(se.getDay(Day.MON));
    }

    enum Day {
        SUN, MON, TUE
    };

    @SuppressWarnings("preview")
    public String getDay(Day d) {
        String day = switch (d) {
            case SUN -> "Sunday";
            case MON -> "Monday";
            case TUE -> "Tuesday";
        };
        return day;
    }

}
