package day51_Expections.BrowserTask;

public class BrowserObject {
    public static void main(String[] args) {

      ChromeBrowser chrome= new ChromeBrowser();
        chrome.get("https://www.google.gom");
        chrome.close();
        System.out.println("===========================");
      FirefoxBrowser firefox=new FirefoxBrowser();
      firefox.get("https://www.google.gom");
      firefox.close();
        System.out.println("===========================");

      OperaBrowser opera=new OperaBrowser();
      opera.get("https://www.google.gom");
      opera.close();
    }
}
