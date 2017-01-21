package command;

public class PointMover {
	private Point point;
	public PointMover(Point point) {
		this.point = point;
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
