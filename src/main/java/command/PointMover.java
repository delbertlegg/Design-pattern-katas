package command;

public class PointMover {
	private Point point;
	public PointMover(Point point) {
		this.point = point;
	}
	
	public void setPoint(Point p) {
		if (point == null) {
			point = new Point(0, 0);
		}
		point.setX(p.getX());
		point.setY(p.getY());
	}
	
	public void moveNorth() {
		point.setY(point.getY() + 1);		
	}	
	
	public void moveSouth() {
		point.setY(point.getY() - 1);
	}
	
	public void moveEast() {
		point.setX(point.getX() + 1);
	}
	
	public void moveWest() {
		point.setX(point.getX() - 1);
	}
}
