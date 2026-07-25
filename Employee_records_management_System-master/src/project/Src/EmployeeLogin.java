package project.Src;

import java.util.Scanner;

import static project.Src.AdminLogin.emplist;

public class EmployeeLogin {
    Scanner sc= new Scanner(System.in);
    private String id;
    private String pass;

    public EmployeeLogin(String id,String pass){
        this.id= id;
        this.pass=pass;
    }
    public void Elogin() {
        boolean found = false;

        System.out.println("**Employee Login**");

        System.out.print("Enter Employee ID: ");
        int uid = sc.nextInt();
        sc.nextLine();



        for (Employee emp : emplist) {

            if (uid == emp.getId() ){
                System.out.print("Enter Password: ");
                String pass = sc.nextLine();
                    if(pass.equals(emp.getPass())) {
                        found = true;
                    }

                System.out.println("Login Successful\n");

                emp.display();

                break;
            }
        }

        if (!found) {
            System.out.println("Invalid Employee ID or Password");
        }
    }



    //getter
    public String getid () {
        return id;
    }
    public String getpass () {
        return pass;
    }

    //setter
    public void setid (String id){
        this.id = id;
    }
    public void setpass (String pass){
        this.pass = pass;
    }

}
