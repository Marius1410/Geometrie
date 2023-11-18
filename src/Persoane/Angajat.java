package Persoane;

public class Angajat extends Persoana{
    String Companie;

    public Angajat(String nume, int varsta, String companie) {
        super(nume, varsta);
        Companie = companie;
    }

    @Override
    public void AfisareDetalii() {
        super.AfisareDetalii();
        System.out.println("Numele Companiei este: " + Companie);
    }
}
