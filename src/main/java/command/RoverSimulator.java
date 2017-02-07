package command;

import java.util.Random;

class RoverSimulator {
    public static void main(String[] args) {
        Grid grid = new Grid(10, 10);
        Rover rover = Rover.getInstance();
        GridClient gridClient = new GridClient(grid, rover);
        String[] commands = {"f", "b", "r", "l"};
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            try {
                String c = commands[r.nextInt(commands.length)];
                gridClient.moveRover(c);
            } catch (RoverRanIntoObstacleException e) {
                System.out.print(String.format("Rover moved %d times\n", i));
                break;
            }
        }
        System.out.print(rover.toString());
    }
}
