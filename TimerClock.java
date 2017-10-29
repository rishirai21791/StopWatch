//package edu.macalester.comp124.stopWatch;
//
//import comp124graphics.GraphicsGroup;
//import javafx.scene.paint.Stop;
//import org.junit.rules.Stopwatch;
//
//import java.util.Scanner;
//
///**
// * Created by Lisa on 16/02/17.
// */
//public class TimerClock extends StopWatch { //Allows user to input a time (in main method)
//
//    private static int timerHr1;
//    private static int timerHr2;
//    private static int timerMn1;
//    private static int timerMn2;
//    private static int timerSec1;
//    private static int timerSec2;
//
//    public void decreaseTime() {
//        removeTime();
//        newdecreaseTime();
//        drawTime();
//    }
//
//    public TimerClock(double upLeftX, double upLeftY) {
//        super(upLeftX, upLeftY);
//    }
//
//    public void getAndSetTime() {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is the hour you would like to set for the timer? (0-59)");
//        System.out.println(">> ");
//        int timerHour = scanner.nextInt();
//        timerHr1 = timerHour % 10;
//        timerHr2 = timerHour / 10;
//
//        System.out.println("What is the minute you would like to set for the timer? (0-59)");
//        System.out.println(">> ");
//        int timerMinute = scanner.nextInt();
//        timerMn1 = timerMinute % 10;
//        timerMn2 = timerMinute / 10;
//
//        System.out.println("What is the second you would like to set for the timer? (0-59)");
//        System.out.println(">> ");
//        int timerSecond = scanner.nextInt();
//        timerSec1 = timerSecond % 10;
//        timerSec2 = timerSecond / 10;
//
//        initialTime(timerHr1, timerHr2, timerMn1, timerMn2, timerSec1, timerSec2);
//
//    }
//
////    public static void main(String[] args) {
////        TimerClock timer = new TimerClock(100, 100);
////        timer.getTime();
////        timer.initialTime(timerHr1, timerHr2, timerMn1, timerMn2, timerSec1, timerSec2);
////        timer.decreaseTime();
////
////    }
//}
//
//
