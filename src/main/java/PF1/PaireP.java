package PF1;

public class PaireP<A,B> {
    private A _fst;
    private B _snd;

    public PaireP(final A fst, final B snd) {
        _fst = fst;
        _snd = snd;
    }

    public A fst() {
        return _fst;
    }

    public B snd() {
        return _snd;
    }

    @Override
    public String toString() {
        return String.format("(%s,%s)::PaireP[%s,%s]", _fst, _snd, _fst.
                getClass().getSimpleName(), _snd.getClass().getSimpleName());
    }

    @Override
    public <C> IPaireP<C, B> changeFst(C val) {
        return new PaireP<>(val, _snd);
    }

    @Override
    public <C> PaireP<A, C> changeSnd(C val) {
        return new PaireP<>(_fst, val);
    }
}