package Fan;

public class FanTest {
    public static void main(String[] args) {
        Fan fan=new Fan();
        System.out.println(fan);
        Fan fan1 = new Fan();
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setSpeed(fan1.getHIGH());
        fan1.setOn(true);
        System.out.println(fan1);
        Fan fan2 = new Fan();
        fan2.setColor("blue");
        fan2.setRadius(5);
//        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setOn(false);
        System.out.println(fan2);
    }
}
