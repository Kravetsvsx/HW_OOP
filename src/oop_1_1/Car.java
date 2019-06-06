package oop_1_1;
/**Реализуйте класс Саг, моделирующий передвижение автомобиля на бензиновом топливе по оси х. Предоставьте методы для
 * передвижения автомобиля на заданное количество километров, заполнения топливного бака заданным количеством литров
 * бензина, вычисления расстояния, пройденного от начала координат, а также уровня топлива в баке. Укажите расход
 * топлива (в л/км) в качестве параметра конструктора данного класса. */
public class Car {

    private double fuel;
    private double distance;
    private double fuelConsumtion;

    public Car(double fuelConsumtion){
        setFuelConsumtion(fuelConsumtion);
    }

    public double carMovement(double roudLength){
    double way = distanceСheck();
    if(roudLength>distanceСheck()) {
        setDistance(getDistance() + distanceСheck());
        setFuel(getFuel() - fuelRequired(distanceСheck()));
        return way;
    }
    else{setDistance(getDistance()+roudLength);
    setFuel(getFuel()-fuelRequired(roudLength));
    return roudLength;
    }

    }
    private double distanceСheck(){
        return getFuelConsumtion()*getFuel();

    }
    public void fillCar(double liters){
        setFuel(getFuel()+liters);
    }

    @Override
    public String toString() {
        return "Car{"+"fuel="+fuel+", distance="+distance+", fuelConsumtion="+fuelConsumtion+'}';
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getFuelConsumtion() {
        return fuelConsumtion;
    }

    public void setFuelConsumtion(double fuelConsumtion) {
        this.fuelConsumtion = fuelConsumtion;
    }
    private double fuelRequired(double roudLength){
        return ((getFuelConsumtion()*roudLength)/100);
    }
}
