class Cricket {
    private String matchType;
    private String venue;
    private String team1;
    private String team2;

    public Cricket(String matchType, String venue, String team1, String team2) {
        this.matchType = matchType;
        this.venue = venue;
        this.team1 = team1;
        this.team2 = team2;
    }

    public void displayMatchInfo() {
        System.out.println("Match Type: " + matchType);
        System.out.println("Venue: " + venue);
        System.out.println("Team 1: " + team1);
        System.out.println("Team 2: " + team2);
    }

    public void manipulateTeamNames() {
        System.out.println("No operation was performed.");
    }

    public void manipulateTeamNames(boolean isReversed) {
        if (isReversed) {
            System.out.println("Team 1: " + reverseString(team1));
            System.out.println("Team 2: " + reverseString(team2));
        } else {
            System.out.println("Team 1: " + team1);
            System.out.println("Team 2: " + team2);
        }
    }

    public void manipulateTeamNames(int operation) {
        if (operation == 1) {
            System.out.println("Team 1: " + team1 + "-" + team2);
        } else if (operation == 2) {
            System.out.println("Team 1: " + reverseString(team1));
            System.out.println("Team 2: " + reverseString(team2));
        } else {
            System.out.println("Invalid operation");
        }
    }

    private String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public void extendMatchDuration(int days) {
        if (matchType.equals("Test")) {
            System.out.println("Extending the match duration of Test match by " + days + " days.");
            // Perform additional operations specific to Test matches
        } else {
            System.out.println("This operation is only applicable for Test matches.");
        }
    }
}

public class TA_1 {
    public static void main(String[] args) {
        Cricket[] matches = new Cricket[10];

        // Create match objects and store them in the array
        matches[0] = new Cricket("Test", "Stadium A", "Team A", "Team B");
        matches[1] = new Cricket("One-Day", "Stadium B", "Team C", "Team D");
        // Add more matches...

        // Verify if all required details are provided before creating objects
        for (Cricket match : matches) {
            if (match == null || match.matchType == null || match.venue == null || match.team1 == null || match.team2 == null) {
                throw new IllegalArgumentException("Required match details are not provided.");
            }
        }

        // Display match information for each object
        for (Cricket match : matches) {
            match.displayMatchInfo();
            System.out.println("-----------------------");
        }

        // Invoke manipulateTeamNames() method for each object
        for (Cricket match : matches) {
            match.manipulateTeamNames();
            System.out.println("-----------------------");
        }

        // Invoke manipulateTeamNames(boolean isReversed) method for each object
        for (Cricket match : matches) {
            match.manipulateTeamNames(true);
            System.out.println("-----------------------");
        }

        // Invoke manipulateTeamNames(int operation) method for each object
        for (Cricket match : matches) {
            match.manipulateTeamNames(1);
            System.out.println("-----------------------");
        }

        // Extend the match duration of a TestMatch object
        for (Cricket match : matches) {
            if (match != null && match instanceof Cricket && match.matchType.equals("Test")) {
                ((Cricket) match).extendMatchDuration(5);
                System.out.println("-----------------------");
            }
        }
    }
}
