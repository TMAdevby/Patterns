package ru.netology.o3_factorymethod.factory.impl;

import ru.netology.o3_factorymethod.factory.interfaces.TransportFactory;
import ru.netology.o3_factorymethod.transport.interfaces.Aircraft;
import ru.netology.o3_factorymethod.transport.interfaces.Car;
import ru.netology.o3_factorymethod.transport.impl.car.Niva;
import ru.netology.o3_factorymethod.transport.impl.aircraft.TU134;

// российские транспортные средства
public class RussianFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
