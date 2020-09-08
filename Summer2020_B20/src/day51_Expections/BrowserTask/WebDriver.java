package day51_Expections.BrowserTask;
/*
 create a class called WebDriver
        actions: get(URL): prints "opening the URL in the default browser"
        close(): closes the default browser
 */
public class WebDriver {

    public void get(String url){
        System.out.println("Opening the "+url+" in default browser");
    }

    public  void close(){
        System.out.println("closing the default browser");
    }
}
