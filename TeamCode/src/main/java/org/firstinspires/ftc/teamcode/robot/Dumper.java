package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

/**
 * This class implements the robotic function for the dumper which the dumps the mineral(s) into
 * the lander.
 * @author Henry
 * @version 1.0
 */
public class Dumper {

    public static final double MIN_POSITION = 0.0;
    public static final double MAX_POSITION = 1.0;

    private Servo servoDumper;

    public void init(HardwareMap hwMap) {
        servoDumper = hwMap.get(Servo.class, "servo_dumper");
        //servoDumper.setPosition(0.5);
    }

    public void setPosition(double position) {
        servoDumper.setPosition(position);
    }

    public Servo getServoDumper() {
        return servoDumper;
    }
}
