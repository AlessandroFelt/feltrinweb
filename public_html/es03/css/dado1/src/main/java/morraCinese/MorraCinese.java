package morraCinese;

import java.util.Random;

public class MorraCinese {

    private String nome1;

    private String nome2;

    Random r = new Random();

    public MorraCinese(String nome1, String nome2) {

        this.nome1 = nome1;

        this.nome2 = nome2;

    }

    public void setComputer(String nome1) {

        this.nome1 = nome1;

    }

    public String getComputer() {

        return nome1;

    }

    public void setNome2(String nome2) {

        this.nome2 = nome2;

    }

    public String stampa() {
        String s;
        s = "";
        return s;
    }

    public String gioca(int giocata2) {

        Random rand = new Random();
        int giocata1 = rand.nextInt(2) + 1;

        String t = "";

        if (giocata1 == 2 && giocata2 == 1 || giocata1 == 1 && giocata2 == 3
                || giocata1 == 3 && giocata2 == 2) {

            t = nome1;

        } else if (giocata1 == 1 && giocata2 == 2 || giocata1 == 3 && giocata2
                == 1 || giocata1 == 2 && giocata2 == 3) {

            t = nome2;

        } else if (giocata1 == 1 && giocata2 == 1 || giocata1 == 2 && giocata2
                == 2 || giocata1 == 3 && giocata2 == 3) {

            t = "nessuno";
        }
        
        

        String s = t + " vince" + "\n" + "1 = forbici       2 = sasso       3 = carta"
                +"\n"+"giocata del pc = " + giocata1 
                + "\n" + "giocata di " + nome2 + " = " + giocata2+"\n"+"\n";

        return s;
    }

}