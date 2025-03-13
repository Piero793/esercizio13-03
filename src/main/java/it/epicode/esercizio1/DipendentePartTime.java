package it.epicode.esercizio1;

public class DipendentePartTime extends Dipendente {

    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    void calculateSalary() {
        System.out.println("stipendio part time 500 euro");
    }
}
