package Day17_String_Methods;



public class for_loop {
    public static void main(String[] args) {
        int num1=1;
        System.out.println("Number"+"\t\t Reminder"+"\t\t\tStatus");
                for (int num=1;num<=100;++num){
            num1=num%2;

            if (num1==0){
                System.out.println(num+ "\t\t\t "+num1  +"\t\t\t\t\tEven "+"");
            }else{
                System.out.println(num+ "\t\t\t "+num1 +"\t\t\t\t\tOdd");
            }
        }


    }
}
