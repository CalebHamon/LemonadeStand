
import java.util.Scanner;

public class Lemonade {
    public static void main(String[] args) {
        double givenMon = 20.00;
        String input;
        String pitcher = "PITCHER";
        int inputMath;
        double mrWorldWide;
        double yNeg;
        int manyP;
        int manyIB;
        int manyL;
        int manyCOS;
        Scanner scan = new Scanner(System.in);
        System.out.println("STORE:"); 
        System.out.println("PITCHER @ $2.00");
        System.out.println("ICE BAGS (100 CUBES PER PACK): $1.05");
        System.out.println("LEMONS: $.06");
        System.out.println("CUPS OF SUGAR: $0.29");
        System.out.println("WHAT WOULD YOU LIKE?");
        input = scan.nextLine();
        if(input.toUpperCase() == pitcher) {
            for (int i = 0; i > 2; i++){
                System.out.println("HOW MUCH WOULD YOU LIKE?");
                inputMath = scan.nextInt();
                mrWorldWide = inputMath*2;
                yNeg = givenMon - mrWorldWide;
                if(!(yNeg < 0)) {
                    givenMon = yNeg;
                    manyP = inputMath;
                    i = 1;
                }
                else {
                    i = 4;
                }
            }
        }

    }
}