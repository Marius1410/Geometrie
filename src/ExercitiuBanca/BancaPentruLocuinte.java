package ExercitiuBanca;

public class BancaPentruLocuinte implements UnitateBancara {

    @Override
    public double calculCredit(Persoana Persoana) {
        return Persoana.getSalariuNet() * 100;

    }

    @Override
    public double calculDobanta(Persoana Persoana) {
        return calculCredit(Persoana) * 0.05;
    }
}
