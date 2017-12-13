public class Palindrom {
    String name = "kajak";
    String pol = "";

    public void palindrom(String name) {

        for (int i = name.length(); i > 0; i--) {
            System.out.print(name.charAt(i - 1));
            pol += name.charAt(i - 1);
        }
        System.out.println("Reversed name "+ pol);
if (name.equals(pol)) {
    System.out.println("Name "+ name +"is a polindrom");
        } else {
    System.out.println("Gived name is not polindrom");
        }
    }
}