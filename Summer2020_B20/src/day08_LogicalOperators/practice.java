package day08_LogicalOperators;

public class practice {
    public static void main(String[] args) {

        String firstName = "Fatih";
        String lastName =  "Erdem" ;
        String fullName = firstName +" " + lastName;
        int age = 44;
        String citizenShip = "turkey";

        boolean eligibleToVote =  age>=18 && citizenShip == "USA" ;// true

        System.out.println(eligibleToVote);
        System.out.println(fullName+ " is eligible to vote : "+ eligibleToVote);

        // || : or logic
        boolean r8 = true == !false || false == true; // true ==>one is true  that is
        System.out.println(r8);

        boolean r9 = !false == false || true == !false ;// true
        System.out.println(r9);

        boolean r10 = !false == false && true == !false; // false
        System.out.println(r10);



    }
}
