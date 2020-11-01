package PF1.EXO2q2;

import PF1.EXO2.Arbre;

import java.util.Set;

class Feuille<S extends Sommable<S>>{
    private final int valeur;
    //private final int valeur;
public  Feuille(final int valeur){
    this.valeur=valeur;
}


    @Override
    public int taille() {
        return 1;
    }
    @Override
    public boolean contient(final Integer val){
    return val.equals(valeur);
    }

    @Override
    public Set<Integer> valeurs() {
        return null;
    }

    @Override
    public Integer somme() {
        return null;
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
