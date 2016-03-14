package ua.KushnerovOleksandr.guessNumber;

import java.util.Scanner;

/**
 * Created by Kushnerov Oleksandr on 10.02.2016.
 */

/* Реализовать игру “угадай число”. Программа загадывает случайное число в пределах от 1
до 100. Задача игрока - отгадать это число не более чем за восемь попыток. После каждой
попытки программа подсказывает больше загаданное число или меньше предполагаемого.
При проигрыше программа показывает загаданное число. */

public class Main {
    public static void main(String[] args) {
        int count = 8;
        Scanner scanner = new Scanner(System.in);
        int guessNumber = (int) (Math.random() * 101);

        System.out.println("Компьютер задумывает число... Подождите...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Угадайте число от 0 до 100");
        System.out.println("У Вас 8 попыток");

        for (int i = 0; i < 8; i++) {
            int enterNumber = Integer.valueOf(scanner.nextLine());
            if (enterNumber == guessNumber) {
                System.out.println("Поздравляю! Вы угадали число!");
                break;
            } else if (i == 7) {
                System.out.println("Вы использовали все попытки и не угадали число, задуманое число = " + guessNumber);
            } else if (enterNumber > guessNumber) {
                System.out.println("Ваше число меньше задуманого, попробуйте ещё...");
                count--;
                switch (count) {
                    case 8:
                        System.out.println("У Вас осталось " + count + " попыток");
                        break;
                    case 7:
                        System.out.println("У Вас осталось " + count + " попыток");
                        break;
                    case 6:
                        System.out.println("У Вас осталось " + count + " попыток");
                        break;
                    case 5:
                        System.out.println("У Вас осталось " + count + " попыток");
                        break;
                    case 4:
                        System.out.println("У Вас осталось " + count + " попытки");
                        break;
                    case 3:
                        System.out.println("У Вас осталось " + count + " попытки");
                        break;
                    case 2:
                        System.out.println("У Вас осталось " + count + " попытки");
                        break;
                    default:
                        System.out.println("У Вас осталось " + count + " попытка");
                        break;
                }
            } else if (enterNumber < guessNumber) {
                System.out.println("Ваше число больше задуманого, попробуйте ещё...");
                count--;
                switch (count) {
                    case 8:
                        System.out.println("У Вас осталось " + count + " попыток");
                        break;
                    case 7:
                        System.out.println("У Вас осталось " + count + " попыток");
                        break;
                    case 6:
                        System.out.println("У Вас осталось " + count + " попыток");
                        break;
                    case 5:
                        System.out.println("У Вас осталось " + count + " попыток");
                        break;
                    case 4:
                        System.out.println("У Вас осталось " + count + " попытки");
                        break;
                    case 3:
                        System.out.println("У Вас осталось " + count + " попытки");
                        break;
                    case 2:
                        System.out.println("У Вас осталось " + count + " попытки");
                        break;
                    default:
                        System.out.println("У Вас осталось " + count + " попытка");
                        break;
                }
            }
        }

    }
}
