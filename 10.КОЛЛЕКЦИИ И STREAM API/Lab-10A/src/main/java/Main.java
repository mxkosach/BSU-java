import java.util.ArrayList;
import java.util.List;
/*
* 10.	Умножить два многочлена заданной степени, если коэффициенты многочленов хранятся в различных списках.
* */
public class Main {
    public static void main(String[] args) {
        List<Double> pList1 = new ArrayList<>();
        pList1.add(1D);
        pList1.add(-2D);
        pList1.add(3D);
        List<Double> pList2 = new ArrayList<>();
        pList2.add(2D);
        pList2.add(1D);
        //////////////////////////////////////////
        Polynom p2 = new Polynom(pList1);
        Polynom p1 = new Polynom(pList2);
        Polynom p1Xp2 = new Polynom(new Term[p1.getLengthPlmn() * p2.getLengthPlmn()]);
        p1.printPolinom();
        p2.printPolinom();
        int indTmp = 0;
        Term trmTemp;
        for (int i = 0; i < p1.getLengthPlmn(); i++) {
            for (int j = 0; j < p2.getLengthPlmn(); j++) {
                trmTemp = p1.getTerm(i).multiplyOtherTerm(p2.getTerm(j));
                p1Xp2.setTerm(trmTemp, indTmp);
                indTmp++;
            }
        }
        System.out.println("_________________________");
        p1Xp2.printPolinom();
    }
}
/*
* [1,00*X^1, 2,00*X^0]
[3,00*X^2, -2,00*X^1, 1,00*X^0]
_________________________
[3,00*X^3, -2,00*X^2, 1,00*X^1, 6,00*X^2, -4,00*X^1, 2,00*X^0]

* */