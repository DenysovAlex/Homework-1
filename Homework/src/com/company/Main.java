package com.company;
import java.util.Scanner;
import javafx.scene.shape.Circle;

public class Main {

// Домашняя работа 1
// Задание 1. Конвертация int to String.

    public static String intToString(int i) {
        String i2 = "" + i;
        {
            System.out.println(i2);
            return i2;
        }
    }

// Задание 2. Конвертация String to int.

    public static int StringToInt(String ab) {
        int a = Integer.parseInt(ab);
        int b = Integer.parseInt(ab);
        System.out.println(ab);
        return a + b;
    }

// Задание 3. Дано число, определить, четное оно или нет.

    public static void main(String[] args) {
        int n = 5;
        if (n % 2 == 0) {
            System.out.println("Число" + n + "четное");
        } else {
            System.out.println("Число" + n + "нечетное");
        }
    }

// Задание 4. Дано число, определить, заканчивается ли оно цифрой 7.

    public static void endSeven(int х) {
        int х1 = х % 10;
        if (х1 == 7) {
            System.out.println("Число заканчивается цифрой 7");
        } else {
            System.out.println("Число заканчивается цифрой 7");
        }
    }

// Задание 5. Дана строка и символ. Определить, содержит ли строка этот символ.

    public static void AtHome1(String[] args) {
        String str = "Доброе утро!";
        int indexM = str.indexOf("р");
        int indexJava = str.indexOf("утро");
        if (indexM == -1) {
            System.out.println("Символ \"м\" не найден.");
        } else {
            System.out.println("Символ \"м\" найден в индексе " + indexM);
        }
        if (indexJava == -1) {
            System.out.println("Слово \"утро\" не найдено.");
        } else {
            System.out.println("Слово \"утро\" найдено в индексе " + indexJava);
        }
    }

// Задание 6. Дано число, означающее время в часах. Вывести время в минутах и секундах.

    public static void main(int hours) {
        int minute = hours * 60;
        int second = hours * 3600;
        {
            System.out.println("minute.second");
        }
    }

//Задание 7. Дано число, означающее время в секундах. Вывести время в днях, часах, минутах и секундах.

    public static void task7(int second) {
        int day = second / 86400;
        int hour = second / 3600;
        int minute = second / 60;
        int second1 = second;
        {
            System.out.println("day.hours.minute.second1");
            return;
        }
    }
}

        // Задача 9.  Дан радиус круга. Вычислить площадь круга, длину окружности.

        class AtHome {
            public void main(int x) {
                double Pi = 3.14;
                {
                    double x1 = Pi * (x * x);
                    System.out.println(x1);
                    double x2 = Pi * x;
                    System.out.println(x2);
                }
            }
        }

// Задание 10. Имеется прямоугольное отверстие размерами a и b (входные параметры),
// определить, можно ли его полностью закрыть круглой картонкой радиусом r (входной параметр).
// (добавить проверку на отрицательные значения) Результат - boolean.


// Задание 8.    Дана строка, вернуть строку, содержащую по очереди заглавные и строчные буквы.
// Пример: qwertyu -> QwErTyU



