package org.firstinspires.ftc.teamcode.LessonOne;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


//lesson one!


//sensing-thinking-acting: they sense their environment, they think about what they sensed, and they act on their thoughts

//common problems:
// * java is case-sensitive!!
// * the computer completely
// ignores white space, so you
// have a little freedom formatting
// code to make it look nice
// *

/*
* 1. Hello, World: change the telemetry data to display "Hello: Your Name"
*
* 2. Try running all this code in the Autonomous section
* of your driver station rather than the TeleOp
*
*
* */

//opmode: stuff like teleop and opmode, types of code running based on cicrumstance

/*5 very useful methods:

* init(): runs once when driver presses INIT
*
* loop(): run repeatedly when driver presses PLAY but before driver presses STOP
*
* init_loop(): less common, but runs when driver presses INIT in that time before they press PLAY
*
* start(): this runs one time when the driver presses PLAY
*
* stop(): this runs one time when the driver presses STOP
*
*/

//on the control hub, this button will be the big circular one, and in order to start a program,
//you must press it twice; first press runs init(), init_loop() and second press runs loop() and
//start()

//this class is a child class of OpMode
@TeleOp
public class CodingReferenceLessonOne extends OpMode {

    //every teleop needs one of these, cause we are
    // overwriting the default init() method from
    // the OpMode class
    @Override
    public void init() {

        //this makes stuff show up on the screen thingy mihir talked about
        //you can also run stuff using telemetry, like functions to turn and whatnot, etc.
        telemetry.addData("hello", "world");
    }

    //every teleop needs one of these, cause we are
    // overwriting the default loop() method from
    // the OpMode class
    @Override
    public void loop() {



    }

}
