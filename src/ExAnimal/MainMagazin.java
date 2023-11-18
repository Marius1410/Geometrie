package ExAnimal;

public class MainMagazin {
    public static void main(String[] args) {
        ProdusAlimentar produsAlimentar = new ProdusAlimentar("Paine", 2.5, "25.09.2023");
        ProdusElectronic produsElectronic = new ProdusElectronic("Telefon", 1500, 12);
        System.out.println("Detaliile despre produsul alimentar: ");
        produsAlimentar.AfisareDetalii();
        System.out.println("Detaliile despre produsul electronic: ");
        produsElectronic.AfisareDetalii();

    }

}
