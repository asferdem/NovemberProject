package day51_Expections.BrowserTask;

public class FirefoxBrowser extends WebDriver {
    public void get(String url){
        System.out.println("Opening the "+url+" in Firefox browser");
    }

    public  void close(){
        System.out.println("Closing the Firefox browser");
    }
}
