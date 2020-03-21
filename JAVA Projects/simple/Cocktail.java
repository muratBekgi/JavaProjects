import java.util.*;

public class Cocktail {
    private Set<String> eachCocktailItem;
    private Set<String> cross;
    private String stringOut1;
    private String stringOut2;

    public void addCocktailMap() {

        Map<String, Set<String>> cocktailMap = new HashMap<>();
        Set<String> ingredients = new HashSet<>();

        ingredients.add("Vodka");
        ingredients.add("Gin");
        ingredients.add("Tequila");
        ingredients.add("Rum");
        ingredients.add("Triple Sec");
        cocktailMap.put("LIIT", ingredients);

        ingredients = new HashSet<>();
        ingredients.add("Rum");
        cocktailMap.put("Mojito", ingredients);

        ingredients = new HashSet<>();
        ingredients.add("Gin");
        ingredients.add("Creme de Mure");
        cocktailMap.put("Bramble", ingredients);

        ingredients = new HashSet<>();
        ingredients.add("Vodka");
        cocktailMap.put("Martini", ingredients);

        printMap();
        printMapValue();

        Set<String> randomCocktail = cocktailMap.get("LIIT");


        for (String eachCocktail : cocktailMap.keySet()) {
            eachCocktailItem = cocktailMap.get(eachCocktail);
            cross = new HashSet<>(randomCocktail);
            cross.retainAll(eachCocktailItem);
            stringOut1 = "The Key values are : " + eachCocktail;
            stringOut2 = "The values for the map are : " + cross;
            System.out.println(stringOut1 + " & " + stringOut2);
        }

    }


    public void printMap() {
        Map<String, Set<String>> cocktailMap = new HashMap<>();
        Set<String> ingredients = new HashSet<>();

        Set<String> randomCocktail = cocktailMap.get("LIIT");

        for (String eachCocktail : cocktailMap.keySet()) {
            eachCocktailItem = cocktailMap.get(eachCocktail);
            cross = new HashSet<>(randomCocktail);
            cross.retainAll(eachCocktailItem);
            stringOut1 = "The Key values are : " + eachCocktail;

        }
    }

    public void printMapValue() {
        Map<String, Set<String>> cocktailMap = new HashMap<>();
        Set<String> ingredients = new HashSet<>();

        Set<String> randomCocktail = cocktailMap.get("LIIT");


        for (String eachCocktail : cocktailMap.keySet()) {
            eachCocktailItem = cocktailMap.get(eachCocktail);
            cross = new HashSet<>(randomCocktail);
            cross.retainAll(eachCocktailItem);
            stringOut2 = "The values are : " + cross;
            System.out.println(stringOut2);
        }
    }



}