class Line {
	Point p1;
	Point p2;

	public Line (p1, p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public String toString() {
		return "line: (" + p1 + ", " + p2 + ")";
	}
}
