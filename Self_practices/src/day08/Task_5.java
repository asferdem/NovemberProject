package day08;

public class Task_5 {
    public static void main(String[] args) {
        String firstName = "Fatih ";
        String lastName = "ERDEM";
        String fullName = firstName + " "+ lastName ;
        int age = 18 ;
        String citizen = "USA";
        boolean eligibleVote = age > 18 && citizen == "USA";
        boolean notEligible = !eligibleVote;
        if(eligibleVote){
            System.out.println(fullName +": You are eligible to vote ");
        }
        if(notEligible){
            System.out.println(fullName +": You are not eligible to vote ");
        }
    }
}
