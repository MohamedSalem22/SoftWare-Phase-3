package sample;

public class Description {
    private String descripe;//descripe of lost things
    public Description(){}//empty constructor
    public Description(String descripe)//parameter constructor
    {
        this.descripe=descripe;
    }
    public void setDescripe(String descripe){this.descripe=descripe;}//function set of descripe
    public String getDescripe(){return descripe;}//function get of descripe
}
