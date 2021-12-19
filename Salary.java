// overriding
import java.util.*;
public class Salary
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        
        System.out.println("SET EMPLOYEE INFORMATION :");
        Employee ob1=new Employee();
        ob1.set_emp_info();
        Programmer ob2=new Programmer();
        Team_Lead ob3=new Team_Lead();
        Assistant_Project_Manager ob4=new Assistant_Project_Manager();
        Project_Manager ob5=new Project_Manager();
        while(true)
        {
            menu();
            int op=ob.nextInt();
            double bp;
            if(op==1)
            {
                System.out.println("Programmer's Details :");
                ob1.Display();
                System.out.println("Enter the basic pay to get the salary details \nBasic pay :");
                bp=ob.nextDouble();
                ob2.net_salary(bp);
                ob2.salary_details();

            }
            else if(op==2)
            {
                System.out.println("Assistant project Manager's Details :");
                ob1.Display();
                System.out.println("Enter the basic pay to get the salary details \nBasic pay :");
                bp=ob.nextDouble();
                ob3.net_salary(bp);
                ob3.salary_details();

            }
            else if(op==3)
            {
                System.out.println("Team Leader's Details :");
                ob1.Display();
                System.out.println("Enter the basic pay to get the salary details \nBasic pay :");
                bp=ob.nextDouble();
                ob4.net_salary(bp);
                ob4.salary_details();

            }
            else if(op==4)
            {
                System.out.println("Project Manager's Details :");
                ob1.Display();
                System.out.println("Enter the basic pay to get the salary details \nBasic pay :");
                bp=ob.nextDouble();
                ob5.net_salary(bp);
                ob5.salary_details();

            }
            else if(op==5)
            {
                System.out.println("THANK YOU!");
                System.exit(1);
            }

        }

        

    }
    public static void menu()
    {
        System.out.println("1.Programmer \n2.Team Leader \n3.Assistant Project Manager \n4.Project Manager \n5.Exit");
        System.out.println("ENTER THE PROFILE OF EMPLOYEE WHOSE INFO IS DESIRED");

    }
    

}
class Employee
{

    double bp,da,hra,pf,club,net,gross;
String name;
String emp_id;
String mail_id;
String Address;
long MobNo;
Scanner ob=new Scanner(System.in);
Employee(){}
    public void set_emp_info()
    {
        System.out.println("Enter employee name ");
        String name=ob.nextLine();
        this.name=name;
        System.out.println("Enter employee ID ");
        String emp_id=ob.nextLine();
        this.emp_id=emp_id;
        System.out.println("Enter mail ID of employee ");
        String mail_id=ob.nextLine();
        this.mail_id=mail_id;
        System.out.println("Enter address");
        String Address=ob.nextLine();
        this.Address=Address;
        System.out.println("Enter mobile number");
        long MobNo=ob.nextInt();
        this.MobNo=MobNo;
    }
    public void Display()
    {
        System.out.println("EMPLOYEE DETAILS :");
        System.out.println("NAME :"+this.name+"\nEMPLOYEE ID :"+this.emp_id+"\nMAIL ID :"+this.mail_id+"\nADDRESS :"+this.Address);
        System.out.println("MOBILE NUMBER :"+this.MobNo);
    }

    public void net_salary(double basp)
    {
        this.bp=basp;
        this.da=0.97*this.bp;
        this.hra=0.1*this.bp;
        this.pf=0.12*this.bp;
        this.club=0.001*this.bp;
        this.gross=this.bp-this.pf;
        this.net=this.gross-this.hra-this.club;
    }
}
class Programmer extends Employee
{
    double bp,da,hra,pf,club,net,gross;
    public void net_salary(double basp)
    {
        this.bp=basp;
        this.da=0.97*this.bp;
        this.hra=0.1*this.bp;
        this.pf=0.12*this.bp;
        this.club=0.001*this.bp;
        this.gross=this.bp-this.pf;
        this.net=this.gross-this.hra-this.club;

    }
    public void salary_details()
    {
        System.out.println("BASIC PAY :"+this.bp);
        System.out.println("DA :"+this.da);
        System.out.println("HRA :"+this.hra);
        System.out.println("PF :"+this.pf);
        System.out.println("STAFF CLUB FUND :"+this.club);
        System.out.println("GROSS SALARY :"+this.gross);
        System.out.println("NET SALARY :"+this.net);
    }

}
class Team_Lead extends Employee
{
    double bp,da,hra,pf,club,net,gross;
   
    
    public void net_salary(double basp)
    {
        
        this.bp=basp;
        da=0.97*bp;
        hra=0.1*bp;
        pf=0.12*bp;
        club=0.001*bp;
        gross=bp-pf;
        net=gross-hra-club;

    }
    public void salary_details()
    {
        System.out.println("BASIC PAY :"+bp);
        System.out.println("DA :"+da);
        System.out.println("HRA :"+hra);
        System.out.println("PF :"+pf);
        System.out.println("STAFF CLUB FUND :"+club);
        System.out.println("GROSS SALARY :"+gross);
        System.out.println("NET SALARY :"+net);
    }



}
class Assistant_Project_Manager extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    public void net_salary(double basp)
    {
        this.bp=basp;
        da=0.97*bp;
        hra=0.1*bp;
        pf=0.12*bp;
        club=0.001*bp;
        gross=bp-pf;
        net=gross-hra-club;

    }
    public void salary_details()
    {
        System.out.println("BASIC PAY :"+bp);
        System.out.println("DA :"+da);
        System.out.println("HRA :"+hra);
        System.out.println("PF :"+pf);
        System.out.println("STAFF CLUB FUND :"+club);
        System.out.println("GROSS SALARY :"+gross);
        System.out.println("NET SALARY :"+net);
    }

}
class Project_Manager extends Employee
{
    double salary,bp,da,hra,pf,club,net,gross;
    public void net_salary(double basp)
    {
        this.bp=basp;
        da=0.97*bp;
        hra=0.1*bp;
        pf=0.12*bp;
        club=0.001*bp;
        gross=bp-pf;
        net=gross-hra-club;

    }
    public void salary_details()
    {
        System.out.println("BASIC PAY :"+bp);
        System.out.println("DA :"+da);
        System.out.println("HRA :"+hra);
        System.out.println("PF :"+pf);
        System.out.println("STAFF CLUB FUND :"+club);
        System.out.println("GROSS SALARY :"+gross);
        System.out.println("NET SALARY :"+net);
    }

}
