package MyListPractice;

public class MyListPractice {
    public static void main(String[] args) {
        MyList<Integer> P1 = new MyList<Integer>() ;
        P1.addAt(2,0);
        P1.addAt(2,0);
//        P1.addAt(5,0);
//        P1.addAt(6,0);
//       // P1.addAt(2,0);
//        P1.addAt(7,0);
//        P1.addAt(7,0);
        System.out.println(isSet(P1));

    }
    public static boolean isSet(MyListInterface<Integer> P) {

        if ( P.size() < 2 ) return true;
        for ( int i = 0 ; i < P.size() ; i ++ ) {
            for ( int j = 0 ; j < P.size() ; j++ ) {
                if ( P.get(i) == P.get(j) && i != j ) {
                    return false;
                }
            }
        }
        return true;
    }

}
