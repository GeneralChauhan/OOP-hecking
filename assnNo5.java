//menu driven
import java.util.Scanner;
public class assnNo5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int k;
        do
        {
            System.out.println("Choose one vehicle");
            System.out.println(" 1. Car \n 2. Bike \n 3. Cycle \n 4. exit menu \n");
            k=input.nextInt();
            if(k==1)
            {
                Car lambo=new Car();
                while(true)
                {
                    int car ;
                    
                    System.out.println(" 1. Change gear \n 2.Change speed \n 3. gearDown \n 4. Apply Break \n 5. Handle \n 6. horn \n 7. Stop the car and exit.");
                    car=input.nextInt();
                    if(car==1)
                    {
                        int x ;
                        System.out.println("Enter the gear in which you want to shif to");
                        x=input.nextInt();
                        lambo.change_gear(x);
                    }
                    else if(car==2)
                    {
                        int x ;
                        System.out.println("Enter the speed in which you want ");
                        x=input.nextInt();
                        lambo.change_speed(x);
                    }
                    else if(car==3)
                    {
                        lambo.gearDown();
                    }
                    else if(car==4)
                    {
                        int x ;
                        System.out.println("Enter the magnitude of break");
                        x=input.nextInt();
                        lambo.apply_break(x);
                    }
                    else if(car==5)
                    {
                        String x ;
                        System.out.println("Which direction you want to turn to");
                        x=input.next();
                        lambo.handle(x);
                    }
                    else if(car==6)
                    {
                        lambo.horn();
                    }
                    else
                    {
                        lambo.show_gear();
                        lambo.show_gear();
                        lambo.change_speed(0);
                        
                        break;
                    }
                }
            }

        }while(k!=4);
        

    }
}

interface vehicles {

    void change_gear(int x);

    void gearUp();

    void gearDown();

    void change_speed(int s);

    void apply_break(int k);

    void handle(String direction);

    void headlight(Boolean f);

    void horn();

}

class Car implements vehicles {

    int speed = 0;
    int gear = 0;
    final int max_gear = 6;
    String horn_S = "Boo";
    final int max_speed = 220;
    boolean f = false;

    public void info() {
        show_gear();
        show_speed();
        headlight(f);
    }

    void show_speed() {
        System.out.println("Current speed is: = " + speed + "kmph" + "\n");
    };

    void show_gear() {
        System.out.println("Current gear is = " + gear);
    };

    public void headlght(Boolean f) {
        if (f)
            System.out.println("Head light is on");
        else
            System.out.println("Head light is off");
    }

    public void horn() {
        System.out.println(horn_S);
    }

    public void change_gear(int x) {
        this.gear += x;
    }

    public void apply_break(int k) {
        this.speed -= k;
    }

    public void gearUp() {
        if (this.gear == max_gear) {
            System.out.println(" You are on max gear");
        } else
            this.gear += 1;
    }

    public void gearDown() {
        if (this.gear == 0)
            System.out.println("You are on nuetral");
        else
            this.gear -= 1;
    }

    public void change_speed(int s) {
        if (s == max_speed) {
            System.out.println("You are riding at max speed!!, Hold your horses.");
        } else {
            this.speed += s;
            this.speed = Math.min(this.speed, max_speed);
        }
    }

    public void handle(String direction) {
        if (direction == "left") {
            System.out.println("The Car is turning left.");
        } else {
            System.out.println("The Car is turning right.");
        }
    }

    public void headlight(Boolean f) {
        if (f == true) {
            System.out.println("The headlights are turned on");
        } else {
            System.out.println("The headlights are turned off");
        }
    }

}

class Cycle implements vehicles {

    int speed = 0;
    int gear = 0;
    final int max_gear = 7;
    String horn_S = "beepbeep";
    final int max_speed = 40;
    Boolean f = false;

    public void info() {
        show_gear();
        show_speed();
        headlight(f);
    }

    void show_speed() {
        System.out.println("Current speed is: = " + speed + "kmph" + "\n");
    };

    void show_gear() {
        System.out.println("Current gear is = " + gear);
    };

    public void horn() {
        System.out.println(horn_S);
    }

    public void change_gear(int x) {
        this.gear += x;
    }

    public void apply_break(int k) {
        this.speed -= k;
    }

    public void headlght(Boolean f) {
        if (f)
            System.out.println("Head light is on");
        else
            System.out.println("Head light is off");
    }

    public void gearUp() {
        if (this.gear == max_gear) {
            System.out.println(" You are on max gear");
        } else
            this.gear += 1;
    }

    public void gearDown() {
        if (this.gear == 0)
            System.out.println("You are on nuetral");
        else
            this.gear -= 1;
    }

    public void change_speed(int s) {
        if (s == max_speed) {
            System.out.println("You are riding at max speed!!, Hold your horses.");
        } else {
            this.speed += s;
            this.speed = Math.min(this.speed, max_speed);
        }
    }

    public void handle(String direction) {
        if (direction == "left") {
            System.out.println("The Cycle is turning left.");
        } else {
            System.out.println("The Cycle is turning right.");
        }
    }

    public void headlight(Boolean f) {
        if (f == true) {
            System.out.println("The headlights are turned on");
        } else {
            System.out.println("The headlights are turned off");
        }
    }

}

class Bike implements vehicles {

    int speed = 0;
    int gear = 0;
    final int max_gear = 4;
    String horn_S = "Pepepee";
    final int max_speed = 120;
    Boolean f = false;

    public void info() {
        show_gear();
        show_speed();
        headlight(f);
    }

    void show_speed() {
        System.out.println("Current speed is: = " + speed + "kmph" + "\n");
    };

    void show_gear() {
        System.out.println("Current gear is = " + gear);
    };

    public void horn() {
        System.out.println(horn_S);
    }

    public void change_gear(int x) {
        this.gear += x;
    }

    public void headlght(Boolean f) {
        if (f)
            System.out.println("Head light is on");
        else
            System.out.println("Head light is off");
    }

    public void apply_break(int k) {
        this.speed -= k;
    }

    public void gearUp() {
        if (this.gear == max_gear) {
            System.out.println(" You are on max gear");
        } else
            this.gear += 1;
    }

    public void gearDown() {
        if (this.gear == 0)
            System.out.println("You are on nuetral");
        else
            this.gear -= 1;
    }

    public void change_speed(int s) {
        if (s == max_speed) {
            System.out.println("You are riding at max speed!!, Hold your horses.");
        } else {
            this.speed += s;
            this.speed = Math.min(this.speed, max_speed);
        }
    }

    public void handle(String direction) {
        if (direction == "left") {
            System.out.println("The Bike is turning left.");
        } else {
            System.out.println("The Bike is turning right.");
        }
    }

    public void headlight(Boolean f) {
        if (f == true) {
            System.out.println("The headlights are turned on");
        } else {
            System.out.println("The headlights are turned off");
        }
    }

}