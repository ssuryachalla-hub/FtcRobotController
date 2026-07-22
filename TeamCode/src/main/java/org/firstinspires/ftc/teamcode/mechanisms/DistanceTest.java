package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
public class DistanceTest extends OpMode {
    TestBenchDistance bench = new TestBenchDistance();

    double distance;


    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        distance = bench.getDistance();
        telemetry.addData("Distance", bench.getDistance());

        if (distance < 10) {
            telemetry.addLine("Too Close!");
        }
    }
}
