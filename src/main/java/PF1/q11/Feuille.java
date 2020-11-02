package PF1.q11;

import PF1.q11.*;

import java.util.Set;

class Feuille<T> implements Arbre<T> {
private final T valeur;
public Feuille(final T valeur){
    this.valeur=valeur;
}


    @Override
    public int taille() {
        return 1;
    }
    @Override
    public boolean contient(final T val){
    return val.equals(valeur);
    }

    @Override
    public Set<T> valeurs() {
       // Set<Integer> rtr =new HashSet<>();
        // rtr.add(this.valeur);
        return Set.of(this.valeur);
    }

   /* @Override
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
    */

}
