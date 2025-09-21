import java.util.Random;
import java.util.Scanner;

public class diceRoller {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Dice notation to roll: ");
        String diceRollString = sc.nextLine();

        if(diceRollString.indexOf("d") == -1){
            sc.close();
            throw new IllegalArgumentException("no \"d\" delimitor found");
        }

        int dieDelimiterIndex = diceRollString.indexOf("d");

        int dieAmt = Integer.parseInt(diceRollString.substring(0, dieDelimiterIndex));
        System.out.println("Die amt: " + dieAmt);

        int dieSize = Integer.parseInt(diceRollString.substring(dieDelimiterIndex + 1,diceRollString.length()));
        System.out.println("Die size: " + dieSize);

        int total = 0;
        int roll;
        System.out.print("Rolls: [");
        for (int i = 0; i < dieAmt; i++) {
            roll = rand.nextInt(dieSize) + 1;
            total += roll;
            System.out.print(roll + " ");
        }

        System.out.print("]\n");
        System.out.println("Total: " + total);

        sc.close();
    }
}
