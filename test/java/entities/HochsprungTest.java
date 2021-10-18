package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HochsprungTest {

    @Test
    void kalkuliereZeit() {
        Hochsprung x=new Hochsprung();
        assertEquals(x.kalkuliereZeit(),20);
    }
}