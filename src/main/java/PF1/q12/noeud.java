package PF1.q12;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Noeud<T extends Sommable<T>> implements Arbre<T> {
    private final List<Arbre<T>> fils;

    public Noeud() {
        this.fils = new ArrayList<>();
    }

    public Noeud(List<Arbre<T>> fils) {
        this.fils = fils;
    }

    @Override
    public int taille() {

        int rtr=0;
        for(final Arbre<T> a: fils){
            rtr += a.taille();
        }
        return rtr;
    }


    @Override
    public boolean contient(final T val) {
        return this.fils.stream().anyMatch(Fils -> Fils.contient(val));
    }

    @Override
    public Set<T> valeurs() {
        Set<T> fusion = new HashSet<>();
        this.fils.forEach(fils -> fusion.addAll(fils.valeurs()));
        return fusion;
    }
}

