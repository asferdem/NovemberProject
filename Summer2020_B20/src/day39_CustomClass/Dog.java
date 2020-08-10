package day39_CustomClass;

public class Dog {
    String name;
    String breed;
    String size;
    int age;
    String color;
// test
    public void setDogInfo(String dogName,String dogBreed,String dogSize,int dogAge,String  dogColor){
        name=dogName;
        breed=dogBreed;
        size=dogSize;
        age=dogAge;
        color=dogColor;
    }

    public void getDogInfo(){
        System.out.println(name+", "+breed+", "+size+", "+age+", "+color);
    }

    public  void eat(){
        System.out.println(name+" "+breed+" Can eating now");
    }

    public void drink(){
        System.out.println(name+ " can drink now");
    }
    public  void sleep(){
        System.out.println(name +" Sleeping time !");
    }

}
