import java.util.Scanner;

public class assnNo6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        

        // ------------------------------Array out of bound Exception----------------------------
        int[] array = new int[3];

        System.out.println("Enter the Index you want to add data in: ");

        int ind=input.nextInt();

        try {
            System.out.println(array[ind]);
        } catch (ArrayIndexOutOfBoundsException e) {
           
            System.out.println("\nIndex out of bounds");
        }


        // ----------------------------Divide by zero Exception----------------------------------------------------------------

        try {
            System.out.println("\nEnter the Numerator: ");
            String nue=input.next();
            
            System.out.println("\nEnter the Denominator: ");
            String den=input.next();
           array[0]=Integer.parseInt(nue);
           array[1]=Integer.parseInt(den);

            try {
                array[2] = array[0]/array[1];  
                System.out.println ("\nResult = " + array[2]);
            }
            catch(ArithmeticException e) {
                System.out.println ("Can not be divided as Denominator is Zero  '0'  ");
            }
            /* --------------------------NumberFormatException------------------------------------------------ */
            
        } catch (NumberFormatException e) {
            
            System.out.println("Input is not a number ");
        }
        input.close();

        

    }
}
