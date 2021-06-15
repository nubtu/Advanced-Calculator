import java.util.Scanner;
public class calc {

    private static Scanner nowyoubad;

	public static void main(String[] args) {
        System.out.println("Advanced Calculator v1.0");
        System.out.println("There are no decimals, you can only put in one operator, keep the numbers under ten characters long.");
        System.out.println("The operators are as follows:");
        System.out.println("+ for addition, / for division, * for multiplication and - for subtraction.");
        for(int t = 1; t > 0; t++) {
        int pope = 0;
        System.out.println("Enter Calculation... ");
        nowyoubad = new Scanner(System.in);
        String arph = nowyoubad.nextLine();
        String U2 = "0";

        if(arph.contains("+")) {
            pope = arph.indexOf("+");
            U2 = "+";
        }
        if(arph.contains("*")) {
            pope = arph.indexOf("*");
            U2 = "*";
        }
        if(arph.contains("-")) {
            pope = arph.indexOf("-");
            U2 = "-";
        }
        if(arph.contains("/")) {
            pope = arph.indexOf("/");
            U2 = "/";
        }
        String smack = arph.substring(0, pope);
        String wack = arph.substring(pope+1, arph.length());
        int number = Integer.valueOf(smack);
        int numberpoo = Integer.valueOf(wack);
        if(U2.equals("+")) {
            System.out.println(number+numberpoo);
        }
        if(U2.equals("-")) {
            System.out.println(number-numberpoo);
        }
        if(U2.equals("/")) {
            System.out.println(number/numberpoo);
        }
        if(U2.equals("*")) {
            System.out.println(number*numberpoo);

        }

        }
    }
}