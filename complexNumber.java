
import java.util.*;

public class complexNumber {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in); // creating object sc for taking input
    //sc.close();
    complexOp c1=new complexOp(0,0);  //creating two objects for two complex numbers
    complexOp c2=new complexOp(0,0);  //c1 and c2 is made here.
        System.out.println("Welcome to the complex number programme");
        System.out.println("Enter the first complex number you want: ");
        System.out.println("Real 1: ");
        c1.real=sc.nextFloat();
        System.out.println("Imaginary 1: ");
        c1.imag=sc.nextFloat();
        System.out.println("Enter the second complex number you want: ");
        System.out.println("Real 2: ");
        c2.real=sc.nextFloat();
        System.out.println("Imaginary 2: ");
        c2.imag=sc.nextFloat();
        System.out.print("First complex number :"); c1.print();
        System.out.print("Second complex number :"); c2.print();
        System.out.println("Enter the operation number you want perform :");
        System.out.println("1. Add");
        System.out.println("2. subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        while(true){
            int opt= sc.nextInt();
            if(opt==5) {
                System.out.println("Thank you for testing this programme");
                System.out.println("Assignment1 Submitted by Gaurav kumar");
                break;
            }
            else if(opt==1){
                complexOp t=new complexOp();
                t=complexOp.add(c1,c2);
                System.out.print("C1+C2 : "); t.print();
            }
            else if(opt==2){
                complexOp t=new complexOp();
                t=complexOp.sub(c1,c2);
                System.out.print("C1-C2 : "); t.print();
            }
            else if(opt==3){
                complexOp t=new complexOp();
                t=complexOp.mul(c1,c2);
                System.out.print("C1*C2 : "); t.print();
            }
            else{
                complexOp t=new complexOp();
                t=complexOp.div(c1,c2);
                System.out.print("C1/C2 : "); t.print();
            }
        }


    }

}
class  complexOp{
    public float real,imag;
    complexOp(){ //constructor is made here.
        real=0;
        imag=0;
    }
    complexOp(float num1,float num2){  // constructor used when a value is passed
        real=num1;
        imag=num2;
    }
    public void print( ){
        System.out.println( "( " + this.real + " ,  "); System.out.println(this.imag + "i" + ")" );
    }
    public static complexOp add(complexOp c1,complexOp c2){
        complexOp c=new complexOp(0,0);
        c.real=c1.real+ c2.real;
        c.imag= c2.imag+ c1.imag;
        return c;
    }
    public static complexOp sub(complexOp c1,complexOp c2){
        complexOp c=new complexOp(0,0);
        c.real=c1.real- c2.real;
        c.imag= c1.imag- c2.imag;
        return c;
    }
    public static  complexOp mul(complexOp c1,complexOp c2){
        complexOp c=new complexOp(0,0);
        c.real=(c1.real*c2.real) - (c1.imag* c2.imag);
        c.imag= (c1.real*c2.imag) +(c2.real*c1.imag) ;
        return c;
    }
    public static complexOp div(complexOp c1,complexOp c2){
        complexOp c=new complexOp(0,0); float k=c2.imag*c2.imag + c2.real* c2.real;
        c.real=(c1.real*c2.real) - (c1.imag* c2.imag);
        c.imag= (c1.real*c2.imag) +(c2.real*c1.imag) ;
        c.real=c.real/k;
        c.imag=c.imag/k;
        return c;
    }
}