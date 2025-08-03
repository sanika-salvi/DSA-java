public class Conditions{
    public static void main(String[] args) {

        int salary = 12000;
        
        if (salary > 10000) {
           salary = salary + 500;
        } else {
            salary = salary + 100;
        }
    
        System.out.println(salary);
    }
}