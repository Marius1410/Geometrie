package ExAnimal;

public class ProdusElectronic extends Produs {
    int garantie;

    public ProdusElectronic(String nume, double pret, int garantie) {
        super(nume, pret);
        this.garantie = garantie;
    }


    @Override
    public void AfisareDetalii() {
        super.AfisareDetalii();
        System.out.println("Granatie este:" + garantie + "luni.");
    }

}


