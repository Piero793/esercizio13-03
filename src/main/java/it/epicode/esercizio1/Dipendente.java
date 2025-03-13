package it.epicode.esercizio1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
abstract class Dipendente {
        @Getter
    private int matricola;
        @Getter
    private double stipendio;
        @Getter
    @Setter
    private Dipartimento dipartimento;
        abstract void calculateSalary();

    public Dipendente(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }
}
