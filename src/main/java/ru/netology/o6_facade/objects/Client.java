package ru.netology.o6_facade.objects;

import facade.CarFacade;
import ru.netology.o6_facade.parts.Door;
import ru.netology.o6_facade.parts.Wheel;
import ru.netology.o6_facade.parts.Zazhiganie;

public class Client {

    public static void main(String[] args) {
        // вызов без фасада
        Door door = new Door();
        door.open();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();
        
        Wheel wheel = new Wheel();
        wheel.turn();
        

        // вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();



    }
}
