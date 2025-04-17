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
    private int tamaño = 30;

    public PizzaBuilder masa(String masa) {
        this.masa = masa;
        return this;
    }

    public PizzaBuilder salsa(String salsa) {
        this.salsa = salsa;
        return this;
    }

    public PizzaBuilder queso(String queso) {
        this.queso = queso;
        return this;
    }

    public PizzaBuilder agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
        return this;
    }

    public PizzaBuilder extraQueso() {
        this.extraQueso = true;
        return this;
    }

    public PizzaBuilder pepperoni() {
        this.pepperoni = true;
        return this;
    }

    public PizzaBuilder champiñones() {
        this.champiñones = true;
        return this;
    }

    public PizzaBuilder cebolla() {
        this.cebolla = true;
        return this;
    }

    public PizzaBuilder jamon() {
        this.jamon = true;
        return this;
    }

    public PizzaBuilder aceitunas() {
        this.aceitunas = true;
        return this;
    }

    public PizzaBuilder pimientos() {
        this.pimientos = true;
        return this;
    }

    public PizzaBuilder sinGluten() {
        this.glutenFree = true;
        return this;
    }

    public PizzaBuilder tamaño(int tamaño) {
        this.tamaño = tamaño;
        return this;
    }

    public static PizzaBuilder margaritaBuilder() {
        return new PizzaBuilder()
                .masa("fina")
                .salsa("tomate")
                .queso("mozzarella");
    }

    public static PizzaBuilder pepperoniBuilder() {
        return new PizzaBuilder()
                .masa("tradicional")
                .salsa("picante")
                .queso("mozzarella")
                .pepperoni();
    }

    public static PizzaBuilder vegetarianaBuilder() {
        return new PizzaBuilder()
                .masa("integral")
                .salsa("pesto")
                .queso("mozzarella")
                .agregarIngrediente("verduras frescas");
    }

    public Pizza build() {
        return new Pizza(masa, salsa, queso, ingredientes,
                extraQueso, pepperoni, champiñones,
                cebolla, jamon, aceitunas,
                pimientos, glutenFree, tamaño);
    }
}
