package AllAroundPractice;

public class F2 implements Parabula {

    private double a;
    private double b;
    private double c;

    // class constructor
    public F2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//

    // 2*x^2 + 3x +6
    // 4*x^2 + 4x +7
    // 6x^2 + 7x + 13
    // calculates the parabula value at given X
    @Override
    public double f(double x) {
        return this.a * x * x + this.b * x + this.c;
    }

    @Override
    public Parabula add(Parabula p) {
        //  double[] coefficients = p.get();
        return new F2(this.a + p.get()[0], this.b + get()[1], this.c + p.get()[2]);
    }

    // returns an array of doubles {a,b,c}: ax^2+bx+c=0;
    @Override
    public double[] get() {
        return new double[]{this.a, this.b, this.c};
        
    }

    // returns the x value of the extrema point
    //(min or max), if none throws an Exception.
    @Override
    public double extream(Parabula p) {
        double[] coefficients = p.get();
        double a = coefficients[0];
        double b = coefficients[1];
        double xPoint = -b / 2 * a;
        if (a == 0) {
            throw new RuntimeException("There is no extrema point for this parabola");
        }
        return xPoint;
    }
    private static double extreamY(Parabula p) {
        double xtreamx = p.extream(p) ;
        double yPoint = p.f(xtreamx);
        return yPoint;
    }



    static int numberOfRealRoots(Parabula p) {
        double[] coefficients = p.get();
        double a = coefficients[0];
        double b = coefficients[1];
        double c = coefficients[2];
        double discr = (b * b - 4 * a * c);
        if (discr > 0) {
            return 2;
        }
        if (discr < 0) {
            throw new RuntimeException("no roots");
        }

        String str = new String("");
        for (int i = 0; i < str.length(); i++) {

        }










        return 1;






    }

        // static void sort(ArrayList<AllAroundPractice.Parabula> a) {
//        int max = 0;
//        ArrayList<AllAroundPractice.Parabula> pList = new ArrayList<>();
//        AllAroundPractice.Parabula[] pArray = new AllAroundPractice.Parabula[a.size()];
//
//        for (int i = 0; i < pArray.length; i++) {
//
//            if (a.get(0) != null) {
//                double tempE = a.get(0).extream(a.get(i));
//                for (int j = 1; j < a.size(); j++) {
//
//                    if(extream(a.get(j)) > tempE) {
//                        tempE = a.get(j).extream(a.get(i));
//                        max = 0;
//
//                    a.remove(j);
//                    max = j;
//                }
//            }
//
//        }
//        pArray[i] = a.get(max);
//    }
//        max = 0;
//        for (int i = 0; i < pArray.length; i++) {
//            pList.add(pArray[i]);
//        }
//    a = pList;
//        }






}






// double discr = (b * b - 4 * a * c);
//        if(discr > 0){
//          double x1 = (-b + Math.sqrt(discr))/2*a;
//          double x2 = (-b - Math.sqrt(discr))/2*a;
//            return Math.min(p.f(x1), p.f(x2));
//        }
//
//        if(discr < 0){
//           throw new RuntimeException("no extrema points");
//        }
//        return (-b/2*a);
//        }