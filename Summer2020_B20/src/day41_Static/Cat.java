package day41_Static;
/*
Task:
    Cat:
        attributes:
                name, age, gender, color, breed
        Actions:
                setInfo, eat, drink, toString
                use this. keyword
    Make sure that you can print out the objects of the Cat in the print statement
    CatObjects:
            create 5 objects of Cat and store them into an array variable
            print out the informations of every single cat
                    (DO NOT use getInfo method)
            ArrayList:
                maleCats
                femaleCats
                first approach: apply loop ( both for each loop and for loop)
                second approach: do not use loop

 */
public class Cat {

    String name;
    int age;
    char gender;
    String  color;
    String breed;
    public void setCatInfo(String name,int age,char gender,String color,String breed){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.color=color;
        this.breed=breed;
    }

    public void eat(){
        System.out.println(name+"cat is eating");
    }
    public void drink(){
        System.out.println(name+"cat is drinking");

    }

    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nGender: " +gender+ "\nColor: " + color + "\nBreed: " + breed;
    }


}
