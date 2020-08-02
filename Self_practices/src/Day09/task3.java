package Day09;

public class task3 {
    public static void main(String[] args) {
        double score1 = 40;
        double score2 = 40;
        double score3 = 40;
        double average = (score1 + score2 + score3) / 3;
        System.out.println("Your average is : " + average);
        if (average > 0 && average <= 59) {
            System.out.println("Your Grade is : " + "F");
        } else if (average > 59 && average <= 69) {
            System.out.println("Your Grade is : " + "D");
        } else if (average > 69 && average <= 79) {
            System.out.println("Your Grade is : " + "C");
        } else if (average > 79 && average <= 89) {
            System.out.println("Your Grade is : " + "B");
        }
    }
}