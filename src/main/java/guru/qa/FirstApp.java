package guru.qa;

public class FirstApp {
    public static void main(String[] args) {

        byte aByte = 50;        // 8 бит -128 ... 127
        short aShort = 10000;   // 16 бит -32768 ... 32767
        int aInt = 20000;       // 32 бит -2147483648 ... 2147483647
        long aLong = 100000L;   // 64 бит
        float aFloat = 255.5F;  // 32 бит
        double aDouble = 525;   // 64 бит
        boolean aFalse = false;
        boolean aTrue = true;
        char aChar = ':';
        String aString = "Что произойдет при переполнении ";

        // Арифметические операторы
        System.out.println("Сложение aByte + aShort = " + (aByte + aShort));
        System.out.println("Умножение aByte * aFloat = " + (aByte * aFloat));
        System.out.println("Деление aLong / aInt = " + (aLong / aInt));
        System.out.println("Взятие остатка от деления aDouble % aByte = " + (aDouble % aByte));

        // Унарные операторы
        System.out.println("Инкремент aByte++ = " + (aByte++));
        System.out.println("Декремент aByte-- = " + (aByte--));
        System.out.println("Постфиксный инкремент aByte++ = " + (aByte++));
        System.out.println("Префиксный инкремент ++aByte = " + (++aByte));

        // Тернарный оператор
        aInt = (aShort == 10000)
                ? 20000
                : 30000;
        System.out.println("Значение aInt: " + aInt);

        // Логические операторы
        System.out.println("aFalse && aTrue = " + (aFalse && aTrue));
        System.out.println("aFalse || aTrue = " + (aFalse || aTrue));

        // Массив и циклы
        int[] myArray = {10, 15, 20, 25};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        System.out.println("Сумма чисел массива: " + total);


        // Переполнение
        byte byteOver = (byte) 401;
        System.out.println(aString + "byteOver" + aChar + " " + byteOver);

        int intOver = Integer.MIN_VALUE - 1;
        System.out.println(aString + "intOver" + aChar + " " + intOver);
    }
}


