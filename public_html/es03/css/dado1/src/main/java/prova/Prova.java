package prova;

public class Prova {

    private int tipo;

    public Prova(int tipo) {
        this.tipo = tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getTipo() {
        return tipo;
    }

    public String stampa() {
        String s = "";
        return s;
    }

    private int getCostoGG(int tipo) {
        int costog = 0;
        
           /*
        if (tipo == 1) {
            costog = 40;
        } else if (tipo == 2) {
            costog = 75;
        } else if (tipo == 3) {
            costog = 110;
        }*/
           
        switch (tipo) {
            case 1:
                costog = 40;
                break;
            case 2:
                costog = 75;
                break;
            case 3:
                costog = 110;
                break;

        }
        return costog;
    }

    public String calc(int giorni) {
        String s;

        double prezzo=0;
        int costog = getCostoGG(tipo);
        int costoTot = costog * giorni;     
       
        if (giorni > 4 && giorni < 10) {
            prezzo = costoTot;
        } else if (giorni <= 4) {
            prezzo = costoTot + (costoTot * 5 / 100);
        } else if (giorni >= 10) {
            prezzo = costoTot - (costoTot * 10 / 100);
        }

        s = "Il costo di questo pernotto (tipo:" + tipo + ") è di " + prezzo + "\n" + "costotot " + costoTot + "\n"
                + "GIORNI " + giorni + "\n" + "COSTOG " + costog + "\n";
        return s;

    }
}
