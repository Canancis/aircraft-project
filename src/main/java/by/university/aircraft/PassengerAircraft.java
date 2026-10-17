package by.university.aircraft;

/**
 * пассажирский самолёт
 */
public class PassengerAircraft extends Aircraft {
    
    /**
     * создаёт пассажирский самолёт
     * 
     * @param numberOfPassengers кол-во пассажиров 
     * @param fuelAmount кол-во топлива
     * @param flightName название рейса
     */
    public PassengerAircraft(int numberOfPassengers, double fuelAmount, String flightName) {
        super(numberOfPassengers, fuelAmount, flightName);
    }
}
