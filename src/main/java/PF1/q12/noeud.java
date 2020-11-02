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

    @Override
    public T somme() {
        if(fils ==null|| fils.size()==0)
            return null;
        T rtr = fils.get(0).somme();
        for(int i =1;i<fils.size();i++){
            rtr =rtr.sommer(fils.get(i).somme());
        }
        return rtr;
    }




    @Override
    public String compareTo() {
        //if (other == null) return 1;
        //return m_value.CompareTo(other.m_value);
        return null;
    }

    @Override
    public T min() {
        if(fils ==null||fils.size()==0)
            return null;
        T rtr = fils.get(0).min();
        for(int i =1;i<fils.size();i++){
            T min = fils.get(i).min();
            if(min< rtr){
                rtr =min;
            }
        }
        return rtr;
    }

    @Override
    public T max() {
        if(fils ==null||fils.size()==0)
            return null;
        T rtr = fils.get(0).max();
        for(int i =1;i>fils.size();i++){
            T max = fils.get(i).max();
            if(max>  rtr){
                rtr =max;
            }
        }
        return rtr;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}

