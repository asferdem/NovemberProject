package day33_MethodOverloading_LocalDateTime;

public class unique {
    public static void main(String[] args) {

        int[] arr={2,2,1,3,3,4,5,6};

       uniqueelements(arr);

       int[] arr1={10,20,30,20,55,44,44,70,100,33,55,66,33,88,55};
       uniqueelements(arr1);

       String[] words= {"C#","C#","Java","Python","Python","C++","Fatih"};
        uniqueelements(words);

        char[] ch={'a','a','b','d','e','e'};
        uniqueelements(ch);

        }


        public static void uniqueelements(int[] arr){
            for (int element:arr){
                int count=0;
                for (int each:arr) {
                    if (element == each) {
                        count++;

                    }
                }
                if (count==1){
                    System.out.print(element+" ");
                }
            }
            System.out.println();

        }

        public static void uniqueelements(char[] arr){
        for (char element:arr){
            int count=0;
            for (char each:arr) {
                if (element == each) {
                    count++;

                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();

    }

        public static void uniqueelements(double[] arr){
        for (double element:arr){
            int count=0;
            for (double each:arr) {
                if (element == each) {
                    count++;

                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();

    }

        public static void uniqueelements(String[] arr){
        for (String element:arr){
            int count=0;
            for (String each:arr) {
                if (element.equals(each)) {
                    count++;

                }
            }
            if (count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();

    }

}
