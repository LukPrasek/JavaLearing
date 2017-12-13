public class Odwrocony {

int x=1234;

public void turnback (int x) {

        String strI = Integer.toString(x);
        for (int i=strI.length();i>0;) {
            System.out.println(strI.charAt(i-1));
            i--;
        }
    }
}
