public class Main {
	public static void main(String[] args) {
		Point p1 = new Point(1, 2);
		Point p2 = new Point(3, 4);

		Line line = new Line(p1, p2);

		System.out.println(p1 + "\n" + p2 + "\n" + line);
	}
}
