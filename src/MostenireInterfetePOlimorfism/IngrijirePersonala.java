package MostenireInterfetePOlimorfism;

public class IngrijirePersonala extends Produs {
    private boolean poateFiReturnat;

    public IngrijirePersonala(String nume, double pret, boolean poateFiReturnat) {
        super(nume, pret);
        this.poateFiReturnat = poateFiReturnat;
    }

    public void DiscountAplicatInFunctieDeConditiileDeReturnare() {

        if (!poateFiReturnat) {
            setDiscount(20);
        }

    }
    }