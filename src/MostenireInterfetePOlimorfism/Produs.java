package MostenireInterfetePOlimorfism;

public class Produs {
    private String nume;
    private double pret;
    private double discount;

    public Produs(String nume, double pret) {

        this.nume = nume;
        this.pret = pret;
        this.discount = 0.50;
    }
    public void setDiscount(double discount) {
        if(discount >= 0 && discount<=100) {
            this.discount = discount;
        } else {
            System.out.println("Discount-ul nu este intre 0 si 100");

        }
    }
    public double CalculDiscount(){
        return pret - (pret * discount / 100);
    }
}
