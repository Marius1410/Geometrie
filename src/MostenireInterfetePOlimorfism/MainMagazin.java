package MostenireInterfetePOlimorfism;

import java.util.Scanner;

public class MainMagazin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti produsul dorit");
        System.out.println("Nume: ");
        String nume = sc.nextLine();
        System.out.println("Pret: ");
        double pret = sc.nextDouble();

        System.out.println("Selectati Produsul - Imbracaminte - Ingrijire personala - Electronice: ");
        sc.nextLine();
        String tipProdus = sc.nextLine().toLowerCase();



            switch (tipProdus) {
                case "imbracaminte":
                    System.out.print("Tipul de îmbrăcăminte (pantaloni, bluza, accesoriu): ");
                    String tipImbracaminte = sc.nextLine().toLowerCase();
                    Imbracaminte imbracaminte = new Imbracaminte(nume, pret, tipImbracaminte);
                    imbracaminte.DiscaountAplicatInFunctieDeTip();
                    System.out.println("Prețul final după discount: " + imbracaminte.CalculDiscount());
                    break;
                case "ingrijire persoanala":
                    System.out.print("Produsul poate fi returnat (da/nu): ");
                    boolean poateFiReturnat = sc.nextLine().equalsIgnoreCase("da");
                    IngrijirePersonala ingrijirePersoanala = new IngrijirePersonala(nume, pret, poateFiReturnat);
                    ingrijirePersoanala.DiscountAplicatInFunctieDeConditiileDeReturnare();
                    System.out.println("Prețul final după discount: " + ingrijirePersoanala.CalculDiscount());
                    break;
                case "electronice":
                    System.out.print("Voltajul: ");
                    int voltaj = sc.nextInt();
                    Electronice electronice = new Electronice(nume, pret, voltaj);
                    electronice.VerificaVoltajul();
                    System.out.println("Prețul final: " + electronice.CalculDiscount());
                    break;
                default:
                    System.out.println("Eroare: Tip de produs necunoscut.");
            }
        }


        }

