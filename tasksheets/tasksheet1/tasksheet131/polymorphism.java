package tasksheets.tasksheet1.tasksheet131;

class Afritada {
    public void showIngredients() {
        String[] Ingredients = {"Tomato Sauce", "Meat"};
        System.out.println("Afritada = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

// New class extending Afritada
class Adobo extends Afritada {
    @Override
    public void showIngredients() {
        String[] Ingredients = {
            "Soy Sauce",
            "Vinegar",
            "Meat",
            "Garlic",
            "Bay Leaves",
            "Peppercorns"
        };
        System.out.println("Adobo = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

class Caldereta extends Afritada {
    @Override
    public void showIngredients() {
        String[] Ingredients = {
            "Tomato Sauce",
            "Meat",
            "Potatoes & Carrots",
            "Tomato Paste",
            "Liver Spread",
            "Raisins",
            "Hotdog",
            "Siling Labuyo",
            "Cheese"
        };
        System.out.println("Caldereta = " + java.util.Arrays.toString(Ingredients) + "🍲 \n");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        // Create instances of each dish
        Afritada meal1 = new Afritada();
        Afritada meal2 = new Adobo();  // Using the new Adobo class
        Afritada meal3 = new Caldereta();
        
        // Display all ingredients for each dish
        meal1.showIngredients();
        meal2.showIngredients();
        meal3.showIngredients();
    }
}