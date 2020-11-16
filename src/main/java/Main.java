import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Zadanie 4 - Enum w Javie\nZadanie Karty do gry ♣ ♦ ♥ ♠");
        checkValue();
    }

    private static void checkValue() {
        System.out.println("Podaj range karty (ACE, KING, QUEEN, JACK)");
        Scanner scannerRank = new Scanner(System.in);
        String rankFromConsole = scannerRank.nextLine();
        Card card4 = new Card();
        try {
            Rank rank = Rank.valueOf(rankFromConsole);
            card4.setRank(rank);
            System.out.println("podaj kolor karty (CLUBS, DIAMONDS, HEARTS, SPADES");
            Scanner scannerSuit = new Scanner(System.in);
            String suitFromConsole = scannerSuit.nextLine();
            Suit suit = Suit.valueOf(suitFromConsole);
            System.out.println("Twoja karta to: ");
            card4.setSuit(suit);

        } catch (IllegalArgumentException e) {

            System.out.println("Podałeś złą wartość");
            checkValue();
        }

        card4.printDescription();
    }

}

