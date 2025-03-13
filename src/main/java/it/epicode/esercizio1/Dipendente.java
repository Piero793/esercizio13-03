package it.epicode.esercizio1;

import it.epicode.esercizio3.CheckIn;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Dipendente implements CheckIn {
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(int matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    @Override
    public void checkIn() {
        System.out.println("turno iniziato");
    }

    public abstract double calculateSalary();
}