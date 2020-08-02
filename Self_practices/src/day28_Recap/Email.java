package day28_Recap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/*
write a program that can get the name and domain of any given email address
		Ex:			cybertek@gmail.com
			output:
				name: cybertek
				domain: gmail
 */
public class Email {
    public static void main(String[] args) {
        String email = "cybertek.school@gmail.com";
        String name =email.substring(0,email.indexOf("@"));
        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("Name: "+name);
        System.out.println("Domain : "+domain);

    }
}
