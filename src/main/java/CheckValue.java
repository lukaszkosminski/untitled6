import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.xml.internal.bind.v2.runtime.IllegalAnnotationsException;

import java.util.Scanner;

public class CheckValue {

    public String checkValueRank() {
        System.out.println("podaj Rank");
        Scanner scannerRank = new Scanner(System.in);
        String rankFromConsole = scannerRank.nextLine();
        try {
            Rank rank = Rank.valueOf(rankFromConsole);
            System.out.println("jest ok rank");

        } catch (IllegalArgumentException e) {
            System.out.println("jest blad rank");
        }


        return rankFromConsole;
    }
    public String checkValueSuit() {
        System.out.println("podaj Suit");
        Scanner scannerSuit = new Scanner(System.in);
        String suitFromConsole = scannerSuit.nextLine();
        try {
            Suit suit = Suit.valueOf(suitFromConsole);
            System.out.println("jest ok suit");
        } catch (IllegalArgumentException e) {
            System.out.println("jest blad suit");
        }

        return suitFromConsole;
    }

}