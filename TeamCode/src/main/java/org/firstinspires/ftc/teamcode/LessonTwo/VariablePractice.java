package org.firstinspires.ftc.teamcode.LessonTwo;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//lesson two!

//typically we are going to use variables of type int, boolean, and double
//might also use strings but only really in the telemetry section

@TeleOp
//PascalCase: classes always start with a capital letter, and the second word
// -- if applicable -- is also uppercase with no space in between
// the two words, following the same rule until the end of the phrase
public class VariablePractice extends OpMode {

    @Override
    public void init() {

        //variables always follow a camelCase method, where the starting
        // letter of the first word is lowercase, and the starting letter
        // of the second word (if applicable) is uppercase, with no space
        // in between the two words; if there are more than two words,
        // the pattern will repeat following on
        int teamNumber = 23014;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String name = "Mihir";

        //here we don't put the second parameter in quotes, because
        //we need the value of the variable and not the variable name
        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor speed", motorSpeed);
        telemetry.addData("Claw state", clawClosed);
        telemetry.addData("Name", name);
    }

    @Override
    public void loop() {

        //practice:
        // * 1. Change the String variable name to your team name
        // * 2. create an int called "motorAngle" and store an angle
        //      between 0 and 180 inside this variable, then display
        //      this inside your init variable

    }
}
