package PPJ.Task5;

public class Task {
	public static void main(String[] args) {
		int[] tab = {1, 0, 0, 0, 2, 0, 0, 0, 3};

		for (int i = 0; i < 9; i++) {
			System.out.println(loop(tab, ((i % 3) * 3), tab.length/3, 1, (i % 3 + 1) + "\t"));
		}
	}

	private static String loop(int[] tab, int start, int length, int dir, String line) {

		while (1 <= length) {
			line += " " + tab[start];
			start += dir;
			length--;
		}
		return line;
	}
}
