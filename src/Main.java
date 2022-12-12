import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);

        double[] numberFraction = {1.57, 7.654, 9.986};
        System.out.println(numberFraction[0]);
        System.out.println(numberFraction[1]);
        System.out.println(numberFraction[2]);

        int[] myNumber = {5, 10, 15, 20, 25};
        System.out.println(myNumber[0]);
        System.out.println(myNumber[1]);
        System.out.println(myNumber[2]);
        System.out.println(myNumber[3]);
        System.out.println(myNumber[4]);


    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.print(Arrays.toString(number));

        System.out.println(" ");

        double[] numberFraction = {1.57, 7.654, 9.986};
        System.out.print(Arrays.toString(numberFraction));
        System.out.println(" ");

        int[] myNumber = {5, 10, 15, 20, 25};
        System.out.print(Arrays.toString(myNumber));
        System.out.println(" ");


    }

    public static void task3() {
        System.out.println("Задание 3");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int reverseNumber = number.length; reverseNumber > 0; reverseNumber--) {
            System.out.print(reverseNumber + " ");
        }
        System.out.println(" ");

        double[] numberFraction = {1.57, 7.654, 9.986};
        for (int reverseNumber2 = numberFraction.length - 1; reverseNumber2 >= 0; reverseNumber2--) {
            System.out.print(numberFraction[reverseNumber2] + " ");
        }
        System.out.println(" ");

        int[] myNumber = {5, 10, 15, 20, 25};
        for (int reverseNumber3 = myNumber.length - 1; reverseNumber3 >= 0; reverseNumber3--) {
            System.out.print(myNumber[reverseNumber3] + " ");
        }
            System.out.println(" ");


    }
}