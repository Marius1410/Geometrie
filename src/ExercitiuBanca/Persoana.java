package ExercitiuBanca;

public class Persoana {
    double getSalariuNet;
    private String nume;
    private int varsta;
    private String CNP;
    private double SalariuNet;

    public Persoana(String nume, int varsta, String CNP, double salariuNet) {
        this.nume = nume;
        this.varsta = varsta;
        this.CNP = CNP;
        SalariuNet = salariuNet;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getCNP() {
        return CNP;
    }
    public double getSalariuNet() {
        return SalariuNet;
    }
}


