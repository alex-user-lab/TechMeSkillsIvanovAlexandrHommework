
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner myInput = new Scanner( System.in );
            Computer comp = new Computer();
            while (true) {
                System.out.print("Enter number for On:");
                int a = myInput.nextInt();
                comp.On(a);
                comp.showDescription();
                System.out.print("Enter number for Off:");
                int b = myInput.nextInt();
                comp.Off(b);
                comp.showDescription();
            }
        }
    }

