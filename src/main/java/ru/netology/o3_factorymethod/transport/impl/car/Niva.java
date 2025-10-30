package ru.netology.o3_factorymethod.transport.impl.car;

import ru.netology.o3_factorymethod.transport.interfaces.Car;

public class Niva implements Car{

    @Override
    public void drive() {
        System.out.println("Niva drive");
    }

    @Override
    public void stop() {
        System.out.println("Niva stopped");
    }
    
}
