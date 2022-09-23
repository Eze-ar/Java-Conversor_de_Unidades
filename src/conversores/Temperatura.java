package conversores;

public class Temperatura {

    public double valor; //En Kelvin

    public Temperatura(double t, String s) {
        s = s.toUpperCase();

        switch (s) {
            case "ºC":
                this.valor = t + 273.15;
                break;
            case "K":
                this.valor = t;
                break;
            case "ºF":
                this.valor = Math.round((t - 32) * 5 / 9 + 273.15) * 100.0/100.0;
                break;
        }

    }

    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();

        switch (unidad) {
            case "ºC":
                return Math.round(this.valor - 273.15) * 100.0/100.0;
            case "K":
                return this.valor;
            case "ºF":
                return Math.round((this.valor - 273.15) * 9 / 5 + 32) * 100.0/100.0;
            default:
                System.out.printf("Unidad de temperatura %s desconocida\n", unidad);
                return 0;
        }
    }
}
