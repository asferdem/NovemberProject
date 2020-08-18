package day42_Static;

public class Student {

    String  name;
    int age;
    int groupNumber;
    char gender;
    static String schoolName="Cybertek School";
    static String favoriteTeacher="Nadir";


    public void setInfo(String name,int age,int groupNumber,char gender){
       this.name=name;
       this.age=age;
       this.gender=gender;
       this.groupNumber=groupNumber;
    }
    public String toString(){
        return   "School Name : " +schoolName+"\nStudent Name: "+name+"\nAge : "+age+"\nGender : "+gender+
                 "\nGroup : "+groupNumber+"\nFavorite Teacher : "+favoriteTeacher;
    }
}
