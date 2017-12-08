package PPJ.Task5;

public class Task {
	public static void main(String[] args) {
		int[] tab = {1, 0, 0, 0, 2, 0, 0, 0, 3};

		for (int i = 0; i < 3; i++) {
			System.out.println((i + 1) + "\t" + loop(tab, i * 3, 3, 1));
		}
	}

	private static String loop(int[] tab, int start, int stop, int dir) {
		int i = start;
		int j = stop;
		String line = "";
		while (1 <= j) {
			line += "\t" + tab[i];
			i += dir;
			j--;
		}
		return line;
	}
}
