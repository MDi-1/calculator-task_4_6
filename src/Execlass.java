import java.util.*;

class Execlass {
    float sum = 0;
    char sign = '+';
    boolean run = true;

    public float operator(float num, char sign) {
        switch (sign) {
            case '+': sum = sum + num; break;
            case '-': sum = sum - num; break;
            case '=': this.run = false; break;
            default : this.run = false;
        }
        System.out.println("[Calculator] :result = " + sum);
        return this.sum;
    }
    public static void main (String[] args) {
        Execlass theOperation = new Execlass();

        while (theOperation.run) {
            System.out.println (
                    "[Calculator] :Please type the number, then press enter." +
                            "For the floating point use comma (,) For negative number use minus (-)");
            System.out.print ("[Calculator] :");
            Scanner scan1 = new Scanner (System.in);
            float num = scan1.nextFloat();

            theOperation.operator(num, theOperation.sign);

            System.out.println( "[Calculator] : Please type + or - or = to perform operation.");
            System.out.print ("[Calculator] :");
            Scanner scanC = new Scanner (System.in);
            theOperation.sign = scanC.nextLine().charAt(0);
            if (theOperation.sign == '=') theOperation.operator(num, theOperation.sign);
        }
    }
}
