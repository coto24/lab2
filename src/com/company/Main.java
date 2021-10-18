package com.company;
import entities.*;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Benutzer eu= new Benutzer();
    eu.setVorname("Andrei");
    eu.setNachname("Cotofrei");
    List<Sport> l = new ArrayList<>(Arrays.asList(new Basketball(),new Basketball(),new Fussball(),new Hochsprung(), new Hochsprung(),new Hochsprung(), new Hindernislauf()));
    eu.setSportList(l);

    System.out.println(MessageFormat.format("ma numesc {0} {1}",eu.getNachname(), eu.getVorname()));
    System.out.println(MessageFormat.format("pentru antrenamente la basket am nevoie de {0} minute",eu.kalkuliereZeit(new Basketball())));
    System.out.println(MessageFormat.format("in total petrec {0} la antrenamente saptamanal",eu.kalkuliereZeit()));
    System.out.println(MessageFormat.format("in medie petrec {0} minute per antrenament",eu.Durchschnitszeit()));

    }
}
