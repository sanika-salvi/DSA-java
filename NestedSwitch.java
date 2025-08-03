
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int EmpId = input.nextInt();
        String Department = input.next();
   
        switch(EmpId) {
            case 1:
                System.out.println("Emp no 1");
                break;
            case 2:
                System.out.println("Emp no 2");
                break;
            case 3:
                switch (Department){
                    case "IT":
                        System.out.println("Information Technology");
                        break;
                    case"CS":
                        System.out.println("Computer Science");
                        break;
                    default:
                        System.out.println("No Department Entered");
                        break;
                }
                default:
                    System.out.println("No EmpId Entered");
        }  
    }              
}
