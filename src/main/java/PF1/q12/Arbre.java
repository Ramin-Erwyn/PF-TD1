package PF1.q12;

import java.util.Set;
import PF1.q12.*;

public interface Arbre<T extends Sommable<T> & Comparable<T>>{
    int taille();
    boolean contient(final T val);
    Set<T> valeurs();
    T somme();
    T min();
    T max();
    boolean estTrie();
}
