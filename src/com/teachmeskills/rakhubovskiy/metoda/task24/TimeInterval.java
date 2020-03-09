package com.teachmeskills.rakhubovskiy.metoda.task24;

public class TimeInterval {

    private long seconds;
    private long minutes;
    private long hours;

    public TimeInterval(long seconds){
        this.seconds = seconds;
    }

    public TimeInterval(long hours, long minutes, long seconds) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public long getTotalNumberOfSeconds (){
        long total = (hours * 3600) + (minutes * 60) + seconds;
        return total;
    }

    public Integer compareTimeInterval(long totalNumberOfSeconds){
        if (seconds < totalNumberOfSeconds){
            return -1;
        } else if (seconds > totalNumberOfSeconds){
            return 1;
        } else {
            return 0;
        }
    }

    public static void printInfo(long totalSeconds1, long totalSeconds2, int t){
        System.out.printf("Промежуток времени %d c %n", totalSeconds1);
        System.out.printf("Промежуток времени %d c %n", totalSeconds2);
        if (t < 0){
            System.out.printf("%d < %d", totalSeconds1, totalSeconds2);
        } else if (t > 0){
            System.out.printf("%d > %d", totalSeconds1, totalSeconds2);
        } else {
            System.out.printf("%d = %d", totalSeconds1, totalSeconds2);
        }
    }
}
