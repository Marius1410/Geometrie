package ExAnimal;

public class ProdusAlimentar extends Produs{
    String DataExpirare;

    public ProdusAlimentar(String nume, double pret, String dataExpirare) {
        super(nume, pret);
        DataExpirare = dataExpirare;
    }

    @Override
    public void AfisareDetalii() {
        super.AfisareDetalii();
        System.out.println("Data expirare: " + DataExpirare);
    }
}

