package project.Src;

import java.util.ArrayList;
import java.util.Scanner;

public class SupervisorLogin {

    public static ArrayList<SupervisorLogin> SList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    private String id;
    private String pass;

    public SupervisorLogin(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public boolean AddSupervisor() {
        System.out.println("Enter the Id: ");
        String pid = sc.nextLine();

        System.out.println("Enter the  password: ");
        String ppass = sc.nextLine();


        SList.add(new SupervisorLogin(pid, ppass));

        return true;
    }

    public void Slogin() {
        System.out.println("Enter yes to login to Supervisor page");
        String loginIn = sc.nextLine();
        if (loginIn.equals("yes")) {
            System.out.println("**Welcome to Supervisor login**");
            System.out.println("Enter the Supervisor Id to login : ");
            String UId = sc.nextLine();
            boolean found=false;
            for (SupervisorLogin s : SList) {
                if (UId.equals(s.getid())) {
                    System.out.println("Enter the Supervisor Password login : ");
                    String Upass = sc.nextLine();
                    if (Upass.equals(s.getpass())) {
                        found=true;

                    } else {
                        System.out.println("Invalid  password!!!");
                    }

                } else {
                    System.out.println("Invalid Id!!!");
                }


            }
            if (!found) {
                System.out.println("Invalid ID or Password");
            }
        }

    }

    public void Sfunction() {
        while (true) {
            System.out.println("Enter 1 to update the Employee");
            System.out.println("Enter 2 to view the employee");
            System.out.println("Enter 3 to exist");
            System.out.println("Enter your choice: ");
            int b = sc.nextInt();
            switch (b) {
                case 1:
                    boolean found = false;
                    System.out.println("enter the employee id:");
                    int Uid = sc.nextInt();
                    for (Employee emp : AdminLogin.emplist) {

                        if (Uid == emp.getId()) {
                            found = true;
                            System.out.println("enter what to update : ");
                            System.out.println("1. Name");
                            System.out.println("2. Department");
                            System.out.println("3. Designation");
                            System.out.println("4. Age");
                            System.out.println("5. Gender");
                            System.out.println("6. Email");
                            System.out.println("7. Phone Number");
                            System.out.println("8. Salary");

                            System.out.print("Enter your choice: ");
                            int Uch = sc.nextInt();
                            sc.nextLine();

                            switch (Uch) {
                                case 1:
                                    System.out.println("Enter the name : ");
                                    emp.setName(sc.nextLine());
                                    break;
                                case 2:
                                    System.out.print("Enter New Department: ");
                                    emp.setDept(sc.nextLine());
                                    break;

                                case 3:
                                    System.out.print("Enter New Designation: ");
                                    emp.setDes(sc.nextLine());
                                    break;

                                case 4:
                                    System.out.print("Enter New Age: ");
                                    emp.setAge(sc.nextInt());
                                    break;

                                case 5:
                                    sc.nextLine();
                                    System.out.print("Enter New Gender: ");
                                    emp.setGender(sc.nextLine());
                                    break;

                                case 6:
                                    System.out.print("Enter New Email: ");
                                    emp.setEmail(sc.nextLine());
                                    break;

                                case 7:
                                    System.out.print("Enter New Phone Number: ");
                                    emp.setPnum(sc.nextLine());
                                    break;

                                case 8:
                                    System.out.print("Enter New Salary: ");
                                    emp.setSalary(sc.nextDouble());
                                    break;

                                default:
                                    System.out.println("Invalid Choice");

                            }


                        }

                    }
                    if (!found) {
                        System.out.println("Employee id not found");
                    }
                    break;
                case 2:
                    for (Employee emp : AdminLogin.emplist) {
                        emp.display();
                    }
                    break;
                case 3:
                    System.out.println("Thank You!");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
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
