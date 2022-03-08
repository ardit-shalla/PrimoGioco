package it.itcubeconsulting;

public class Giocatore1 {

    private String nome;
    private String armi;
    private int salute;

    public Giocatore1(String nome, String armi, int salute) {
        this.nome = nome;
        this.armi = armi;

        if (salute < 0 || salute > 100) {
            this.salute = 100;    // limito a 100 l input salute
        } else this.salute = salute;// altrimenti input utente

    }

    public void danniArmi1() {
        this.salute -= 30;
        if (this.salute <= 0) {
            this.salute = 0;
        }
        System.out.println("Colpito dal armi1. Salute ridotta con 30" + ". Nuovi punti salute: " + this.salute);
        if (this.salute == 0) {
            System.out.println(getNome() + "  e morto");
        }
    }

    public void danniArmi2() {
        this.salute -= 50;
        if (this.salute <= 0) {
            this.salute = 0;
        }
        System.out.println("Colpito dal armi1. Salute ridotta con 50" + ". Nuovi punti salute: " + this.salute);
        if (this.salute == 0) {
            System.out.println(getNome() + "  e morto");
        }

    }

    public void guarisci() {
        if (this.salute <= 0) System.out.println("Giocatore e morto, non puo guarire");
        else{
            this.salute = 100;
            System.out.println("Salute e : " + this.salute);
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArmi() {
        return armi;
    }

    public void setArmi(String armi) {
        this.armi = armi;
    }

    public int getSalute() {
        return salute;
    }

    public void setSalute(int salute) {
        this.salute = salute;
    }
}

