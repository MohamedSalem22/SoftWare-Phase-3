package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class check {
    public String checkmail(String mail,ArrayList<Integer> A)
    {
        int x=A.size();
        if(x==1)
        {
            System.out.println("this is real Owner");
            return "this is real Owner";
        }
        else{
            System.out.println("Enter your Id:");
            Scanner ids=new Scanner(System.in);
            int idd=ids.nextInt();
            if(A.contains(idd))
            {
                System.out.println("this is real Owner");
                return "this is real Owner";
            }
            else
            {
                System.out.println("this is not real Owner");
                return "this is not real Owner";
            }
        }
    }
}
