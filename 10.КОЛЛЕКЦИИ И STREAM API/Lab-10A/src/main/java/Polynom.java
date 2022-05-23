import java.util.Arrays;

public class Polynom {
    private Term [] plmn;

    Polynom(double... factors) {
        plmn = new Term[factors.length];
        for (int i = factors.length - 1; i >= 0; i--) {
            plmn[factors.length - i - 1] = new Term(factors[i], i);
        }
    }

    Polynom(Term[] plmn) {
        this.plmn = plmn;
    }

    void printPolinom() {
        System.out.println(Arrays.toString(plmn));
    }

    public Term getTerm(int indexTerm) {
        return plmn[indexTerm];
    }

    public void setTerm(Term term, int indexTerm) {
        plmn[indexTerm] = term;
    }

    public int getLengthPlmn() {
        return plmn.length;
    }
}