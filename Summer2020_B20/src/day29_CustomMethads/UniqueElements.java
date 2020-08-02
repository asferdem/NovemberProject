package day29_CustomMethads;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class UniqueElements {
    public static void main(String[] args) {
        String[] arr={"A", "B", "B", "C"};

        uniques(arr);
        String[] arr1={"D", "B", "B", "F","F",};
         uniques(arr1);

    }



    public static void uniques(String[] arr){
        for (String a :arr){
            int count=0;
            for (String each : arr){
                if (a.equals(each)){
                    count++;
                }
            }
            if (count==1){
                System.out.print(a+" ");
            }

        }
        System.out.println();
    }




}
