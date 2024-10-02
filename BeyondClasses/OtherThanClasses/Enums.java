

public class Enums {
    
    // Define an enum type for seasons
    enum Season {
        WINTER, SPRING, SUMMER, FALL
    }


    public static void main(String[] args) {
        // Accessing enum methods
        
        // ordinal() method returns the position of the enum constant in its enum declaration
        System.out.println("Position of WINTER: " + Season.WINTER.ordinal());
        
        // values() method returns an array of all enum constants
        Season[] seasons = Season.values();
        System.out.println("List of seasons:");
        for (Season season : seasons) {
            System.out.println(season);
        }
        
        // name() method returns the name of the enum constant as a String
        System.out.println("Name of first enum constant: " + Season.WINTER.name());
        
        // valueOf() method returns the enum constant with the specified name
        Season currentSeason = Season.valueOf("SPRING");
        System.out.println("Enum constant from valueOf(): " + currentSeason);
        
        // Using switch statements with enums
        Season today = Season.SUMMER;
        switch (today) {
            case WINTER:
                System.out.println("It's cold!");
                break;
            case SPRING:
                System.out.println("It's getting warmer!");
                break;
            case SUMMER:
                System.out.println("It's hot!");
                break;
            case FALL:
                System.out.println("It's cooling down!");
                break;
            default:
                System.out.println("Invalid season");
        }
        
        // Referring to an enum
        Season nextSeason = Season.FALL; // Directly referring to an enum constant
        System.out.println("Next season: " + nextSeason);
        
        // Using enums in method parameters and return types
        System.out.println("Next season after Spring: " + getNextSeason(Season.SPRING));
    }
    
    // Method that uses an enum parameter and return type
    public static Season getNextSeason(Season currentSeason) {
        // Assuming the seasons follow a cyclic pattern
        Season[] seasons = Season.values();
        int nextIndex = (currentSeason.ordinal() + 1) % seasons.length;
        return seasons[nextIndex];
    }
}
