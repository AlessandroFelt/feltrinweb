package cameraAlbergo;

public class CameraAlbergo {

    private int tipo;

    public CameraAlbergo(int tipo) {

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

        s = "Il costo di questo pernotto (tipo stanza:" + tipo + ") è di " + prezzo + "\n"
                + "Giorni di Pernotto " + giorni + "\n" ;
        return s;

    }
}
