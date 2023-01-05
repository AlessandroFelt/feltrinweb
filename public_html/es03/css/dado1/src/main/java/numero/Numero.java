package numero;

public class Numero {

    private int n;

    public Numero(int n) {

        this.n = n;

    }

    public void setN(int n) {

        this.n = n;

    }

    public double getN() {
        return n;
    }

    public String stampa() {
        String s = "";
        return s;
    }

    public String somma(int n1) {
        int so;
        String s;
        so = n + n1;
        s = "La somma dei due numeri è " + so;
        return s;
    }

    public String compareInt(int n1) {
        int comp;
        String s;
        comp = n - n1;
        s = "La sottrazione dei due numeri è " + comp;
        return s;
    }

    public String pariDispari() {
        boolean par = true;
        String s;

        if (n % 2 == 0) {
            par = false;
        } else {
            par = true;
        }
        s = "il numero è " + par;
        return s;
    }

    public String isNegativo() {
        String s;
        boolean neg;
        if (n < 0) {
            neg = true;
        } else {
            neg = false;
        }
        s = "il numero è " + neg;
        return s;
    }

}
