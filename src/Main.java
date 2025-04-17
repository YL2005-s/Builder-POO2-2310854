public class Main {
    public static void main(String[] args) {
        Pizza margarita = PizzaBuilder
                .margaritaBuilder()
                .addExtraQueso()
                .build();

        Pizza pepperoniSinPicante = PizzaBuilder
                .pepperoniBuilder()
                .setSalsa("suave")
                .build();

        Pizza vegetarianaConJamon = PizzaBuilder
                .vegetarianaBuilder()
                .addJamon()
                .build();

        Pizza personalizada = new PizzaBuilder()
                .setMasa("pan")
                .setSalsa("barbacoa")
                .setQueso("cheddar")
                .addIngredient("pollo")
                .build();

        System.out.println("Margarita con extra queso: " + margarita);
        System.out.println("Pepperoni sin salsa picante: " + pepperoniSinPicante);
        System.out.println("Vegetariana con jamón: " + vegetarianaConJamon);
        System.out.println("Personalizada (pan, barbacoa, cheddar, pollo): " + personalizada);
    }
}