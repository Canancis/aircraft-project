
package by.university.aircraft;

/**
 * Демонстрация работы с воздушными судами.
 */
public class Main {

    /**
     * Точка входа в приложение.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        AircraftManager manager = new AircraftManager();

        PassengerAircraft passengerAircraft =
                new PassengerAircraft(150, 5000, "Minsk-Moscow");

        CargoAircraft cargoAircraft =
                new CargoAircraft(20, 8000, "Berlin-Paris");

        MilitaryAircraft militaryAircraft =
                new MilitaryAircraft(10, 6000, "Minsk-Warsaw");

        manager.addAircraft(passengerAircraft);
        manager.addAircraft(cargoAircraft);
        manager.addAircraft(militaryAircraft);

        System.out.println("Расход топлива:");

        System.out.println(passengerAircraft.getFlightName() + ": "
                + passengerAircraft.calculateFuelConsumption());

        System.out.println(cargoAircraft.getFlightName() + ": "
                + cargoAircraft.calculateFuelConsumption());

        System.out.println(militaryAircraft.getFlightName() + ": "
                + militaryAircraft.calculateFuelConsumption());

        System.out.println("\nСамолёты с количеством пассажиров меньше 100:");
        manager.printByPassengerCount(100);

        System.out.println("\nРейсы, начинающиеся с буквы M:");
        manager.printByFlightNameStart('M');
    }
}