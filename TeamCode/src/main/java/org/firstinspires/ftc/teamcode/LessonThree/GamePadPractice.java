package org.firstinspires.ftc.teamcode.LessonThree;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//general button notes:
// * there are two sensor types for buttons on the controller: analog sensors and digital sensors
// * this means some buttons give you a range of values and some will give you boolean values
// * any of the colored buttons on the right will be analog sensors (they give true when pressed and when released they give false)
// * the d-pad on the left will also give you such results: there are four directions (left, up, right, down), and it is of an analog sensor (either true when pressed or false when depressed)
// * there are also two bumpers at the top, and these will give you true or false values
// * there are two buttons in the middle, the start and the back button (start will be on the left while back will be on the right
// * since we have a logitech g310 as our controller, we also have to consider the switch on the underside of the controller,
//   which will have two settings: d-mode and x-mode (we want x-mode to be enabled at all times)
// * there are also two triggers on the back of the controller underneath the top bumpers, and these will be of a digital value,
//   allowing half values and any value between 0 and 1
// * the two joysticks will also have analog sensors, and they each actually have two analog axes in the x and y direction
//   ** moving the joystick all the way up will yield y = -1 while moving it all the way down will yield y = 1
//   ** moving the joystick all the way to the left will yield x = -1, while moving it all the way to the right will yield x = 1
// * all of these buttons and joysticks will be named in snake case (ex. the right joystick will have components named as "right_stick_y" and "right_stick_x")
// * also, you can press down on the left and right joysticks

@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        //runs 50x a second

        //when you are picking which gamepad, the starting combination will help determine which gamepad you must select
        // start + a means controller 1, which is gamepad1
        // start + b means controller 2, which is gamepad2
        // gamepad1 will be for movement
        // gamepad2 will be for game functions like shooting, etc.
        // so when you have to write code, consider what functionality you are writing code for and which controller that would apply to
        telemetry.addData("x", gamepad1.left_stick_x);
        telemetry.addData("y", gamepad1.left_stick_y);
        telemetry.addData("a", gamepad1.a);
    }
}
