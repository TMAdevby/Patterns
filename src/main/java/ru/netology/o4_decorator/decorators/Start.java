package ru.netology.o4_decorator.decorators;

import ru.netology.o4_decorator.objects.Button;
import ru.netology.o4_decorator.objects.Component;
import ru.netology.o4_decorator.objects.TextView;
import ru.netology.o4_decorator.objects.Window;

public class Start {
    
    private static Component window;
    private static Component textView;
    private static Component button;
    
    public static void main(String[] args) {
        
        
        boolean showBorder = true;
        
        if (!showBorder){
            window = new Window();
            textView = new TextView();
            button = new Button();
        }else{
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
            button = new BorderDecorator(new Button());
        }
        
        
        window.draw();
        textView.draw();
        button.draw();
        
        
    }

}
