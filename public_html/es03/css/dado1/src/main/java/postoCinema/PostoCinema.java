package postoCinema;

public class PostoCinema {

    private int pDispo;
    private int pPreno;

    public PostoCinema(int pDispo, int pPreno) {

        this.pDispo = pDispo;
        this.pPreno = pPreno;
    }

    public void setPDispo(int pDispo) {
        this.pDispo = pDispo;
    }

    public double getPDispo() {
        return pDispo;
    }

    public void setPPreno(int pPreno) {
        this.pPreno = pPreno;
    }

    public double getPPreno() {
        return pPreno;
    }

    public String stampa() {
        String s = "";
        return s;
    }

    public String getCosto(int giorno, boolean studente) {
        int costo = 0;
        String s;

        switch (giorno) {
            case 1:
                if (studente == true) {
                    costo = 5;
                } else {
                    costo = 7;
                }

                break;
            case 2:
            {s = "Il cinema è chiuso";}
            break;
            case 3:
                if (studente == true) {
                    costo = 5;
                } else {
                    costo = 7;
                }
            break;
            case 4:
                if (studente == true) {
                    costo = 0;
                } else {
                    costo = 3;
                }
            break;
            case 5:
                if (studente == true) {
                    costo = 7;
                } else {
                    costo = 10;
                }
            break;
            case 6:
                s = "Il cinema è chiuso";
            break;
            case 7:
                if (studente == true) {
                    costo = 7;
                } else {
                    costo = 10;
                }
            break;}
        
        s = "Al cinema ci sono "+pDispo+" posti, già prenotati sono: "+pPreno+" e pagherai "+costo+" euro";
        
        return s;
        
    }
}


   
