package Persoane;

import java.util.Scanner;

public class MainPersoana {
    public static void main(String[] args) {

//        Detalii Student:
        System.out.println("Detalii student: ");
        System.out.println("Nume: ");
        String numeStudent = scanner.nextLine();
        System.out.println("Varsta: ");
        int varstaStudent = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nume Universitate: ");
        String numeUniversitate = scanner.nextLine();

//        Detalii Angajat
        System.out.println("Detalii Angajat: ");
        System.out.println("Nume: ");
        String numeAngajat = scanner.nextLine();
        System.out.println("Varsta: ");
        int varstaAngajat = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nume companie: ");
        String Companie = scanner.nextLine();

        Persoana persoana = new Persoana(numePersoana, varstaPersoana);
        Student Student = new Student(numeStudent,varstaStudent, numeUniversitate);
        Angajat angajat = new Angajat(numeAngajat, varstaAngajat, Companie);

        System.out.println("Detalii persoana: ");
        persoana.AfisareDetalii();
        System.out.println("Detalii Student: ");
        Student.AfisareDetalii();
        System.out.println("Detalii angajat: ");
        angajat.AfisareDetalii();


    }

}
