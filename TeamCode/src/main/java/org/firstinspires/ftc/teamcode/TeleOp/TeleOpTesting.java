package org.firstinspires.ftc.teamcode.TeleOp;

import com.acmerobotics.dashboard.config.Config;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.subsystems.Robot;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="TeleOpTesting", group="TeleOp")
@Config
public class TeleOpTesting extends LinearOpMode {
    @Override
    public void runOpMode() {
        Robot walB = new Robot(this);
        // Runs once on init
        Robot.HardwareDevices.headRotation.setPosition(0.5);
        Robot.HardwareDevices.eyeRotation.setPosition(0.5);

        waitForStart();
        // Runs repeatedly
        while (opModeIsActive()) {
            // Runs repeatedly
            double rMotorPower = gamepad1.right_stick_y;
            double lMotorPower = gamepad1.left_stick_y;
            //drive
            walB.drive.setPower(lMotorPower, rMotorPower);
            //head turn
            if (gamepad1.dpad_left) {
                walB.head.servoRoatation(Robot.HardwareDevices.headRotation.getPosition() - 0.002);
            } else if (gamepad1.dpad_right) {
                walB.head.servoRoatation(Robot.HardwareDevices.headRotation.getPosition() + 0.002);
            }
            //eye turn
            if (gamepad1.dpad_down) {
                walB.head.eyeRoatation(Robot.HardwareDevices.eyeRotation.getPosition() - 0.002);
            } else if (gamepad1.dpad_up) {
                walB.head.eyeRoatation(Robot.HardwareDevices.eyeRotation.getPosition() + 0.002);
            }
            //arm up down
            double armPower = gamepad1.right_trigger - gamepad1.left_trigger;

            walB.arm.armPower(armPower);
            //walB.arm.armPosition();

            telemetry.addData("left arm pose", Robot.HardwareDevices.leftArm.getCurrentPosition());
            telemetry.addData("right arm pose", Robot.HardwareDevices.rightArm.getCurrentPosition());
            telemetry.update();
        }
    }
} 