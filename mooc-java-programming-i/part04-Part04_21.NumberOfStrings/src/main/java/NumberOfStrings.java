
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while(true){
            String var = String.valueOf(scanner.nextLine());
            if (var.equals("end")){
                System.out.println(counter);
                break;
            }
            counter++;
        }
    }
}
