package day44_Constructor;

public class ConstructorIntro {

    public ConstructorIntro(String arr){
        System.out.println("Hello "+arr);
        System.out.println("How are you "+arr);
    }

    public static void main(String[] args) {

      // ConstructorIntro obj= new ConstructorIntro(10);
            // ConstructorIntro obj= new ConstructorIntro();
        ConstructorIntro str=new ConstructorIntro("Muhtar");
        ConstructorIntro str1=new ConstructorIntro("Fatih");
        ConstructorIntro str2=new ConstructorIntro("Erdem");


    }


}
