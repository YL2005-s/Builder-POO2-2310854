import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String masa;
    private String salsa;
    private String queso;
    private List<String> ingredientes = new ArrayList<>();
    private boolean extraQueso;
    private boolean pepperoni;
    private boolean champiñones;
    private boolean cebolla;
    private boolean jamon;
    private boolean aceitunas;
    private boolean pimientos;
    private boolean glutenFree;
    private int tamaño;

    public PizzaBuilder setMasa(String masa) {
        this.masa = masa;
        return this;
    }

    public PizzaBuilder setSalsa(String salsa) {
        this.salsa = salsa;
        return this;
    }

    public PizzaBuilder setQueso(String queso) {
        this.queso = queso;
        return this;
    }

    public PizzaBuilder addIngredient(String ingrediente) {
        this.ingredientes.add(ingrediente);
        return this;
    }

    public PizzaBuilder addExtraQueso() {
        this.extraQueso = true;
        return this;
    }

    public PizzaBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public PizzaBuilder addChampiñones() {
        this.champiñones = true;
        return this;
    }

    public PizzaBuilder addCebolla() {
        this.cebolla = true;
        return this;
    }

    public PizzaBuilder addJamon() {
        this.jamon = true;
        return this;
    }

    public PizzaBuilder addAceitunas() {
        this.aceitunas = true;
        return this;
    }

    public PizzaBuilder addPimientos() {
        this.pimientos = true;
        return this;
    }

    public PizzaBuilder sinGluten() {
        this.glutenFree = true;
        return this;
    }

    public PizzaBuilder setTamaño(int tamaño) {
        this.tamaño = tamaño;
        return this;
    }

    public static PizzaBuilder margaritaBuilder() {
        return new PizzaBuilder()
                .setMasa("fina")
                .setSalsa("tomate")
                .setQueso("mozzarella");
    }

    public static PizzaBuilder pepperoniBuilder() {
        return new PizzaBuilder()
                .setMasa("tradicional")
                .setSalsa("picante")
                .setQueso("mozzarella")
                .addPepperoni();
    }

    public static PizzaBuilder vegetarianaBuilder() {
        return new PizzaBuilder()
                .setMasa("integral")
                .setSalsa("pesto")
                .setQueso("mozzarella")
                .addIngredient("verduras frescas");
    }

    public Pizza build() {
        return new Pizza(masa, salsa, queso, ingredientes, extraQueso, pepperoni, champiñones,
                cebolla, jamon, aceitunas, pimientos, glutenFree, tamaño);
    }
}
