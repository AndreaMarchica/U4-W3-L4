package epicode.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Partita di calcio")
public class PartitaDiCalcio extends Event{

    /*ATTRIBUTI*/
    private String squadraDiCasa;
    private String squadraOspite;
    private String squadraVincente;
    private int goalSquadraDiCasa;
    private int goalSquadraOspite;


    /*COSTRUTTORI*/

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String squadraDiCasa, String squadraOspite, String squadraVincente, int goalSquadraDiCasa, int goalSquadraOspite) {
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        this.squadraVincente = squadraVincente;
        this.goalSquadraDiCasa = goalSquadraDiCasa;
        this.goalSquadraOspite = goalSquadraOspite;
    }

    /*METODI*/

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public String getSquadraVincente() {
        return squadraVincente;
    }

    public void setSquadraVincente(String squadraVincente) {
        this.squadraVincente = squadraVincente;
    }

    public int getGoalSquadraDiCasa() {
        return goalSquadraDiCasa;
    }

    public void setGoalSquadraDiCasa(int goalSquadraDiCasa) {
        this.goalSquadraDiCasa = goalSquadraDiCasa;
    }

    public int getGoalSquadraOspite() {
        return goalSquadraOspite;
    }

    public void setGoalSquadraOspite(int goalSquadraOspite) {
        this.goalSquadraOspite = goalSquadraOspite;
    }

    @Override
    public String toString() {
        return "PartitaDiCalcio{" +
                "squadraDiCasa='" + squadraDiCasa + '\'' +
                ", squadraOspite='" + squadraOspite + '\'' +
                ", squadraVincente='" + squadraVincente + '\'' +
                ", goalSquadraDiCasa=" + goalSquadraDiCasa +
                ", goalSquadraOspite=" + goalSquadraOspite +
                '}';
    }
}
