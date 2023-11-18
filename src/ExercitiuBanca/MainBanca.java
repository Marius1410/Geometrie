package ExercitiuBanca;

import java.util.Scanner;

public class MainBanca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nume: ");
        String nume = scanner.nextLine();

        System.out.println("Varsta: ");
        int varsta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("CNP: ");
        String CNP = scanner.nextLine();

        System.out.println("Salariul Net: ");
        double salariuNet = scanner.nextInt();

        if (varsta < 18) {
            System.out.println("Persoana nu este eligibila pentru un credit.");

        } else {
            UnitateBancara unitateBancara;
            if (varsta >= 18 && varsta <= 40) {
                unitateBancara = new BancaPentruLocuinte();
            } else {
                unitateBancara = new BancaPentruNevoiPersonale();
            }

            Persoana persoana = new Persoana(nume, varsta, CNP, salariuNet);
            double credit = unitateBancara.calculCredit(persoana);
            double dobanda = unitateBancara.calculDobanta(persoana);
            System.out.println("Limita maxima a creditului " + credit);
            System.out.println("Dobanda " + dobanda);
        }


    }

}

