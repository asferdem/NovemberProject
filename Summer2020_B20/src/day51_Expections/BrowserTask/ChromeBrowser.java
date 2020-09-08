package day51_Expections.BrowserTask;

public class ChromeBrowser extends WebDriver {
@Override
    public void get(String url){
        System.out.println("Opening the "+url+" in Chrome browser");
    }

    public  void close(){
        System.out.println("Closing the Chrome browser");
    }

}
