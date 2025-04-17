import java.util.List;

public class Pizza {
    private final String masa;
    private final String salsa;
    private final String queso;
    private final List<String> ingredientes;
    private final boolean extraQueso;
    private final boolean pepperoni;
    private final boolean champiñones;
    private final boolean cebolla;
    private final boolean jamon;
    private final boolean aceitunas;
    private final boolean pimientos;
    private final boolean glutenFree;
    private final int tamaño;

    public Pizza(String masa, String salsa, String queso, List<String> ingredientes,
                 boolean extraQueso, boolean pepperoni, boolean champiñones,
                 boolean cebolla, boolean jamon, boolean aceitunas,
                 boolean pimientos, boolean glutenFree, int tamaño) {
        this.masa = masa;
        this.salsa = salsa;
        this.queso = queso;
        this.ingredientes = ingredientes;
        this.extraQueso = extraQueso;
        this.pepperoni = pepperoni;
        this.champiñones = champiñones;
        this.cebolla = cebolla;
        this.jamon = jamon;
        this.aceitunas = aceitunas;
        this.pimientos = pimientos;
        this.glutenFree = glutenFree;
        this.tamaño = tamaño;
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public String getQueso() {
        return queso;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isChampiñones() {
        return champiñones;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public boolean isJamon() {
        return jamon;
    }

    public boolean isAceitunas() {
        return aceitunas;
    }

    public boolean isPimientos() {
        return pimientos;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public int getTamaño() {
        return tamaño;
    }

    @Override
    public String toString() {
        return "Pizza {" +
                "masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", queso='" + queso + '\'' +
                ", ingredientes=" + ingredientes +
                ", extraQueso=" + extraQueso +
                ", pepperoni=" + pepperoni +
                ", champiñones=" + champiñones +
                ", cebolla=" + cebolla +
                ", jamon=" + jamon +
                ", aceitunas=" + aceitunas +
                ", pimientos=" + pimientos +
                ", glutenFree=" + glutenFree +
                ", tamaño=" + tamaño +
                '}';
    }
}
