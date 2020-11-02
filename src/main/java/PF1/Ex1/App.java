package PF1.Ex1;

public class App {
    public static void q21(String[] args){
            PaireP p1 =  new PaireP(1,"un");
            System.out.println(p1);
            IPaireP p2 =  p1.changeFst(1.0);
            System.out.println(p2);
    }
}

