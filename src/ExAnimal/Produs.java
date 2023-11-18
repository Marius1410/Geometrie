package ExAnimal;

public class Produs {
    private String nume;
    private double pret;

    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void AfisareDetalii() {
        System.out.println("Nume " + nume);
        System.out.println("Pret " + pret);

    }

}
