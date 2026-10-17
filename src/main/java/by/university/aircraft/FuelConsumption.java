package by.university.aircraft;

/**
 * Класс для расчёта расхода топлива
 */
public class FuelConsumption {
    /**
     * Рассчитывает расход топлива на одного пассажира
     * 
     * @param fuelAmount кол-во топлива
     * @param numberOfPassengers кол-во пассажиров
     * @param fuelAmount топливо на 1-го пассажира
     */
    public double calculate(double fuelAmount, int numberOfPassengers) {
        if (numberOfPassengers == 0) {
            return 0;
        }

        return fuelAmount / numberOfPassengers;
    }
}
