package ru.netology.o4_decorator.objects;

public class Window implements Component{

    @Override
    public void draw() {
        System.out.println("draw window");
    }

}
