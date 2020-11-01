package PF1.EXO2q2;

    public class Chaine<S> implements Sommable<S>{

    private String s;
    public Chaine(String s) { this.s = s; }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj){return true;}
        if (obj == null){ return false;}

        return true;
    }

    @Override
    public String toString() {
        return "La Chaine [s=" + s + "]";
    }

        @Override
        public S sommer(S s) {
            return (S) new Chaine<S>(getS() + getS());
        }
    }