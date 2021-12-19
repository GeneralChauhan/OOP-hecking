// overloading
import java.util.Scanner;
class publication {
    Scanner sc = new Scanner(System.in);
    String title;
    float price;
    public int copies;

    public void setData() {
        System.out.println("Enter the title");
        title = sc.nextLine();
        System.out.println("Enter the price of each copy");
        price = sc.nextFloat();
        System.out.println("Enter the number of copies");
        copies = sc.nextInt();
    }

    publication() {
        title = null;
        price = 0.0f;
        copies = 0;
    }

    public void saleCopy(int qty) {
        System.out.println("total sale: " + (qty * price) + " copies");
        copies-=qty;
    }

    public void orderCopy(int pcopy) {
        saleCopy(pcopy);
    }

}

class book extends publication {
    String author;

   

    book() {
        
        author = null;
    }
    book (String name)
    {
        author=name;
    }

    
}

class magzine extends publication {
    int orderQty;
    String currentIssue;

    magzine() {
      
        orderQty = 0;
        currentIssue = null;
    }

    public void buy() {
        System.out.println("Enter the order of quantity");
        orderQty = sc.nextInt();
        orderCopy( orderQty);
        
    }

    public void recieve(String n,int newOrderQty) 
    { 
        currentIssue=n;
        copies=newOrderQty;
    }

}

public class PolyassNo2 {
    public static void main(String[] args) {
        book harryPotter = new book("Rowling");
        
        harryPotter.setData();
        harryPotter.orderCopy(harryPotter.copies);
        magzine indiaTimes = new magzine();
        indiaTimes.setData();
        indiaTimes.orderCopy(indiaTimes.copies);
        indiaTimes.buy();
        indiaTimes.recieve("2021 edition ", 100);

    }
}
