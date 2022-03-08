package it.itcubeconsulting;

public class Giocatore2 extends Giocatore1{

    private int salute;
    private final boolean armatura;

    public Giocatore2(String nome, String armi, int salute, boolean armatura) {
        super(nome, armi, salute);
        this.salute = salute;
        this.armatura = armatura;
    }

    @Override
    public void danniArmi1() {
        if (armatura){
            this.salute -=20;
            if (this.salute <=0) this.salute = 0;
            System.out.println("Armatura attiva. Colpito da armi1. Salute e rodotto di 20." + ". Nuovi punti salute: " + this.salute);
        }if (!armatura){
            this.salute -=30;
            if (this.salute <=0) this.salute = 0;
            System.out.println("Armatura disattiva. Colpito da armi1. Salute e rodotto di  30." + ". Nuovi punti salute: " + this.salute);

        }
        if (this.salute == 0){
            System.out.println(getNome() + " e morto");
        }
    }

    @Override
    public void danniArmi2() {
        if (armatura){
            this.salute -=40;
            if (this.salute <=0) this.salute = 0;
            System.out.println("Armatura attiva. Colpito da armi1. Salute e rodotto di 40." + ". Nuovi punti salute: " + this.salute);
        }if (!armatura){
            this.salute -=50;
            if (this.salute <=0) this.salute = 0;
            System.out.println("Armatura disattiva. Colpito da armi1. Salute e rodotto di  50." + ". Nuovi punti salute: " + this.salute);

        }
        if (this.salute == 0){
            System.out.println(getNome() + " e morto");
        }
    }

    @Override
    public void guarisci() {
        super.guarisci();
    }
}
