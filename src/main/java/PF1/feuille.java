package PF1;

import java.util.stream.Stream;

public class feuille implements Arbre{
private final int valeur;
public Feuille(final int valeur){
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
}
