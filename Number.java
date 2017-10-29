package edu.macalester.comp124.stopWatch;

import comp124graphics.GraphicsGroup;
import comp124graphics.Rectangle;

/**
 * Created by shoop on 2/10/15 modified by Lisa on 2/16/17
 * This is a graphics group which represents a number that can be added
 * Acknowledgements: Daniel Kluver, Jonathan Scott
 */
public class Number extends GraphicsGroup { //Number class is a Graphics group. Graphics group is a graphics object
    // constants
    // 8 wide by 10 high blocks of small squares are the frame
    // for each number.
    private final int NUM_HORIZ_DOTS = 8;
    private final int NUM_VERT_DOTS = 10;

    // Each square is 5 pixels by 5 pixels (can experiment with
    // this value)
    private final int DOT_SIZE = 5;

    //Space between dots
    private final int DOT_SPACING = 2;

    private final double WIDTH = (double) (NUM_HORIZ_DOTS * (DOT_SIZE + DOT_SPACING));
    private final double HEIGHT = (double) (NUM_VERT_DOTS * (DOT_SIZE + DOT_SPACING));

    /**
     * Constructor for a number object
     * @param x X position of group in canvas space (each group has it's own local coordinate system), but this is
     *          the x coordinate of the canvas where the group is to be added
     * @param y X position of group in canvas space (each group has it's own local coordinate system), but this is
     *          the x coordinate of the canvas where the group is to be added
     */

    public Number(double x, double y) {
        super(x, y);
    }

    /**
     * Getter for the number width
     *
     * @return width of this number in pixels
     */
    public double getWidth() {
        return WIDTH;
    }

    /**
     * Getter for the number height
     *
     * @return height in pixels
     */
    public double getHeight() {
        return HEIGHT;
    }

    /**
     * Draws a rectangle dot at the indicated position
     * @param horizDotPos Horizontal offset in dot units
     * @param vertDotPos  vertical offset in dot units
     */
    private void drawDot(int horizDotPos, int vertDotPos) {
        if (horizDotPos > NUM_HORIZ_DOTS) {
            System.out.println("Programmer error: horizDotPos too large");
        }
        if (vertDotPos > NUM_VERT_DOTS) {
            System.out.println("Programmer error: vertDotPos too large");
        }
        // Determine the pixel locations for the upper left corner of the dot
        double dotPosX = (horizDotPos * (DOT_SIZE + DOT_SPACING));
        double dotPosY = (vertDotPos * (DOT_SIZE + DOT_SPACING));

        Rectangle blackBoxes = new Rectangle(dotPosX, dotPosY, DOT_SIZE, DOT_SIZE);
        blackBoxes.setFilled(true);
        add(blackBoxes);
    }

    /**
     **
     * This method is called drawNumber that takes in an integer as its input. It is a switch statement, and it draws the
     * number that was entered in the parameter. The possible ints are zero to ten. The default (if the input is not
     * in the range of zero to ten), it prints to the console that there is an error.
     */
    public void drawNumber(int number) {
        switch (number) {
            case 0:
                drawZero();
                break;
            case 1:
                drawOne();
                break;
            case 2:
                drawTwo();
                break;
            case 3:
                drawThree();
                break;
            case 4:
                drawFour();
                break;
            case 5:
                drawFive();
                break;
            case 6:
                drawSix();
                break;
            case 7:
                drawSeven();
                break;
            case 8:
                drawEight();
                break;
            case 9:
                drawNine();
                break;
            case 10:
                drawColon();
                break;
            default:
                System.out.println("Invalid input, this method takes in integers");
                return;
        }
    }

    /**
     * Draws a colon character
     */
    private void drawColon() {
        drawDot(3, 4);
        drawDot(3, 5);
        drawDot(3, 9);
        drawDot(3, 8);
    }

    /**
     * Draws a zero character
     */
    private void drawZero() {
        drawDot(2, 3);
        drawDot(2, 4);
        drawDot(2, 5);
        drawDot(2, 6);
        drawDot(2, 7);
        drawDot(2, 8);

        drawDot(6, 3);
        drawDot(6, 4);
        drawDot(6, 5);
        drawDot(6, 6);
        drawDot(6, 7);
        drawDot(6, 8);

        drawDot(3, 2);
        drawDot(4, 2);
        drawDot(5, 2);

        drawDot(3, 9);
        drawDot(4, 9);
        drawDot(5, 9);
    }

