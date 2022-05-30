import java.util.Arrays;
import java.util.List;

public class Polynom {
    private Term[] plmn;

    Polynom(List<Double> factors) {
        plmn = new Term[factors.size()];

        double[] arr = factors.stream().mapToDouble(Double::doubleValue).toArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            plmn[arr.length - i - 1] = new Term(arr[i], i);
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

    @Override
    public String toString() {
        return "Polynom{" +
                "plmn=" + Arrays.toString(plmn) +
                '}';
    }
}