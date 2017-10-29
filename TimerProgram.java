//package edu.macalester.comp124.stopWatch;
//import comp124graphics.CanvasWindow;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//
///**
// * This Program will display a stopwatch that can be started and stopped with a
// * button placed at the bottom of the window.
// */
//public class TimerProgram extends CanvasWindow implements ActionListener {
//
//    Boolean running = false;
//
//    // TODO: use a StopWatch instance instead of printing to the console //done
//    TimerClock timerclock = new TimerClock(400, 400);
//
//    Timer timer; // this is used in place of a while(true) loop with a pause
//    public final static int ONE_SECOND = 1000;
//
//    public TimerProgram() {
//        super("timer clock", 500, 200);
//
//        setBackground(Color.cyan);
//        JButton button = new JButton("Start/Stop");
//        button.setSize(200, 40);
//        add(button);
//        button.addActionListener(this);  // for the button
//
//        add(timerclock);
//        setupJavaTimer();
//        timerclock.getAndSetTime();
//    }
//
//    /**
//     * A Timer is used in Java Graphics programs to trigger an
//     * event to occur repeatedly after a certain amount of time.
//     * In our case, we will trigger the event for every second,
//     * and update the current time being displayed when the event
//     * occurs.
//     *
//     * In this event-driven program that contains a JButton for the
//     * user to start and stop the displayed timer, we must use this
//     * code in place of using pause() inside a while(true) loop
//     * as we have done previously.
//     */
//    public void setupJavaTimer() {
//        timer = new Timer(ONE_SECOND, new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                timerclock.decreaseTime();
//                /// /TODO: replace this with an update to the LCD version of the stop watch//call increase time
//                // this version of the code will print out "unix time" which is the number
//                // of seconds since midnight Thursday, 1 January 1970 UTC time zone. This is
//                // how computers track time and will show you that this method is running.
//                //System.out.print("\r"+System.currentTimeMillis()/1000);
//            }
//        });
//    }  // leave the structure of this method declaration intact
//
//    /**
//     * Toggle the current state of the displayed StopWatch.
//     * If the current state of the displayed StopWatch in
//     * this program is "toggled" to 'off', then stop the timer object.
//     * If the current state is 'on' then start the timer.
//     */
//
//    public void actionPerformed(ActionEvent e) {
//
//        String cmd = e.getActionCommand();
//
//        if (cmd.equals("Start/Stop")) {
//
//            timer.start();
//            timerclock.drawTime();
//            timerclock.decreaseTime();
////            if (!running) {
////                timer.start();
////                timerclock.drawTime();
////                timerclock.decreaseTime();
////                running = true;
////
////            } else if (running) {
////                timer.stop();
////                running = false;
////            }
//        }
//    }
//
//    public static void main(String[] args){
//        StopWatchProgram prog = new StopWatchProgram();
//    }
//
//
//}
//
//
//
