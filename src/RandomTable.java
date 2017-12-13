public class RandomTable {

    static int[] tab = new int[10];


    public static void main(String[] args) {

        for (int i = 0; i < tab.length; i++) {
               tab[i] = ((int) (2*Math.random()))%2;//castowanie int , obcinam wszystko po przecinku, czyli trzeba zwiekszyc zakres
        }
        for (int x : tab) {
            System.out.println(x);
        }
    }
}
