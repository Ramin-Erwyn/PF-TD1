package PF1.EXO2q2;

public class Entier implements Sommable<Entier> {

    private int val;
    public Entier(int val) {
        this.val = val;
    }

    @Override
    public Entier sommer(Entier e) {
        return new Entier(e.getVal() + this.getVal());
    }

    public int getVal(){
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj){ return true;}
        if (obj == null){ return false;}
        return true;
    }

    @Override
    public String toString() {
        return "L'Entier [val=" + val + "]";
    }


}