package it.epicode.esercizio1;

import it.epicode.esercizio3.CheckIn;
import it.epicode.esercizio3.Volontario;

import static it.epicode.esercizio1.Dipartimento.*;

public class Main {
    public static void main(String[] args) {
      /*  Dipendente dipendente1 = new Dipendente(12345, 1000, PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(67890, 1500, AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente(24689, 2000, VENDITE);

        Dipendente[] dipendenti = {dipendente1, dipendente2, dipendente3};

        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola());

        }*/

      /*          Dipendente dipendente1 = new DipendenteFullTime(12345, 1000,PRODUZIONE);
                Dipendente dipendente2 = new DipendentePartTime(67890, 1500,VENDITE);
                Dipendente dipendente3 = new Dirigente(24689, 2000,AMMINISTRAZIONE);
                Dipendente[] dipendenti = {dipendente1, dipendente2,dipendente3};

        for (Dipendente dipendente : dipendenti) {
            System.out.println("Matricola: " + dipendente.getMatricola());
            System.out.println("Dipartimento: " + dipendente.getDipartimento());
            System.out.println("Stipendio: " + dipendente.getStipendio());
            System.out.println("Bonus: " + dipendente.calculateSalary());
            System.out.println("---------------------------");
        }*/

        Dipendente dipendente1 = new DipendenteFullTime(12345, 1000, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new DipendentePartTime(67890, 1500, Dipartimento.VENDITE);
        Volontario volontario1 = new Volontario("Mario Rossi", "insomma", 30);
        Volontario volontario2 = new Volontario("Giulia Bianchi", "ottimo", 27);

        CheckIn[] partecipanti = {dipendente1, dipendente2,volontario1, volontario2};

        for (CheckIn partecipante : partecipanti) {
            partecipante.checkIn();
        }






    }
}
