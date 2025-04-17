public class Main {
    public static void main(String[] args) {
        Pizza margaritaExtraQueso = PizzaBuilder
                .margaritaBuilder()
                .extraQueso()
                .build();

        Pizza pepperoniSinPicante = PizzaBuilder
                .pepperoniBuilder()
                .salsa("tomate")
                .build();

        Pizza vegetarianaConJamon = PizzaBuilder
                .vegetarianaBuilder()
                .jamon()
                .build();


        Pizza personalizada = new PizzaBuilder()
                .masa("pan")
                .salsa("barbacoa")
                .queso("cheddar")
                .agregarIngrediente("pollo")
                .tamaño(35)
                .build();

        System.out.println(margaritaExtraQueso);
        System.out.println(pepperoniSinPicante);
        System.out.println(vegetarianaConJamon);
        System.out.println(personalizada);
    }
}