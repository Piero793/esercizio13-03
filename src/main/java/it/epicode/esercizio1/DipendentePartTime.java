package it.epicode.esercizio1;

import lombok.Data;

@Data
public class DipendentePartTime extends Dipendente {

    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);

    }
    private double oreLavorate;

    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento, double oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return getStipendio() * oreLavorate;
    }
}
