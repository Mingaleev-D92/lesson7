package ru.innopolis.university.mingaleev.homework_3_7;

public enum Drinks {
    SPRITE(50),
    FANTA(60),
    MIRINDA(70);


    private int price;

    Drinks(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

