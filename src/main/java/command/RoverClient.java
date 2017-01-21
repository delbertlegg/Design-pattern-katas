package command;


import java.util.Scanner;

public class RoverClient {
    public static void main (String[] args) {
        Rover rover = Rover.getInstance();
        int x, y;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter xy coordinates for rover (in x y format): ");
        x = in.nextInt();
        y = in.nextInt();
        in.nextLine();

        System.out.println("Enter direction (N, E, S, W): ");
        String dir = in.nextLine();
        try {
            rover.setDirection(Direction.getDirectionByString(dir));
        }
        catch (Exception e) {
            e.printStackTrace();
            return;
        }

        rover.setLocation(x, y);
        RoverMover roverMover = RoverMover.getRoverMover(rover);
        RoverControl control = new RoverControl();
        control.setControls(roverMover);

        System.out.println("Enter a string of commands (no spaces)...");
        System.out.println("f = forward, b = backward, l = left, r = right: ");
        String  commands = in.nextLine();
        for (int i = 0; i < commands.length(); i++) {
            control.executeCommand(Character.toString(commands.charAt(i)));
        }

        System.out.println("Rover is pointing " + rover.getDirection());
        System.out.println("Rover is at location " + rover.getPoint().getX() + ", " + rover.getPoint().getY());
    }
}
