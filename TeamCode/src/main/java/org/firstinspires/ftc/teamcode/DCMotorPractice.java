package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench1;
import org.firstinspires.ftc.teamcode.mechanisms.TestBench;
@TeleOp
public class DCMotorPractice extends OpMode {
    TestBench1 bench = new TestBench1();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }


    @Override
    public void loop() {
        if (bench.is)
        bench.setMotorSpeed(0.5);
        telemetry.addData("Motor Revs", bench.getMotorRevs());

    }
}
