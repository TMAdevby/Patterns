package ru.netology.o3_factorymethod.factory.impl;

import ru.netology.o3_factorymethod.factory.interfaces.TransportFactory;
import ru.netology.o3_factorymethod.transport.interfaces.Aircraft;
import ru.netology.o3_factorymethod.transport.impl.aircraft.Boeing747;
import ru.netology.o3_factorymethod.transport.interfaces.Car;
import ru.netology.o3_factorymethod.transport.impl.car.Porsche;

// американские транспортные средства
public class USAFactory implements TransportFactory{

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }

}
