package sample;

public class Login {
    private String name;//name of user
    private String password;//password of user
    public Login(){}//empty constructor
    public Login(String name,String password)//parameter constructor
    {
        this.name=name;
        this.password=password;
    }
    public void setName(String name){this.name=name;}//function set of name
    public String getName(){return name;}//function get of name
    public void setPassword(String password){this.password=password;}//function set of password
    public String getPassword(){return password;}//function get of password
}
