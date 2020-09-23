package day56_Abstractions.PhoneAbstractTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class PhoneObject {
    public static void main(String[] args) {
        Samsung s1=new Samsung("c10" , 200, "big");

        System.out.println(s1);

        Iphone I1=new Iphone("11 Pro", 1000, "large");
        System.out.println(I1);
        I1.faceTiming(235456987);

    }


}
