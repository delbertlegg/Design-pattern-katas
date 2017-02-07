package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

class Grid {
    private final List<GridObject> gridObjectList = new ArrayList<>();
    private final int dimension;

    Grid(int dimension, int numberOfObstacles) {
        this.dimension = dimension;
        generateObstacles(numberOfObstacles);
    }

    List<GridObject> getGridObjectList() {
        return gridObjectList;
    }

    private void generateObstacles(int numberOfObstacles) {
        Random r = new Random();
        for (int i = 0; i < numberOfObstacles; i++) {
            Obstacle o = new Obstacle();
            o.setLocation(r.nextInt(dimension), r.nextInt(dimension));
            gridObjectList.add(o);
        }
    }

    boolean pointIsOccupied(Point p) {
        Predicate<GridObject> locationIsOccupiedByPoint = g -> p.equals(g.getLocation());
        return gridObjectList.stream()
                .anyMatch(locationIsOccupiedByPoint);
//
    }

    int getDimension() {
        return dimension;
    }
}
