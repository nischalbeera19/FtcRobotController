package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


//common problems:
// *  java is case-sensitive
// * 
@TeleOp
public class HelloWorld extends OpMode {

    //every teleop needs one of these
    @Override
    public void init() {

        //this makes stuff show up on the screen thingy mihir talked about
        telemetry.addData("hello mihir", "world");

    }

    //every teleop needs one of these
    @Override
    public void loop() {



    }

}
