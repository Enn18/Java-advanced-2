
enum Levels {
    LOW, MEDIUM, HIGH;
}

public class LetsDoEnums {

    public static void main(String[] args) {

        Levels l = Levels.LOW;

        switch(l) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
