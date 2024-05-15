package ru.netology.homeworks;

public class NotFoundExeption extends RuntimeException {
    public NotFoundExeption(int id) {
        super("Товар c id = " + id + " не найден");
    }
}
