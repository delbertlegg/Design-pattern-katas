package command;


import java.util.InputMismatchException;
import java.util.Scanner;

public class RoverClient {
    public static void main (String[] args) {
        Rover rover = Rover.getInstance();
        Scanner in = new Scanner(System.in);
        boolean inputValid = false;
        while (!inputValid) {
            try {
                int x, y;
                System.out.println("Enter xy coordinates for rover (in x y format): ");
                x = in.nextInt();
                y = in.nextInt();
                rover.setLocation(x, y);
                in.nextLine();

                System.out.println("Enter direction (N, E, S, W): ");
                String dir = in.next();
                rover.setDirection(Direction.getDirectionByString(dir));
                in.nextLine();

                RoverControl control = new RoverControl(rover);

                System.out.println("Enter a string of commands (no spaces)...");
                System.out.println("f = forward, b = backward, l = left, r = right: ");

                String commands = in.next();

                for (int i = 0; i < commands.length(); i++) {
                    control.executeCommand(Character.toString(commands.charAt(i)));
                }
                in.nextLine();


                System.out.println("Rover is pointing " + rover.getDirection());
                System.out.println("Rover is at location " + rover.getLocation().getX() + ", "
                        + rover.getLocation().getY());
                inputValid = true;
            }
            catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("Invalid input, please try again.");
            }
            catch (IllegalArgumentException e) {
                in.nextLine();
                System.out.println(e.getMessage());
            }
            catch (Exception e) {
                in.nextLine();
                e.printStackTrace();
            }
        }
    }
}
