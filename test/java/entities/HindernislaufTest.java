package entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HindernislaufTest {

    @Test
    void kalkuliereZeit() {
        Hindernislauf x=new Hindernislauf();
        assertEquals(x.kalkuliereZeit(),30);
    }
}