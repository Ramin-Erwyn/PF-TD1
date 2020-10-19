package PF1;
import java.util.ArrayList;
import  java.util.List;
import java.util.stream.Stream;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class noeud<Feuille> implements Arbre {
    private List<Arbre> fils;

    public noeud(List<Arbre> fils) {
        this.fils = new ArrayList<>();
    }

    @Override
    public Stream<Integer> taille(){
    return this.fils.stream().map(Arbre::taille), reduce(0, Integer::sum)
    }

    private void reduce(int i, Object sum) {
    }

    @Override
    public boolean contient(final Integer val){
       boolean re =false;
       for(final Arbre a : fils){
           for(final Arbre a : fils){
               if (a.contient(val))return true;
           }
           return re;
       }
    }
}
