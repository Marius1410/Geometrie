package MostenireInterfetePOlimorfism;

public class Imbracaminte extends Produs {
    private String TipImbracaminte;
    public Imbracaminte(String nume, double pret, String TipImbracaminte) {
        super(nume, pret);
    }
    public void DiscaountAplicatInFunctieDeTip() {
        if (TipImbracaminte != null)
    switch (TipImbracaminte.toLowerCase()){
            case "pantaloni":
                setDiscount(10);
                break;
        case "bluza":
            setDiscount(15);
            break;
        case "accesoriu":
            setDiscount(30);
            break;

        default:
            System.out.println("Eroare - Tip imbracaminte necunoscut");
        }
    }
}

