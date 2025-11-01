package ru.netology.o9_strategy.start;

import ru.netology.o9_strategy.auth.UserChecker;
import java.io.File;
import ru.netology.o9_strategy.strategy.DBAuth;
import ru.netology.o9_strategy.strategy.FileAuth;


public class Main {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        
        userChecker.check(new DBAuth("jdbc://etc"));
        
        userChecker.check(new FileAuth(new File("c:\\file.txt")));
        
    }
}
