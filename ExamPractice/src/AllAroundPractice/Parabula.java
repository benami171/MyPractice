package AllAroundPractice;

public interface Parabula {

     default double f(double x) // computes the value of this parabula at x.
    {
        return 0;
    }

    Parabula add(Parabula p); // computes a new AllAroundPractice.Parabula = p + “this”.
        double[] get(); // retunrs an array of doubles {a,b,c}: ax^2+bx+c=0;
        double extream(Parabula p) ;// returns the x value of the extrema point
//(min or max), if none throws an Exception.
    }

