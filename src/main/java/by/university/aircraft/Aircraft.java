package by.university.aircraft;

/**
 * Базовый класс для представления воздушного судна
 */
public class Aircraft {
    
    private int numberOfPassengers;
    private double fuelAmount;
    private String flightName;
    private FuelConsumption fuelConsumption;

    /**
     * Создаёт воздушное судно
     *
     * @param numberOfPassengers количество пассажиров 
     * @param fuelAmount количество топлива
     * @param flightName название рейса
     */
    public Aircraft(int numberOfPassengers, double fuelAmount, String flightName) {
        this.numberOfPassengers = numberOfPassengers;
        this.fuelAmount = fuelAmount;
        this.flightName = flightName;
        this.fuelConsumption = new FuelConsumption(); 
    }

    /**
     * рассчитывает расход топлива на 1-го пассажира
     * 
     * @return расход топлива на 1-го пассажира
     */
    public double calculateFuelConsumption() {
        return fuelConsumption.calculate(fuelAmount, numberOfPassengers);
    }

    /**
     * возвращает кол-во пассажиров
     * 
     * @return кол-во пассажиров
     */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    /**
     * возвращает название рейса
     * 
     * @return название рейса
     */
    public String getFlightName() {
        return flightName;
    }
}
