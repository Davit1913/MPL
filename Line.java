class Line {
	Point p1;
	Point p2;

	public Line (Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public String toString() {
		return "line: (" + this.p1 + ", " + this.p2 + ")";
	}
}
