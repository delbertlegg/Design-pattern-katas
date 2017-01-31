package command;

import java.util.Random;

public class RoverSimulator {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        Rover rover = Rover.getInstance();
        GridClient gridClient = new GridClient(grid, rover);
        String[] commands = { "f", "b", "r", "l" };
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            String c = commands[r.nextInt(commands.length)];
            Point p = rover.getLocation();
            Point oldLocation = new Point(p.getX(), p.getY());
            gridClient.moveRover(c);
            if (grid.pointIsOccupied(rover.getLocation())) {
                rover.setLocation(oldLocation.getX(), oldLocation.getY());
                break;
            }
        }

        System.out.println("Rover is pointing " + rover.getDirection());
        System.out.println("Rover is at location " + rover.getLocation().getX() + ", "
              + rover.getLocation().getY());
    }
}
