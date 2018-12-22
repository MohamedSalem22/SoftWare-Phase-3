package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> Names = new ArrayList<String>();
        ArrayList<String> Passwords = new ArrayList<String>();
        ArrayList<String> Emails = new ArrayList<String>();
        ArrayList<String>Idfs=new ArrayList<>();
        ArrayList<String> Imagespath=new ArrayList<>();
        ArrayList<Integer> IDS=new ArrayList<>();
        for (int yy = 1; yy > 0; yy++) {
            Registers registers = new Registers();
            System.out.println("press 1 to Registers");
            System.out.println("press 2 to Login");
            System.out.println("Press 0 to End");
            Scanner s3 = new Scanner(System.in);
            int press = s3.nextInt();
            if (press == 1) {
                System.out.println("Enter your name:");
                Scanner s = new Scanner(System.in);
                String name = s.nextLine();
                registers.setName(name);
                Names.add(name);
                System.out.println("Enter your password:");
                Scanner s1 = new Scanner(System.in);
                String password = s1.nextLine();
                registers.setPassword(password);
                Passwords.add(password);
                System.out.println("Enter your mail");
                Scanner ss = new Scanner(System.in);
                String Email = ss.nextLine();
                registers.setEmail(Email);
                Emails.add(Email);
                System.out.println(registers.havemail(name, password, Email));
            }
            if(press==2)
            {
                Login login=new Login();
                System.out.println("Enter UserName");
                Scanner scanner=new Scanner(System.in);
                String name1=scanner.nextLine();
                login.setName(name1);
                System.out.println("Enter Password");
                Scanner scanner1=new Scanner(System.in);
                String Pass1=scanner1.nextLine();
                login.setPassword(Pass1);
                String check=login.getName();
                String check1=login.getPassword();
                if(Names.contains(check)&&Passwords.contains(check1))
                {
                    System.out.println("Welcome to App");
                    System.out.println("press 1 to Share");
                    System.out.println("press 2 to Search");
                    Scanner scanner2=new Scanner(System.in);
                    int input=scanner2.nextInt();
                    if(input==1)
                    {
                        System.out.println("Enter the Identification of Founded thing");
                        Scanner scanner3=new Scanner(System.in);
                        String idf=scanner3.nextLine();
                        Identification identification=new Identification();
                        identification.setIdf(idf);
                        String idinf=identification.getIdf();
                        Idfs.add(idinf);
                        System.out.println("Enter path of Image");
                        Scanner uu=new Scanner(System.in);
                        String path=uu.nextLine();
                        Imagespath.add(path);
                        int[][] image = Image.readImage(path);
                        System.out.println("Enter Id of Item");
                        Scanner t=new Scanner(System.in);
                        int w=t.nextInt();
                        IDS.add(w);
                        int x = 0 ;
                        System.out.println("if you want to submit enter 1 else if enter 0");
                        Scanner scanner4=new Scanner(System.in);
                        x=scanner4.nextInt();
                        if(x==1)
                        {
                            System.out.println("Post is done");
                        }
                        else
                        {
                            Idfs.remove(idinf);
                            System.out.println("Please Enter the Identification of Founded thing Again");
                            Scanner scanner5=new Scanner(System.in);
                            String idff=scanner5.nextLine();
                            Idfs.add(idff);
                            System.out.println("done");
                        }

                    }
                    else if(input==2){
                        System.out.println("Enter Description of lost things");
                        Scanner scanner6=new Scanner(System.in);
                        String des=scanner6.nextLine();
                        Description description=new Description();
                        description.setDescripe(des);
                        System.out.println("Enter path of Image");
                        Scanner uu=new Scanner(System.in);
                        String path2=uu.nextLine();
                        int[][] image = Image.readImage(path2);
                        Versification versification=new Versification();
                        boolean i=versification.verify_lost(path2,Imagespath);
                        System.out.println(i);
                        if(i==true)
                        {
                            Connection connection=new Connection();
                            System.out.println("Enter your mail:");
                            Scanner mail=new Scanner(System.in);
                            String EEmail=mail.nextLine();
                            connection.setmail(EEmail);
                            check check2=new check();
                            check2.checkmail(EEmail,IDS);

                        }
                        else
                        {
                            System.out.println("invalid");
                        }

                    }
                }
            }
            if(press==0)
            {
                break;
            }
        }
    }
    public static int post(int x){

        return x;

    }


}