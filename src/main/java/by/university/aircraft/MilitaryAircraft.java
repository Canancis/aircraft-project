package by.university.aircraft;

/**
 * военный самолёт
 */
public class MilitaryAircraft extends Aircraft {
    
    /**
     * создаёт военный самолёт
     * 
     * @param numberOfPassengers кол-во пассажиров 
     * @param fuelAmount кол-во топлива
     * @param flightName название рейса
     */
    public MilitaryAircraft(int numberOfPassengers, double fuelAmount, String flightName) {
        super(numberOfPassengers, fuelAmount, flightName);
    }
}
