package edu.macalester.comp124.stopWatch;
import comp124graphics.GraphicsGroup;

/**
 * Created by Lisa on 12/02/17.
 * This class is a GraphicsGroup, and it represents a stopwatch with the hours, minutes and seconds values drawn as a graphics group.
 * It also has a method to increase time (increase seconds, and how to represent that change in the graphics group) and set the initial
 * timer of the stop watch.
 * Acknowledgements: Anja, Daniel Kluver, Jonathan, Giang
 */

public class StopWatch extends GraphicsGroup {

    //Number objects which represents a single digit or colon in the stopwatch.
    private Number hour1Number; //The number object which is the first number of the hour
    private Number hour2Number; //The number object which is the second number of the hour
    private Number colon1Number; //The number object which is the colon between the hours and minutes
    private Number min1Number; //The number object which is the first number of the minutes
    private Number min2Number; //The number object which is the second number of the minutes
    private Number colon2Number; //The number object which is the colon between the hours and minutes
    private Number sec1Number; //The number object which is the first number of hte seconds
    private Number sec2Number; //The number object which is the second number of the seconds

    private int hours; //An int, which is the hour
    private int minutes; //An int, which is the minutes
    private int seconds; //An int, which is the seconds

    private int hr1Num; //An int, which is the first digit of the hour
    private int hr2Num; //An int, which is the second digit of the hour
    private int mn1Num; //An int, which is the first digit of the minutes
    private int mn2Num; //An int, which is the second digit of the minutes
    private int sc1Num; //An int, which is the first digit of the seconds
    private int sc2Num; //An int, which is the second digit of the seconds

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    /**
     * Constructor for the StopWatch: The different Number objects corresponding to the different digits of the stopwatch
     * are added to a graphics group. It places each digit (number object) in its right position relative to the stopwatch
     * graphics group.
     *
     * @param upLeftX The x coordinate of the canvas where the group is to be added (upper left x)
     * @param upLeftY The y coordinate of the canvas where the group is to be added (upper left y)
     */
    public StopWatch(double upLeftX, double upLeftY) {
        super(upLeftX, upLeftY);
        hour1Number = new Number(upLeftX, upLeftY);
        add(hour1Number);
        hour2Number = new Number(upLeftX + 40, upLeftY);
        add(hour2Number);
        colon1Number = new Number(upLeftX + 80, upLeftY);
        add(colon1Number);
        min1Number = new Number(upLeftX + 120, upLeftY);
        add(min1Number);
        min2Number = new Number(upLeftX + 160, upLeftY);
        add(min2Number);
        colon2Number = new Number(upLeftX + 200, upLeftY);
        add(colon2Number);
        sec1Number = new Number(upLeftX + 240, upLeftY);
        add(sec1Number);
        sec2Number = new Number(upLeftX + 280, upLeftY);
        add(sec2Number);
    }

    /**
     * Default constructor
     */
    public StopWatch() {
        this(40, 40);
    }

    /**
     * This method drawTime() draws the current time (according to the hours/minutes/seconds) by drawing each corresponding
     * number to the respective digit's number object.
     */
    public void drawTime() { //Method, which draws the current time
        hr1Num = hours/10;
        hour1Number.drawNumber(hr1Num);
        hr2Num = hours%10;
        hour2Number.drawNumber(hr2Num);
        colon1Number.drawNumber(10);
        mn1Num = minutes/10;
        min1Number.drawNumber(mn1Num);
        mn2Num = minutes%10;
        min2Number.drawNumber(mn2Num);
        colon2Number.drawNumber(10);
        sc1Num = seconds/10;
        sec1Number.drawNumber(sc1Num);
        sc2Num = seconds%10;
        sec2Number.drawNumber(sc2Num);
    }

    /**
     * This method removeTime() removes all of the number objects from the graphics group. This is most used to clear the
     * time for the updated time to be drawn.
     */
    public void removeTime() {
        hour1Number.removeAll();
        hour2Number.removeAll();
        min1Number.removeAll();
        min2Number.removeAll();
        sec1Number.removeAll();
        sec2Number.removeAll();
    }

    /**
     * This method increaseTime() calls the removeTime() method, which first clears the time in stopwatch by removing all
     * of th enumber objects from the graphics group, then it calls the numIncreaseTime method to increase the number of
     * seconds (int), and then draws the new number objects which correspond to the new int back into the stopwatch.
     */
    public void increaseTime() {
        removeTime();
        intIncreaseTime();
        drawTime();
    }

    /**
     * This method intIncreaseTime() increases the integers (seconds, minutes, hours). It also has if and else statements
     * so that if the seconds reaches 59 seconds, it rolls over to an additional minute and sets the seconds to zero. If
     * the time exceeds 59:59:59, it does not increase it, and instead prints to the console that the timer does not
     * exceed 59:59:59.
     */
    public void intIncreaseTime() {

        if (((hours<59)||(minutes<59)||(seconds<59))&&(hours<60)) {
            seconds++;
            if (seconds>59) {
                minutes++;
                seconds = 0;
            } if (minutes > 59) {
                hours++;
                minutes = 0;
            }
        } else {
            System.out.println("This timer does not exceed 59:59:59 ");
        }
    }

    /**
     * This method initialTime() takes in the desired hour, min and sec and sets up the stopwatch such that that specific
     * time is drawn (the numbers are added) and represented in the graphics group.
     * @param hour
     * @param min
     * @param sec
     */
    public void initialTime(int hour, int min, int sec) {
        hours = hour;
        minutes = min;
        seconds = sec;
        drawTime();
    }

    /**
     * This method startTime() will draw the time, then increase the time through calling the increaseTime() function.
     */
    public void startTime() {
        drawTime();
        increaseTime();
    }
}