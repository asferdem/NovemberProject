package day47_Encapsulation;
/*
create class Credentials
            instance variables:
                    public name
                    public age
                    private username
                    private password
                    getter & setter
                    add a constructor to set name & age

 */
public class Credentials {
    private String userName;
    private String password;
    public String name;
    public int age;
    public static String companyName;

    static {
        companyName="Facebook";
    }
    public String getUsername(){ return userName; }
    public void setUsername(String userName){ this.userName=userName; }

    public String getPassword(){ return password; }

    public void  setPassword(String password){ this.password=password; }


    public Credentials(String name,int age){
        this.name=name;
        this.age=age;
    }


}
