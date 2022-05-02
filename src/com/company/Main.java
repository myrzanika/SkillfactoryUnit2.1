package com.company;
//Unit 2.1
//Основные конструкции и операторы (часть 2)



public class Main {

    public static void main(String[] args) {

        //Task 2.7.1
        /*Расшифровка будет происходить по следующим правилам:
         'h' → "Hello!"
         'i', 'm', 'k' → "I can decode!"
         'b' → "Bye!"
         Ни один из указанных → "I don't know these symbols :("
         Например, если символ равен 'h', то результатом работы будет слово "Hello".*/
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));

        //Task 2.8.1
        /*Используя цикл do...while, напишите программу,
        которая уменьшает значение i до тех пор, пока оно больше 1.
        В программе должна выполнится хотя бы одна итерация.*/
        int i = 10;
        do {i--;} while (i > 1);
        System.out.println("Value i = " + i);

    }

    public static String decode(char ch) {

        String result = "";
        switch (ch) {
            case 'h':
                result = "Hello!";
                break;
            case 'i':
            case 'm':
            case 'k':
                result = "I can decode!";
                break;
            case 'b':
                result = "Bye!";
                break;
            default:
                result = "I don’t know these symbols:(";
        }
        return result;
    }
}