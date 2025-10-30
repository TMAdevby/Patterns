package ru.netology.o3_factorymethod.factory.interfaces;

import ru.netology.o3_factorymethod.transport.interfaces.Aircraft;
import ru.netology.o3_factorymethod.transport.interfaces.Car;

// фабрика по созданию транспортных средств
public interface TransportFactory {
    
    // что фабрика будет производить
    
    Car createCar();// автомобили
    
    Aircraft createAircraft(); // самолеты

}
