package entities;

import static org.junit.jupiter.api.Assertions.*;

class BasketballTest {

    @org.junit.jupiter.api.Test
    void kalkuliereZeit() {
        Basketball x= new Basketball();
        assertEquals(x.kalkuliereZeit(),55);
    }
}