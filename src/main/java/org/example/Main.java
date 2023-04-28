package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("1. Идеальный вес");
        /**
         * Задать в переменных рост и вес человека.
         * Идеальный вес - рост минус 100 и ещё минус 10 процентов плюс минус 5 килограммов.
         * Написать программу, которая печатает идеальный вес или не идеальный.
         */
        double height=162;
        double weight=65;
        double idealWeight=height-100-height*0.1;
        System.out.println(idealWeight);
        if (weight>=(idealWeight-5) && weight<=(idealWeight+5)) {
            System.out.println("Ваш вес является идеальным");}
            else System.out.println("Вам нужно следить за своим весом");

        System.out.println("2. Время суток");
        /**
         * Объявить переменную с текущим часом
         * Написать программу, которая по этой переменной определяет
         * время суток (утро, вечер, ночь, день)
         */
        int hour=24;
        if (hour>=11 && hour<=16) {
            System.out.println("Сейчас день!");
        } else if (hour>16 && hour<=22) {
            System.out.println("Сейчас вечер!");
        } else if ((hour>22 && hour<=24) || (hour>=0 && hour<=4))  {
            System.out.println("Сейчас ночь!");
        } else System.out.println("Сейчас утро!");

        System.out.println("3. Время суток с уведомлениями об ошибках");
        /**
         * Объявить переменную с текущим часом.
         * Написать программу, которая по этой переменной определяет время суток (утро, вечер, ночь, день)
         * Если текущий час меньше нуля, нужно вывести, что время суток нужно ввести правильно
         * Если текущий час больше 23, нужно вывести, что пользователю следует вернуться с другой планеты на Землю.
         */
        int hourTwo=24;
        if (hourTwo>=11 && hourTwo<=16) {
            System.out.println("Сейчас день!");
        } else if (hourTwo>16 && hourTwo<=22) {
            System.out.println("Сейчас вечер!");
        } else if ((hourTwo>22 && hourTwo<24) || (hourTwo>=0 && hourTwo<=4))  {
            System.out.println("Сейчас ночь!");
        } else if (hourTwo<0) {
            System.out.println("Время суток нужно ввести правильно!");
        } else if (hourTwo>23) {
            System.out.println("Вернитесь с другой планеты!");
        } else System.out.println("Сейчас утро!");

        System.out.println("4. Приветствие");
        /**
         * Объявить переменную с текущим часом и днём недели.
         * День недели может быть просто номером дня недели.
         * Написать программу, которая приветствует пользователя, который только что проснулся и включил компьютер.
         * По будним дням, программа должна до восьми писать Доброе утро
         * После восьми писать, - Всё пропало ты проспал!
         * После одиннаднати писать - Включай почту, составляй письмо, что сегодня берёшь отгул
         * По выходным до двеннадцати писать Доброе утро!
         * После 12 писать - Лучше поспать ещё
         * После 16 писать - Вставай, тебя ждёт недоигранный Ведьмак!
         * После 18 писать - Дааа, с режимом надо что-то делать
         */
        int hourSalute=20;
        int day=4;
        if (day>=1 && day<=5) {
            if (hourSalute<=8){
                System.out.println("Доброе утро!");
            } else if (hourSalute>8 && hourSalute<=11) {
                System.out.println("Всё пропало ты проспал!");
            } else System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул");
            } else if (day==6 || day==7) {
            if (hourSalute<=12) {
                System.out.println("Доброе утро!");
            } else if (hourSalute>12 && hourSalute<=16) {
                System.out.println("Лучше поспать ещё!");
            } else if (hourSalute>16 && hourSalute<=18) {
                System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
            } else System.out.println("Дааа, с режимом надо что-то делать");
        }






    }
}