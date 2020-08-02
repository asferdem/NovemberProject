package day29_CustomMethads;

public class MethodswithoutParamethers2 {
    public static void main(String[] args) {
        System.out.println("Odd NUmber");
        odnumber();
        System.out.println();
        System.out.println("Even Number ");
        evennumber();
        System.out.println();
    }

    public static void evennumber() {

        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
    }

    public static void odnumber() {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

}