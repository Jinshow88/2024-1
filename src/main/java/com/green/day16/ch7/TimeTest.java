package com.green.day16.ch7;

public class TimeTest {
    public static void main(String[] args){
        Time time = new Time(12,13,14);
        System.out.printf("hour : %d\n", time.getHour());
        time.setHour(22);
        System.out.printf("hour : %d\n", time.getHour());

    }
}


class Time{//private <<<< 캡슐화, 은닉화 : 클래스를 벗어날 수 없다.
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    public void setHour(int hour){
        this.hour = hour;
    }

    public void setSecond(int second){
        this.second = second;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }






}
