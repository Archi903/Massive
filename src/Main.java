import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задание 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double[] numberFraction = {1.57, 7.654, 9.986};

        int[] myNumber = {5, 10, 15, 20, 25};



    }

    public static void task2() {
        System.out.println("Задание 2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double[] numberFraction = {1.57, 7.654, 9.986};
        int[] myNumber = {5, 10, 15, 20, 25};

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < numberFraction.length; i++) {
            System.out.print(numberFraction[i]);
            if (i != numberFraction.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i = 0; i < myNumber.length; i++) {
            System.out.print(myNumber[i]);
            if (i != numberFraction.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
    }
        public static void task3 () {
            System.out.println("Задание 3");
            int[] number = new int[3];
            number[0] = 1;
            number[1] = 2;
            number[2] = 3;
            for (int i = number.length - 1; i >= 0; i--) {
                System.out.print(number[i]);
                if (i != 0) {
                    System.out.print(", ");
                }
            }
                System.out.println();

            double[] numberFraction = {1.57, 7.654, 9.986};
            for (int q = numberFraction.length - 1; q >= 0; q--) {
                System.out.print(numberFraction[q]);
                if (q != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ");

            int[] myNumber = {5, 10, 15, 20, 25};
            for (int s = myNumber.length - 1; s >= 0; s--) {
                System.out.print(myNumber[s]);
                if (s != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ");


        }

        public static void task4 () {
            System.out.println("Задание 4");
            int[] number = new int[3];
            number[0] = 1;
            number[1] = 2;
            number[2] = 3;
            for (int i = 0; i < number.length; i++)
                if (number[i] % 2 != 0)
                    number[i] += 1;

            System.out.println(Arrays.toString(number));

        }
    }