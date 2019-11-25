package com.company;


public class Main {
    public static void main(String[] args) {


// Домашняя работа 1
// Задание 1. Конвертация int to String.

        Main main = new Main();
//        main.toStringTask1();
    }

    public void toStringTask1() {
        int j = 111;
        String str = Integer.toString(j);
        System.out.println(j);
    }

// Задание 2. Конвертация String to int.

    public static void stringToIntTask2(String s) {
        s = "222";
        int num = Integer.parseInt(s);
        System.out.println(num);
    }

// Задание 3. Дано число, определить, четное оно или нет.

    public static void evenOrOddNumberTask3(int n) {
        n = 333;
        if (n % 2 == 0) {
            System.out.println("Число" + n + "четное");
        } else {
            System.out.println("Число" + n + "нечетное");
        }
    }

// Задание 4. Дано число, определить, заканчивается ли оно цифрой 7.

    public static void nomberSeven() {
        int d = 47;
        int d1 = d % 100;
        if (d1 == 7) {
            System.out.println("Число не заканчивается цифрой 7");
        } else {
            System.out.println("Число заканчивается цифрой 7");
        }
    }

// Задание 5. Дана строка и символ. Определить, содержит ли строка этот символ.

    public static void сontainsSymbol(String[] args) {
        String str = "Привет";
        int indexM = str.indexOf("р");
        int indexJava = str.indexOf("Привет");
        if (indexM == -1) {
            System.out.println("Символ \"р\" не найден.");
        } else {
            System.out.println("Символ \"р\" найден в индексе " + indexM);
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
            {
                return;
            }
        }
    }


    // Задача 9.  Дан радиус круга. Вычислить площадь круга, длину окружности.

 //   class AtHome {
        public static void circumTask9 (int x) {
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



