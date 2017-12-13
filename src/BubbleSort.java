import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BubbleSort {

    static int[] table= {4,2,5,1,7};


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        bubbleSort(table);
        printing();
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < table.length; i++) {//porownuje pierwszy z pierwszym wiekszym
            System.out.println("Przed wejsciem do petli pierwszej i: "+i);
            for (int j = 0; j < table.length; j++) {
//                System.out.print("i"+i);
//                System.out.println("j"+j);
                printing();
                System.out.println("Przed wejsciem do petli drugiej j: "+j);
                if (table[i] < table[j]) {
                    int cur = table[j];
                     table[j] = table[i];
                     table[i] = cur;
                            printing();
                    System.out.println("Pierwsze wejscie");
                                }
            }
        }
    }
    public static void printing() {
        for (int x: table) {
            System.out.print(x);
        }
    }
}