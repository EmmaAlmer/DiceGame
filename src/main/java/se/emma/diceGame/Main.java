package se.emma.diceGame;
import java.util.Scanner;
import java.util.Random;

//skapad av emma almer

public class Main {

    public static void main(String[] args) {

        //initierar scanner
        Scanner scanner = new Scanner(System.in);

        //skapa spelare 1
        System.out.println("skriv in namnet för spelare 1");
        String nameOne = scanner.nextLine();
        Player playerOne = new Player(nameOne);

        //skapa spelare 2
        System.out.println("skriv in namnet för spelare 2");
        String nameTwo = scanner.nextLine();
        Player playerTwo = new Player(nameTwo);

        //bekräftelse för namn och instruktioner
        System.out.println("Välkommen: " + playerOne.getName() + " och " + playerTwo.getName() + "!" +
                " Nu ska vi spela tärningsspelet! Man rullar tärningen två gånger var. " + playerOne.getName() +
                " du börjar! tryck på ENTER för att rulla tärningen");

        //går vidare i programmet för att börja med logiken
        scanner.nextLine();

        //instans av random klassen
        Random random = new Random();

        //första genereringen av kast tal
        int rollOne = random.nextInt(6) + 1;
        System.out.println(rollOne);

        //bekräftelse av första omgången och start till andra omgången med spelare 2
        System.out.println(playerOne.getName() + " du fick: " + rollOne + ". " + playerTwo.getName() + " det är din tur att trycka på ENTER");

        //omgång 2
        scanner.nextLine();
        int rollTwo = random.nextInt(6) + 1;
        System.out.println(rollTwo);
        System.out.println(playerTwo.getName() + " du fick: " + rollTwo + ". " + playerOne.getName() + " det är återigen din tur att trycka på ENTER");

        //omgång 3
        scanner.nextLine();
        int rollThree = random.nextInt(6) + 1;
        System.out.println(rollThree);
        System.out.println(playerOne.getName() + " du fick: " + rollThree + ". " + playerTwo.getName() + " kör så det ryker, tryck på ENTER för att rulla tärningen en sista gång");

        //omgång 4
        scanner.nextLine();
        int rollFour = random.nextInt(6) + 1;
        System.out.println(rollFour);
        System.out.println(playerTwo.getName() + " du fick: " + rollFour + ". Tryck på enter för att se vem som vann!");

        //resultatuträkningen börjar här

        scanner.nextLine();

        //sparar tärningskastens summa per spelare
        int resultPlayerOne = rollOne + rollThree;
        int resultPlayerTwo = rollTwo + rollFour;

        //skriver ut beroende vem som vann
        if (resultPlayerOne > resultPlayerTwo) {
            System.out.println("grattis " + playerOne.getName() + " du vann med " + resultPlayerOne + " poäng!");

        } else if (resultPlayerTwo == resultPlayerOne) {
            System.out.println("womp womp, ni båda fick " + resultPlayerOne + " vilket betyder att ni båda är förlorare");
        }
        else {
            System.out.println("grattis " + playerTwo.getName() + " du vann med " + resultPlayerTwo + " poäng!");
        }
    }
}
