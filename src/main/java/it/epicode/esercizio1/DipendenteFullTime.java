package it.epicode.esercizio1;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    void calculateSalary() {
        System.out.println("stipendio full time 2000 euro");
    }
}
