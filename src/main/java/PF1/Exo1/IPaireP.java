package PF1.Exo1;

public interface IPaireP<A,B> {
    A fst();
    B snd();
    <C> IPaireP<C,B> changeFst(C value);
    <C> IPaireP<A,C> changeSnd(C value);
}
