package it.epicode.esercizio1;

public class Dirigente extends Dipendente{

    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    void calculateSalary() {
        System.out.println("stipendio dirigente 3000 euro");
    }
}
