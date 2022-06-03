package guru.qa;

public class FirstApp {
    public static void main(String[] args) {

        byte aByte = 50;        // 8 бит -128 ... 127
        short aShort = 10000;   // 16 бит -32768 ... 32767
        int aInt = 200000;      // 32 бит -2147483648 ... 2147483647
        long aLong = 100000L;   // 64 бит
        float aFloat = 254.5F;  // 32 бит
        double aDouble = 500.5; // 64 бит
        char symbol = '!';
        boolean flag = false;


        System.out.println("aByte + aShort = " + (aByte + aShort));
        System.out.println("aInt * aShort = " + (aInt * aShort));
        System.out.println("aInt / aByte = " + (aInt / aByte));
        System.out.println("aDouble / aFloat = " + (aDouble / aFloat));

        System.out.println("aByte++   = " +  (aByte++));
        System.out.println("aByte--   = " +  (aByte--));
        // Разница между префиксным и постфиксным инкрементом
        System.out.println("aInt++   = " +  (aInt++));
        System.out.println("++aInt   = " +  (++aInt));

        aInt = (aShort == 100) ? 60 : 30;
        System.out.println( "Значение b: " +  aInt );

        aInt = (aShort == 10000) ? 60 : 30;
        System.out.println( "Значение b: " + aInt );


        int[] myArray = {10, 15, 20, 25};

        // Вывести на экран все элементы массива
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + " ");
        }
        // Сумма элементов массива
        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        System.out.println("Сумма чисел массива: " + total);
        // Нахождение среди элементов массива наибольшего
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max) max = myArray[i];
        }
        System.out.println("Наибольший элемент: " + max);

        // Overflow
        byte aByte2 = (byte) 401; // -128 ... 127
        System.out.println("что получилось - " + aByte2 );
    }
}


