package Persoane;

public class Persoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    public void AfisareDetalii() {
        System.out.println("Nume " + nume);
        System.out.println("Varsta " + varsta);
    }
}

