package project.Src;

import java.util.Scanner;

public class EmployeeRecordsManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AdminLogin a = new AdminLogin("", "");
        SupervisorLogin s = new SupervisorLogin("", "");
        EmployeeLogin e = new EmployeeLogin("", "");
        while(true) {

            System.out.println("Welcome create logins");

            System.out.println("Enter 1 for Admin ");
            System.out.println("Enter 2 to Supervisor ");
            System.out.println("Enter 3 Employee ");
            System.out.println("enter 4 to exit");
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (a.AddAdmin()) {
                        a.Alogin();
                        a.Afuction();
                    }
                    break;
                case 2:
                    if (s.AddSupervisor()) {
                        s.Slogin();
                        s.Sfunction();

                    }
                    break;
                case 3:
                    e.Elogin();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

    }

}

