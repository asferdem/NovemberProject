package day29_CustomMethads;
/*
    4. check eligibility to vote
    age , citizen,name
    5. check eligibility to buy alcohol

    7. create a method that can reverse any String

 */




public class eligibility {
    public static void main(String[] args) {
        vote("Fatih",44,true,"Trump");
        vote("Ali",17,true,"veli");
        System.out.println("============================================");
        eligibleAlcohol(true,22);
        System.out.println("=============================================");
        calculater(10,'+',20);
    }







// check eligibility to vote
    public static void vote(String name,int age,boolean citizen,String candidateName) {


        boolean eligibleVote= age>=18 && citizen==true;
        if (eligibleVote){
            System.out.println(name+" is Eligible to Vote for "+candidateName);
        }else {
            System.out.println(name +" is not Eligible to Vote");
        }

    }
//5. check eligibility to buy alcohol
    public static void eligibleAlcohol(boolean hasID,int age){
        if (hasID && age>=21){
            System.out.println("You are eligible to by alcohol");
        }else{
            System.out.println(" You are eligible to buy milk");
        }
    }
//Calculate 2 Numbers
    public  static void calculater(double num1,char operator,double num2){
        // + - * / %
        switch (operator){
            case  '+':
                System.out.println("Addition :"+(num1+num2));
                break;
            case '-':
                System.out.println("Substraction :"+(num1-num2));
                break;
            case  '*':
                System.out.println("Multiplication :"+(num1*num2));
                break;
            case '/':
                System.out.println("Division:"+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder :"+(num1%num2));
                break;
            default:
                System.out.println("Invalid operator");
        }

    }

}
