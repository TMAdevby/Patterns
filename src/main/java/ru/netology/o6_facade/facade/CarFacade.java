package facade;

// фасад для работы 
import ru.netology.o6_facade.parts.Door;
import ru.netology.o6_facade.parts.Wheel;
import ru.netology.o6_facade.parts.Zazhiganie;

public class CarFacade {

    private Door door = new Door();
    private Zazhiganie zazhiganie = new Zazhiganie();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        zazhiganie.fire();
        wheel.turn();
    }
    
        
    
}
