public class Zad5Page6 {


}
    static int[] tab = {1, 0, 0, 0, 2, 0, 0, 0, 3};

        public static void main(String[] args) {
            printing(tab, 3);
            }
        }

   private static void printing (int[] tab, int rowLength ) {
    if (tab.length%3==0) {
        for (int i=0; i<rowLength; i++) {
        System.out.println(tab[i]);
            }

    }