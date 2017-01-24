package command;

import java.util.*;

public class Grid {
    private List<GridObject> gridObjectList = new ArrayList<GridObject>();
    int dimension;

    public List<GridObject> getGridObjectList() {
        return gridObjectList;
    }

    public Grid(int dimension, int numberOfObstacles) {
        this.dimension = dimension;
        generateObstacles(numberOfObstacles);
    }

    private void generateObstacles(int numberOfObstacles) {
        Random r = new Random();
        for (int i = 0; i < numberOfObstacles; i++) {
            Obstacle o = new Obstacle();
            o.setLocation(r.nextInt(dimension), r.nextInt(dimension));
            gridObjectList.add(o);
        }
    }

    public boolean pointIsOccupied(Point p) {
        for (GridObject g : gridObjectList) {
            if (p.equals(g.getLocation())) {
                return true;
            }
        }
        return false;
    }
}
