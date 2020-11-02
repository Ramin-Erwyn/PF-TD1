package PF1.q12;

public class Chaine<T> implements Sommable<T> {

    private String s;
    private   String _zero;
    public Chaine(String s) { this.s = s; }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }


    @Override
    public int hashCode() {
        final int conca = 21;
        int result = 1;
        int val=0;
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
        int val=0;
        if (val != other.val)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "La Chaine [s=" + s + "]";
    }

    @Override
    public T sommer(T s) {
            return (T) new Chaine<T>(getS() + getS());
        }

    @Override
    public T zero() {
        return null;
    }


}