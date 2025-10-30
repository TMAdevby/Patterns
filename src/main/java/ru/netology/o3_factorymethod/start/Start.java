package ru.netology.o3_factorymethod.start;

import ru.netology.o3_factorymethod.factory.impl.RussianFactory;
import ru.netology.o3_factorymethod.factory.impl.USAFactory;
import ru.netology.o3_factorymethod.factory.interfaces.TransportFactory;
import ru.netology.o3_factorymethod.transport.interfaces.Aircraft;

public class Start {
    
    private static TransportFactory factory;
    
    public static void main(String[] args) {
      
        if (true){
            factory = new RussianFactory();
        }else{
            factory = new USAFactory();
        }
        
        
        factory.createAircraft();
        factory.createCar();
        
        
    }

}
