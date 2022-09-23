package conversores;

public class Distancia {

    public double valor; //metros

    public Distancia(double m, String s) {
        s = s.toUpperCase();

        switch (s) {
            case "KM":
                this.valor = m * 1000;
                break;
            case "M":
                this.valor = m;
                break;
            case "CM":
                this.valor = m / 100;
                break;
            case "MI":
                this.valor = m * 1609.344;
                break;
            case "IN":
                this.valor = m / 39.37;
                break;
        }
    }

    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();

        switch (unidad) {
            case "KM":
                return this.valor / 1000;
            case "M":
                return this.valor;
            case "CM":
                return this.valor * 100;
            case "MI":
                return this.valor / 1609.344;
            case "IN":
                return this.valor * 39.3701;
            default:
                System.out.printf("Unidad de distancia %s desconocida\n", unidad);
                return 0;
        }
    }
}
