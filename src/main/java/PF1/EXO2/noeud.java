package PF1.EXO2;

import java.util.ArrayList;
import  java.util.List;
import java.util.Set;

public class noeud<Feuille> implements Arbre {
    private List<Arbre>fils;

    public noeud(List<Arbre> fils) {
        this.fils = new ArrayList<>();
    }

    @Override
    public int taille(){
    return this.fils.stream().map(Arbre::taille).reduce(0, Integer::sum);
    }

    private void reduce(int i, Object sum) {
    }

    @Override
    public boolean contient(final Integer val){
       boolean re =false;
       for(final Arbre a : fils){
               if (a.contient(val))return true;
           }
           return re;
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
