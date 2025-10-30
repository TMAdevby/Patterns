package ru.netology.o3_factorymethod.transport.impl.aircraft;

import ru.netology.o3_factorymethod.transport.interfaces.Aircraft;

public class TU134 implements Aircraft{

    @Override
    public void flight() {
        System.out.println("TU-134 flight!");
    }

    
    
}