    /**
     * Draws a one
     */
    private void drawOne() {
        drawDot(2, 3);
        drawDot(3, 2);
        drawDot(3, 3);
        drawDot(3, 4);
        drawDot(3, 5);
        drawDot(3, 6);
        drawDot(3, 7);
        drawDot(3, 8);
        drawDot(3, 9);
        drawDot(2, 9);
        drawDot(4, 9);
    }

    /**
     * Draws a two
     */
    private void drawTwo() {
        drawDot(2, 3);
        drawDot(3, 2);
        drawDot(4, 2);
        drawDot(5, 2);
        drawDot(6, 3);
        drawDot(6, 4);
        drawDot(5, 5);
        drawDot(4, 6);
        drawDot(3, 7);
        drawDot(2, 8);
        drawDot(2, 9);
        drawDot(3, 9);
        drawDot(4, 9);
        drawDot(5, 9);
        drawDot(6, 9);
    }

    /**
     * Draws the common bottom half of the numbers 5, 6, and 8
     */
    private void drawBottomNum() {
        drawDot(6, 6);
        drawDot(6, 7);
        drawDot(6, 8);
        drawDot(5, 9);
        drawDot(4, 9);
        drawDot(3, 9);
        drawDot(2, 8);
    }

    /**
     * Draws the common middle line for numbers such as 8
     */
    private void drawMiddleLine() {
        drawDot(3, 5);
        drawDot(4, 5);
        drawDot(5, 5);
    }

    /**
     * Draws the top curve for numbers like 3, 8, and 9
     */
    private void drawTopCurve() {
        drawDot(2, 3);
        drawDot(3, 2);
        drawDot(4, 2);
        drawDot(5, 2);
        drawDot(6, 3);
        drawDot(6, 4);
    }

    /**
     * Draws the line accross the top of numbers like 8
     */
    private void drawTopLine() {
        drawDot(2, 2);
        drawDot(3, 2);
        drawDot(4, 2);
        drawDot(5, 2);
    }

    /**
     * Draws a 3
     */
    private void drawThree() {
        // top half
        drawTopCurve();

        //stem
        drawDot(5, 5);
        drawDot(4, 5);

        drawBottomNum();
    }

    /**
     * Draws a 4
     */
    private void drawFour() {
        // mid line 2,6  to 6,6
        drawDot(2, 6);
        drawDot(3, 6);
        drawDot(4, 6);
        drawDot(5, 6);
        drawDot(6, 6);

        // vert line 5,2  to 5,9
        for (int i = 2; i < 10; i++) {
            drawDot(5, i);
        }

        // diagonal
        drawDot(4, 3);
        drawDot(3, 4);
        drawDot(2, 5);
    }

    /**
     * Draws a 5
     */
    private void drawFive() {
        //top line
        drawTopLine();

        //stem
        drawDot(2, 3);
        drawDot(2, 4);
        drawDot(2, 5);

        // middle line
        drawMiddleLine();

        drawDot(3, 5);
        drawDot(3, 5);
        drawDot(5, 5);
        // bottom curve
        drawBottomNum();
    }

    /**
     * Draws a 6
     */
    private void drawSix() {
        // top piece
        drawDot(5, 2);
        drawDot(4, 2);
        drawDot(3, 3);
        //side line
        drawDot(2, 4);
        drawDot(2, 5);
        drawDot(2, 6);
        drawDot(2, 7);
        drawDot(2, 8);

        // middle line
        drawMiddleLine();

        // bottom curve
        drawBottomNum();
    }

    /**
     * Draws a 7
     */
    private void drawSeven() {
        //top line
        drawTopLine();

        //diagonal
        drawDot(6, 3);
        drawDot(5, 4);
        drawDot(5, 5);
        drawDot(4, 6);
        drawDot(4, 7);
        drawDot(3, 8);
        drawDot(3, 9);
    }

    /**
     * Draws an 8
     */
    private void drawEight() {

        drawBottomNum();
        drawMiddleLine();

        drawDot(2, 4);
        drawDot(2, 3);

        drawDot(3, 2);
        drawDot(4, 2);
        drawDot(5, 2);

        drawDot(6, 3);
        drawDot(6, 4);

        drawDot(2, 6);
        drawDot(2, 7);
    }

    /**
     * Draws a 9
     */
    private void drawNine() {
        //top half
        drawTopCurve();
        drawDot(2, 4);
        drawDot(2, 5);
        drawDot(6, 5);

        //mid section
        drawDot(3, 6);
        drawDot(4, 6);
        drawDot(5, 6);
        drawDot(6, 6);

        //bottom curve
        drawDot(6, 7);
        drawDot(5, 8);
        drawDot(4, 9);
        drawDot(3, 9);
    }
}