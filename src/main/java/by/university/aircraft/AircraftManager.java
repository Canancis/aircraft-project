package by.university.aircraft;

import java.util.ArrayList;
import java.util.List;

/**
 * класс для работы со списком воздушных судов
 */
public class AircraftManager {
    
    private List<Aircraft> aircraftList;

    /**
     * Создаёт мнеджер воздушных судов
     */
    public AircraftManager() {
        aircraftList = new ArrayList<>();
    }

    /**
     * Добавляет воздушное судно в список
     * 
     * @param aircraft воздушное судно
     */
    public void addAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    /**
     * выводит самолёты, где кол-во пассажиров меньше заданного
     * 
     * @param maxPassengers максимально кол-во пассажиров 
     */
    public void printByPassengerCount(int maxPassengers) {
        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getNumberOfPassengers() < maxPassengers) {
                System.out.println(
                    aircraft.getFlightName()
                    + "- пассажиров: "
                    + aircraft.getNumberOfPassengers()
                );
            }
        }
    }

    /**
     * выводит самолёты, название рейса для которых начинаются с заданной буквы
     * 
     * @param letter начальная буква названия рейса
     */
    public void printByFlightNameStart(char letter) {
        for (Aircraft aircraft : aircraftList) {
            if (aircraft.getFlightName().startsWith(String.valueOf(letter))) {
                System.out.println(
                    aircraft.getFlightName()
                    + "- пассажиров: "
                    + aircraft.getNumberOfPassengers()
                );
            }
        }
    } 
}
