package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Arm extends Robot.HardwareDevices {
    private Robot walB;

    public Arm(Robot walB) {
        this.walB = walB;
    }

    public void armPower(double power) {
        Robot.HardwareDevices.leftArm.setPower(power);
        Robot.HardwareDevices.rightArm.setPower(power);
    }

    public void setPosition(int pose) {
        Robot.HardwareDevices.leftArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Robot.HardwareDevices.rightArm.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        Robot.HardwareDevices.leftArm.setTargetPosition(pose);
        Robot.HardwareDevices.rightArm.setTargetPosition(pose);
        Robot.HardwareDevices.leftArm.setPower(1);
        Robot.HardwareDevices.rightArm.setPower(1);
    }
}