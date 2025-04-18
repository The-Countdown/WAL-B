package org.firstinspires.ftc.teamcode.subsystems;

public class Head extends Robot.HardwareDevices {
    private Robot walB;

    public Head(Robot walB) {
        this.walB = walB;
    }


    public void servoTurn(double servoDegree){
        if (servoDegree > 270) {
            servoDegree = 270;
        } else if (servoDegree < 0) {
            servoDegree = 0;
        }
        Robot.HardwareDevices.headRotation.setPosition(servoDegree / 270);
    }

    public void servoRoatation(double turnTuah){
        if (turnTuah > 1) {
            turnTuah = 1;
        } else if (turnTuah < 0) {
            turnTuah = 0;
        }
        Robot.HardwareDevices.headRotation.setPosition(turnTuah);
    }
    public void eyeRoatation(double eyeTurnTuah) {
        if (eyeTurnTuah > 1) {
            eyeTurnTuah = 1;
        } else if (eyeTurnTuah < 0) {
            eyeTurnTuah = 0;
        }
        Robot.HardwareDevices.eyeRotation.setPosition(eyeTurnTuah);
    }
}
