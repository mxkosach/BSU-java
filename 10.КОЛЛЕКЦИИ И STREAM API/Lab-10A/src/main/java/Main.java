public class Main {
    /* 10.	Умножить два многочлена заданной степени, если коэффициенты многочленов хранятся в различных списках. */
    public static void main(String[] args) {
        Polynom p2 = new Polynom(1,-2,3);
        Polynom p1 = new Polynom(2,1);
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
