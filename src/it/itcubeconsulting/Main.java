package it.itcubeconsulting;

import javax.xml.transform.Source;

public class Main {

    public static void main(String[] args) {

        Giocatore1 giocatore = new Giocatore1("Prova", "Spada",200);
        //System.out.println(giocatore.getNome());
       // System.out.println(giocatore.getSalute());
       // System.out.println(giocatore.getArmi());

           giocatore.danniArmi1();
            giocatore.danniArmi1();
           // giocatore.danniArmi2();
            giocatore.guarisci();

        Giocatore2 giocatore2 = new Giocatore2("Mario","pistola",80,true);
         giocatore2.danniArmi1();
    }
}
