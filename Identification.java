package sample;

public class Identification {
    private String idf;//id of founded things
    public Identification(){}//empty constructors
    public Identification(String idf)
    {
        this.idf=idf;
    }
    public void setIdf(String idf){this.idf=idf;}//function set of id founded
    public String getIdf(){return idf;}//function get of id founded
}
