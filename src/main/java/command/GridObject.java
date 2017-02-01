package command;

abstract class GridObject {
    protected Point location = new Point();

    public void setLocation(int x, int y) {
        location.setX(x);
        location.setY(y);
    }

    public Point getLocation() {
        return location;
    }
    
    public void setXPosition(int x) {
    	location.setX(x);
    }
    
    public void setYPosition(int y) {
    	location.setY(y);
    }
    
    public int getXPosition() {
    	return location.getX();
    }
    
    public int getYPosition() {
    	return location.getY();
    }

    public String toString() {
        return "x: " + location.getX() + ", y: " + location.getY();
    }
}
