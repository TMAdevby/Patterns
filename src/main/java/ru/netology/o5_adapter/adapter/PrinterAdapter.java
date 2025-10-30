package ru.netology.o5_adapter.adapter;

import java.util.List;
import ru.netology.o5_adapter.objects.Printer;

// адаптер, который совмещает желание клиента и возможности принтера
public class PrinterAdapter implements PageListPrinter{

    private Printer printer = new Printer();
    
    @Override
    public void print(List<String> list) {
        for (String text : list) {
            printer.print(text);            
        }
    }
 
}
