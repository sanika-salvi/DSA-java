import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("king of fruit");
                break;
            case "jackfruit":
                System.out.println("Green colour");
                break;
            case "Strawberry":
                System.out.println("sweet fruit");
                break;
            default:
                System.out.println("Enter valid fruit");
            

        }
    }



    
}
