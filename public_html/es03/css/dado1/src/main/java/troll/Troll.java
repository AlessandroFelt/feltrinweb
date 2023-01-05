package troll;

public class Troll {
    private int mov;
    private int agilita;
    private int riflessi;
    private int forza;
    private int inte;

    public Troll(int mov, int agilita, int forza, int inte, int riflessi) {
        this.mov = mov;
        this.agilita = agilita;
        this.forza = forza;
        this.inte = inte;
        this.riflessi = riflessi;
    }

    public void setMov(int mov) {
        this.mov = mov;
    }

    public int getmov() {
        return mov;
    }

    public void setAgilita(int agilita) {
        this.agilita = agilita;
    }

    public int getAgilita() {
        return agilita;

    }

    public void setRiflessi(int riflessi) {
        this.riflessi = riflessi;

    }

    public int getRiflessi() {
        return riflessi;

    }

    public void setForza(int forza) {
        System.out.println("setForza - old forza:" + this.forza);        
        this.forza = forza;        
        System.out.println("setForza - new forza:" + this.forza);
    }

    public int getForza() {
        return forza;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getInte() {
        return inte;
    }

    public void incrForza(int newForza) {
        System.out.println("incrForza - old forza:" + forza);
        forza = forza + newForza;
        System.out.println("incrForza - new forza:" + forza);        
    }

    public void incrMov() {
        System.out.println("incrMov - old mov:" + mov);        
        mov = mov + agilita * forza;
        System.out.println("incrMov - new mov:" + mov);
       
    }

    public int ferite() {
        System.out.println("ferite - old forza:" + forza);
        forza = forza - (riflessi * mov / 3);
        System.out.println("ferite - new forza:" + forza);
        return forza;
    }

    public void studiare(int voto) {
        System.out.println("studiare " + voto + " - old inte:" + inte);
        inte = inte + (voto / 4);
        System.out.println("studiare " + voto + " - old inte:" + inte);
    }

    public String stampa() {
        String s;
        s = "forza:" + forza + "\n" + "movimento" + mov + "\n";
        return s;
    }

}
