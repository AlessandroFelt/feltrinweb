package calcola;

public class Calcola {

    private double a;

    private double b;

    public Calcola(double a, double b) {

        this.a = a;

        this.b = b;

    }

    public void setA(double a) {

        this.a = a;

    }

    public double getA() {

        return a;

    }

    public void setB(double b) {

        this.b = b;

    }

    public double getB() {
        return b;
    }

    public String stampa() {
        String s;
        s = "";
        return s;
    }

    public String calc() {
        String s;
        double somma;
        double sott;
        double molt;
        double div;
        double espo;
        somma = a + b;
        sott = a - b;
        molt = a * b;
        div = a / b;
        espo = Math.pow(a, b);

        s = "RISULTATI CON I VALORI NORMALI"+"\n"+"PRIMO NUMERO= " + a + "\n" + "SECONDO NUMERO = " + b + "\n"
                + "RISULTATO SOMMA = " + somma + "\n" + "RISULTATO SOTTRAZIONE = "
                + sott + "\n"
                + "RISULTATO MOLTIPLICAZIONE = " + molt + "\n"
                + "RISULTATO DIVISIONE = " + div + "\n" + "RISULTATO ESPONENTE = " + espo
                + "\n" ;
        return s;
    }

    public String invCalc() {
        String s;
        double somma;
        double sott;
        double molt;
        double div;
        double espo;
        somma = b + a;
        sott = b - a;
        molt = b * a;
        div = b / a;
        espo = Math.pow(b, a);

        s = "RISULTATI CON I VALORI INVERTITI"+"\n"+"PRIMO NUMERO = "+b+"\n"+"SECONDO NUMERO = "+a+"\n"+"RISULTATO SOMMA = " + somma + "\n" + "RISULTATO SOTTRAZIONE = "
                + sott + "\n"
                + "RISULTATO MOLTIPLICAZIONE = " + molt + "\n"
                + "RISULTATO DIVISIONE = " + div + "\n"+"RISULTATO ESPONENTE =  " + espo;
        return s;

    }

}
