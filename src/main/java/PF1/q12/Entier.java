package PF1.q12;

public class Entier implements Sommable<Entier> {


    private static Entier _zero;



    public int val=0;
    public Entier(int val) {
        this.val = val;
    }

    @Override
    public Entier sommer(Entier e) {
        return new Entier(e.getVal() + this.getVal());
    }

    @Override
    public Entier zero() {
        return Entier._zero;
    }

    public int getVal(){
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public int hashCode() {
        final int conca = 21;
        int result = 1;
        result = conca * result + val;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Entier other = (Entier) obj;
        if (val != other.val)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "L'Entier val=" + val;
    }




}


