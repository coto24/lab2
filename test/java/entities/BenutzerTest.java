package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
class BenutzerTest {

    @Test
    void setVorname() {
        Benutzer x=new Benutzer();
        x.setVorname("Andrei");
        assertEquals(x.getVorname(),"Andrei");
    }

    @Test
    void setNachname() {
        Benutzer x=new Benutzer();
        x.setNachname("Cotofrei");
        assertEquals(x.getNachname(),"Cotofrei");
    }

    @Test
    void setSportList() {
        Benutzer x=new Benutzer();
        List<Sport> l = new ArrayList<>();
        l.add(new Basketball());l.add(new Basketball());
        l.add(new Fussball());
        l.add(new Hochsprung());l.add(new Hochsprung());l.add(new Hochsprung());
        l.add(new Hindernislauf());


        x.setSportList(l);
        List<Sport> rez = x.getSportList();
        for(int i=0;i<l.size();i++) {
            assertEquals(l.get(i).kalkuliereZeit(), rez.get(i).kalkuliereZeit());
            //daca e aceasi valoare la kalkulierezeit, e aceasi clasa
        }
    }

    @Test
    void kalkuliereZeit() {
        Benutzer x = new Benutzer();
        List<Sport> l = new ArrayList<>();
        l.add(new Basketball());
        l.add(new Basketball());
        l.add(new Fussball());
        l.add(new Hochsprung());
        l.add(new Hochsprung());
        l.add(new Hochsprung());
        l.add(new Hindernislauf());


        x.setSportList(l);
        int sum = 0;
        for (Sport i : l) {
            sum += i.kalkuliereZeit();
            assertEquals(x.kalkuliereZeit(),sum);
        }
    }

    @Test
    void testKalkuliereZeit() {
        Benutzer x = new Benutzer();
        Fussball f=new Fussball();
        assertEquals(x.kalkuliereZeit(f),f.kalkuliereZeit());
    }

    @Test
    void durchschnitszeit() {
            Benutzer x=new Benutzer();
            List<Sport> l = new ArrayList<>();
            l.add(new Basketball());l.add(new Basketball());
            l.add(new Fussball());
            l.add(new Hochsprung());l.add(new Hochsprung());l.add(new Hochsprung());
            l.add(new Hindernislauf());


            x.setSportList(l);
            int sum=0;
            for(Sport i:l) {
                sum+=i.kalkuliereZeit();
                assertEquals(x.Durchschnitszeit(), sum/l.size());
        }
    }
}