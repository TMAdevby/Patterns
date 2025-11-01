package ru.netology.o9_strategy.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
