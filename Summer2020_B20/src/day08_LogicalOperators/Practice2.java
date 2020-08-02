package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        String fistName = "Fatih";
        String lastName = "ERDEM";
         int age = 21;
         String citizen1 = "USA";
         String citizen2 = "Turkey";

         boolean eligibleAge = age >= 18;
         // 12>= 18 ==> true
         boolean usCitizen = citizen1== "USA" || citizen2 == "USA"; // true
        //                 true || false ==>true
        boolean eligibleToVote = eligibleAge && usCitizen;// false
        //                        true && true
        String fullName= fistName+ " "+ lastName;

        System.out.println(eligibleAge); // true

        System.out.println(fullName + " is eligible to vote for Trump : "+ eligibleToVote);



    }
}
