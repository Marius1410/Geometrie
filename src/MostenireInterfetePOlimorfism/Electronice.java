package MostenireInterfetePOlimorfism;

import java.util.Scanner;

public class Electronice extends Produs {
    private int voltaj;

    public Electronice(String nume, double pret, int voltaj) {
        super(nume, pret);
        this.voltaj = voltaj;
    }

    //    public void VerificareVoltaj() {
//        if (voltaj >= 220 && voltaj <= 240) {
//        }else {
//            System.out.println("Voltajul nu este adecvat");
    public void setVoltaj() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduceți voltajul (între 220 și 240): ");
            voltaj = sc.nextInt();
            if (voltaj < 220 || voltaj > 240) {
                System.out.println("Voltajul nu este în intervalul corect (220 - 240).");
            }

        } while (voltaj < 220 || voltaj > 240);
    }

    public void VerificaVoltajul() {
        setVoltaj();
        System.out.println("Voltajul introdus este în intervalul corect (220 - 240).");
    }
}




