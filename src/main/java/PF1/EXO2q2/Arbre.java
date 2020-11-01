package PF1.EXO2q2;

import java.util.Set;

public interface Arbre<s extends Sommable<s>> {
    int taille();
    boolean contient(final Integer val);
    Set<Integer> valeurs();
    Integer somme();
    Integer min();
    Integer max();
    boolean estTrie();
}
