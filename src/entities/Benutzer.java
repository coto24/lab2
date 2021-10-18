package entities;

import java.util.List;

public class Benutzer {
    private String Vorname, Nachname;
    private List<Sport> sportList;

    /**
     * nur ein paar getters und setters
     * nothing to see here
     */
    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public List<Sport> getSportList() {
        return sportList;
    }

    public void setSportList(List<Sport> sportList) {
        this.sportList = sportList;
    }

    /**
     * hier berechnen wir die gesamte Zeit fur
     * alle Trainings eines Benutzers
     * @return double
     */
    public double kalkuliereZeit(){
        double zeit=0;
        for(Sport i:sportList)
            zeit+=i.kalkuliereZeit();
        return zeit;
    }

    /**
     * hier berechnen wir die Zeit fur
     * das Training einer bestimmten Art
     * von Sport
     * @return double
     */
    public double kalkuliereZeit(Sport x){
        return x.kalkuliereZeit();
    }

    /**
     * hier berechnen wir die durchschnitliche
     * Zeit fur alle Trainings eines Benutzers
     * @return double
     */
    public double Durchschnitszeit(){
        return kalkuliereZeit()/sportList.size();
    }
}
