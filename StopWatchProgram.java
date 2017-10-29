package edu.macalester.comp124.stopWatch;
import comp124graphics.CanvasWindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Lisa on 12/02/2017
 * This Program will display a stopwatch that can be started and stopped with a
 * button placed at the bottom of the window.
 * Acknowledgements: Daniel Kluver
 */
public class StopWatchProgram extends CanvasWindow implements ActionListener {

    Boolean running = false;

    StopWatch stopwatch = new StopWatch(); //creates an instance of the stopwatch class (object name is stopwatch)

    Timer timer;
    public final static int ONE_SECOND = 1000;

    /**
     * Constructor: this constructs the StopWatchProgram, and it sets the background color, adds buttons and adds the
     * stopwatch object, initializes the time to 0,0,0 and sets up the timer.
     */
    public StopWatchProgram() {
        super("Stop Watch", 500, 200);

        setBackground(Color.cyan);
        JButton button = new JButton("Start/Stop");
        button.setSize(200, 40);
        add(button);
        button.addActionListener(this);  // for the button

        add(stopwatch);
        setupJavaTimer();
        stopwatch.initialTime(0, 0, 0);
    }

    /**
     * A Timer is used in Java Graphics programs to trigger an
     * event to occur repeatedly after a certain amount of time.
     * In our case, we will trigger the event for every second,
     * and update the current time being displayed when the event
     * occurs.
     *
     * In this event-driven program that contains a JButton for the
     * user to start and stop the displayed timer, we must use this
     * code in place of using pause() inside a while(true) loop
     * as we have done previously.
     */
    public void setupJavaTimer() {
        timer = new Timer(ONE_SECOND, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                stopwatch.increaseTime();
            }
        });
    }
    /**
     * If the current state of the displayed StopWatch in this program is changed to 'off', then it stops the timer object
     * If the current state of the displayed StopWatch in this program is changed to 'on', then it starts the timer object
     * This is done through if statements (if the boolean running is false, then it starts the timer and if the boolean
     * running is true, then it stops the timer every time the button "Start/Stop" is pressed).
     */

    public void actionPerformed(ActionEvent e) {

        String cmd = e.getActionCommand();

        if (cmd.equals("Start/Stop")) {
            if (!running) {
                timer.start();
                stopwatch.startTime();
                running = true;

            } else if (running) {
                timer.stop();
                running = false;
            }
        }
    }

    /**
     * Main method, which creates an instance of the StopWatchProgram (the object name is prog).
     */
    public static void main(String[] args){
        StopWatchProgram prog = new StopWatchProgram();
    }
}