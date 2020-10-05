package oopChallenge;

public class SedanCar extends Car{
        private boolean steering;   // steering at default set to False
        private int gear;   // gear has 5 speed option

    public SedanCar(int size, int tyres, int doors, boolean steering,
                    int gear) {
        super(size, tyres, doors);
        this.steering = steering;
        this.gear = gear;
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        if ( speed == 0){
            System.out.println("Sedan car is stopped.");
        }else if (speed >= 5){
            System.out.println("Sedan car is moving.");
        }else
            System.out.println("Invalid gear selection");
    }

    public boolean startCar(){
        steering = true;
        System.out.println("Engine is on");
        return true;
    }

    public void selectGear(int gear){
        switch (gear){
            case 1:
                System.out.println("Gear 1");
                break;
            case 2:
                System.out.println("Gear 2");
                break;
            case 3:
                System.out.println("Gear 3");
                break;
            case 4:
                System.out.println("Gear 4");
                break;
            case 5:
                System.out.println("Gear 5");
                break;
            default:
                System.out.println("Invalid selection");
        }
    }
}
