package ExercitiuBanca;

public class BancaPentruNevoiPersonale implements UnitateBancara {
    @Override
    public double calculCredit(Persoana Persoana) {
        return Persoana.getSalariuNet() * 10;
    }

    @Override
    public double calculDobanta(Persoana Persoana) {
        return calculCredit(Persoana) * 0.08;
    }
}
