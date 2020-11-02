package PF1.EX2;

import java.util.Set;

class Feuille implements Arbre {
private final int valeur;
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
       // Set<Integer> rtr =new HashSet<>();
        // rtr.add(this.valeur);
        return Set.of(this.valeur);
    }

    @Override
    public Integer somme() {
        return this.valeur;
    }

    @Override
    public Integer min() {
        return this.valeur;
    }

    @Override
    public Integer max() {
        return this.valeur;
    }

    @Override
    public boolean estTrie() {
        return true;
    }
}
