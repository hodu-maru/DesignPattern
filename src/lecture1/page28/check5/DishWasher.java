package lecture1.page28.check5;

public class DishWasher extends HomeAppliancies{
    @Override
    public void turnOn() {
        System.out.println("dishWasher on");
    }

    @Override
    public void turnOff() {
        System.out.println("dishWasher off");
    }
}
