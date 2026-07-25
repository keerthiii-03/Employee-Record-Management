package project.Src;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    ArrayList<Login> AdminList=new ArrayList<>();
    ArrayList<Login> SList= new ArrayList<>();
    ArrayList<Login> Elist= new ArrayList<>();


    Scanner sc = new Scanner(System.in);

    private String id;
    private String pass;
    private String role;
    public Login(String role,String pass,String id){
        this.id= id;
        this.pass=pass;
        this.role=role;
    }
    public void addlogin(){
        System.out.println("Enter the Role: ");
        String prole = sc.nextLine();

        System.out.println("Enter the Id: ");
        String pid = sc.nextLine();

        System.out.println("Enter the  password: ");
        String ppass = sc.nextLine();

        if(prole.equals("admin")) {
            AdminList.add(new Login(prole, ppass, pid));

        }
        else if (prole.equals("supervisor")) {
            SList.add(new Login(prole, ppass, pid));

        } else if (prole.equals("employee")) {
                Elist.add(new Login(prole, ppass, pid));
        } else {
                System.out.println("Invalid login!!!");

        }

        }



    //getter
    public String getrole(){
        return role;
    }
    public String getid(){
        return id;
    }
    public String getpass(){
        return pass;
    }

    //Setter
    public void setrole(String role){
        this.role=role;
    }
    public void setid(String id){
        this.id= id;
    }
    public void setpass(String pass){
        this.pass=pass;
    }





}
