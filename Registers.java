package sample;

public class Registers {
    private String name;//name of user
    private String password;//password of user
    private String Email;//Email of User
    public Registers(){}//empty constructor
    public Registers(String name,String password,String Email)//parameter constructor
    {
        this.name=name;
        this.password=password;
        this.Email=Email;
    }
    public void setName(String name){this.name=name;}//function set of name
    public String getName(){return name;}//function get of name
    public void setPassword(String password){this.password=password;}//function set of password
    public String getPassword(){return password;}//function set of password
    public void setEmail(String Email){this.Email=Email;}//function of set Email
    public String getEmail(){return Email;}//function get of Email
    public String havemail(String name,String password,String Email)//function have mail(Account)
    {
        System.out.println("Now You have Account");
        return "name:"+getName()+" password:"+getPassword()+" Email:"+getEmail();
    }
}
