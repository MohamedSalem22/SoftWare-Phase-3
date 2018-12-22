package sample;

import java.util.ArrayList;

public class Versification {
    public boolean verify_lost(String path, ArrayList<String> path2)//function check if found lost things
    {
        if(path2.contains(path))
        {
            return true;
        }
        else
            return false;
    }
}
