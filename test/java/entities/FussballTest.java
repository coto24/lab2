package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FussballTest {

    @Test
    void kalkuliereZeit() {
        Fussball x=new Fussball();
        assertEquals(x.kalkuliereZeit(), 65);
    }
}