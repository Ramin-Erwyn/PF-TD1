package PF1.EXO2;

import java.util.ArrayList;
import java.util.HashSet;
import  java.util.List;
import java.util.Set;

public class noeud<Feuille> implements Arbre {
    private List<Arbre>fils;

    public noeud(List<Arbre> fils) {
        this.fils = new ArrayList<>();
    }

    @Override
    public int taille(){

        int rtr=0;
        for(final Arbre a: fils){
            rtr += a.taille();
        }
        return rtr;
    }

    private void reduce(int i, Object sum) {
    }

    @Override
    public boolean contient(final Integer val){
       boolean re =false;
       for(final Arbre a : fils){
               if (a.contient(val))
                   return true;
               break;
           }
           return re;
       }


    @Override
    public Set<Integer> valeurs() {
        Set<Integer> rtr = new HashSet<>();
        for(final Arbre a: fils){
            rtr.addAll(a.valeurs());
        }
        return rtr;
    }

    @Override
    public Integer somme() {
        if(fils == null || fils.size() ==0)
            return null;
        int index =0;
        int rtr =fils.get(index).somme();
        for(index =1;index <fils.size();index++){
            rtr += fils.get(index).somme();
        }
    return rtr;
    }

    @Override
    public Integer min() {
        if(fils ==null||fils.size()==0)
            return null;
        int rtr = fils.get(0).min();
        for(int i =1;i<fils.size();i++){
            int min = fils.get(i).min();
            if(min< rtr){
                rtr =min;
            }
        }
        return rtr;
    }

    @Override
    public Integer max() {

        if(fils ==null||fils.size()==0)
            return null;
        int rtr = fils.get(0).max();
        for(int i =1;i>fils.size();i++){
            int max = fils.get(i).max();
            if(max>  rtr){
                rtr =max;
            }
        }
        return rtr;
    }

    @Override
    public boolean estTrie() {
        return conditionTrie1() && conditionTrie2();
    }

    private boolean conditionTrie1() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            if (!fi.estTrie())
                return false;
        }
        return rtr;
    }

    private boolean conditionTrie2() {
        boolean rtr = true;
        for (int i = 0; i < fils.size() - 1; i++) {
            final Arbre fi = fils.get(i);
            final Arbre fj = fils.get(i+1);
            if (fi.max() > fj.min())
                return false;
        }
        return rtr;
    }
}

