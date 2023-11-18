package Persoane;

public class Student extends Persoana {
    String NumeUniversitate;

    public Student(String nume, int varsta, String numeUniversitate) {
        super(nume, varsta);
        NumeUniversitate = numeUniversitate;
    }



    @Override
    public void AfisareDetalii() {
        super.AfisareDetalii();
        System.out.println("Universitate " + NumeUniversitate);
    }
}

