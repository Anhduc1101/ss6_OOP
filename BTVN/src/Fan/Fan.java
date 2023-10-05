package Fan;

import static java.awt.Color.blue;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int HIGH = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;


    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getHIGH() {
        return HIGH;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (isOn()) {
            return "Fan{" +
                    "speed=" + this.speed +
                    ", status=" + "fan is on" +
                    ", radius=" + this.radius +
                    ", color='" + this.color + '\'' +
                    '}';
        } else {
            return "Fan{" +

                    " status=" + "fan is off" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';

        }
    }
}

