package ru.netology.o8_state.start;

import ru.netology.o8_state.context.TransformerContext;
import ru.netology.o8_state.state.FireState;
import ru.netology.o8_state.state.MoveState;
import ru.netology.o8_state.state.TransformerState;

public class Main {

    public static void main(String[] args) {

        TransformerContext context = new TransformerContext();
        
        TransformerState stateMove = new MoveState();
        TransformerState stateFire = new FireState();

        context.setState(stateFire);
        context.action();

        context.setState(stateMove);
        context.action();
        
    }
}
