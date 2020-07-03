package ru.innopolis.university.mingaleev.homework_3_7;

import java.util.Scanner;

public class Menu {
    public static int money = 0;

    public static void main(String[] args) throws Exception {

        System.out.println("Меню : ");
        for (Drinks drink : Drinks.values()) {
            System.out.print(drink + " ");
            System.out.println(drink + " рублей");

        }
        System.out.println();

        Scanner inputScanner = new Scanner(System.in);
        String usernameDrink;
        System.out.println("Выберите один из напитков");
        usernameDrink = inputScanner.nextLine();

        Menu menu = new Menu();

        switch (usernameDrink) {
            case ("SPRITE"):
                menu.inc(50);
                break;
            case ("FANTA"):
                menu.inc(60);
                break;
            case ("MIRINDA"):
                menu.inc(70);
                break;
            default:
                System.out.println("Пожалуйста выберите напиток из меню.");

        }

        System.out.println();
    }

    public void inc(int count) throws Exception {
        money -= count;

        int userMoney;
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Сколько денег вы хотите положить на баланс?");
        userMoney = inputScanner.nextInt();
        money += userMoney;

        if (money >= 0) {
            System.out.println("У вас осталось : " + money
                    + " рублей. \nВозмьите ваш напиток");
        } else {
            System.out.println("У вас не хватает:" + Math.abs(money)
                    + " рублей\nПожалуйсте выберите другой напиток или пополните баланс.");
            Thread.sleep(100);
        }

    }

}

