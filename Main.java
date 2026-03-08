
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        Running r = new Running();
        Cycling c=new Cycling();
        CalorieCalculator c1 = new CalorieCalculator();
        do{
        System.out.println("Enter what you want in numbers \n1.Enter workout\n2. Running\n3.Cycling\n4. Calorie Calculator");
        int choice = scanner.nextInt();
        switch(choice){
            case 1: System.out.println("enter the name of workout");
                    scanner.nextLine();
                    r.name = scanner.nextLine();
                    System.out.println("enter the duration of workout");
                    r.duration = scanner.nextInt();
                    r.showworkout();
                    c1.caluculator(r.duration);
                    break;
            case 2 : System.out.println("enter the distance in kms");
                    r.distance = scanner.nextInt();
                    r.name = "Morning run";
                    r.duration = 20;
                    r.showworkout();
                    r.showrunning();
                    c1.caluculator(r.duration);
                    break;
            case 3: System.out.println("enter the speed you went");
                    c.speed=scanner.nextInt();
                    c.name = "cycling";
                    c.duration = 25;
                    
                    c.showworkout();
                    c.showcycling();
                        c1.caluculator(c.duration);
                    break;
            case 4: System.out.println("enter the minutes and intensity ");
                    int time = scanner.nextInt();
                    int intensity = scanner.nextInt();
                     System.out.println("the calories for both time and intensity is : "+c1.caluculator(time, intensity));
                     System.out.println("the calories for only time is : "+c1.caluculator(time));
                    break;
            default: System.out.println("invalid choice ");
            System.exit(0);
            break;
        }
    }while(true);
}

}


