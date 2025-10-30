package ru.netology.o1_singletone;

public class Start {

    public static void main(String[] args) {
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        
        TestSingleton.getInstance().stop();
    }
}
