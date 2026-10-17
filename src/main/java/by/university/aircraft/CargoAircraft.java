package by.university.aircraft;

/**
 * грузовой самолёт
 */
public class CargoAircraft extends Aircraft {
    
    /**
     * создаёт грузовой самолёт
     * 
     * @param numberOfPassengers кол-во пассажиров 
     * @param fuelAmount кол-во топлива
     * @param flightName название рейса
     */
    public CargoAircraft(int numberOfPassengers, double fuelAmount, String flightName) {
        super(numberOfPassengers, fuelAmount, flightName);
    }
}
