package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;

/**
 * Created by ishanarya on 1/10/18.
 */

@TeleOp(name = "ColorTest")
public class ColorTest extends OpMode {

    private ColorSensor color;

    @Override
    public void init() {
        color = hardwareMap.colorSensor.get("color");
    }

    @Override
    public void loop() {


        telemetry.addData("Alpha", color.alpha());
        telemetry.addData("Red", color.red());
        telemetry.addData("Green", color.green());
        telemetry.addData("Blue", color.blue());
        telemetry.addData("ARGB", color.argb());

    }
}
