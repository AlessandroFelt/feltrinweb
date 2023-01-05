package morraCinese;

public class MorraCineseTest {

    public static void main(String[] args) {

        MorraCinese m1 = new MorraCinese("Computer", "Ale");
        MorraCinese m2 = new MorraCinese("Computer", "Luca");
        MorraCinese m3 = new MorraCinese("Computer", "Tom");
        MorraCinese m4 = new MorraCinese("Computer", "Riki");
        MorraCinese m5 = new MorraCinese("Computer", "Fab");
        
        
        System.out.println(m1.gioca(2));
        System.out.println(m2.gioca(3));
        System.out.println(m3.gioca(1));
        System.out.println(m4.gioca(2));
        System.out.println(m5.gioca(3));
       

        
    }
}