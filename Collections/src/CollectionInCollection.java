import java.util.*;

public class CollectionInCollection {

    public static void main(String[] args){

        Map<String, Set<String>> teams = new HashMap<>();

        /**
         * team Penguins
         */
        String teamName = "Penguins";
        Set<String> penguinsTeam = new HashSet<>();
        penguinsTeam.add("Domantas");
        penguinsTeam.add("Karolis");
        penguinsTeam.add("Eitvydas");

        teams.put(teamName,penguinsTeam);

        /**
         * team Irish Coffee
         */
        String teamName2 = "Irish Coffee";
        Set<String> irishCoffeeTeam = new HashSet<>();
        irishCoffeeTeam.add("Anders");
        irishCoffeeTeam.add("Bjorn");
        irishCoffeeTeam.add("Magnus");

        teams.put(teamName2, irishCoffeeTeam);

        /**
         * check if team Penguins contains Anders
         */
        boolean result = teams.get("Penguins").contains("Anders");
        System.out.println("Penguins contains Anders: " + result);

        /**
         * check if team Irish Coffee contains Magnus
         */
        result = teams.get("Irish Coffee").contains("Magnus");
        System.out.println("Irish Coffee contains Magnus: " + result);

    }
}
