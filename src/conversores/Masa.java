package conversores;

public class Masa {

    public double valor; //gramos

    public Masa(double d, String s) {
        s = s.toUpperCase();
        switch (s) {
            case "TON":
                this.valor = d * 1000000;
                break;
            case "KG":
                this.valor = d * 1000;
                break;
            case "G":
                this.valor = d;
                break;
            case "MG":
                this.valor = d / 1000;
                break;
            case "LB":
                this.valor = d * 453.592;   //1 libra = 453.592g 
                break;
            case "ON":
                this.valor = Math.round((d * 28.3495) * 10.0) / 10.0;    //1 onza = 28.3495g
                break;
        }
    }

    public double Cambiar(String unidad) {
        unidad = unidad.toUpperCase();
        switch (unidad) {
            case "TON":
                return this.valor / 1000000;
            case "KG":
                return this.valor / 1000;
            case "G":
                return this.valor;
            case "MG":
                return this.valor * 1000;
            case "LB":
                return Math.round((this.valor / 453.592) * 1000.0) / 1000.0; //redondeo a 3 decimales
            case "ON":
                return Math.round((this.valor / 28.3495) * 100.0) / 100.0; //redondeo a 2 decimales
            default:
                System.out.printf("Unidad de masa %s desconocida\n", unidad);
                return 0;
        }
    }
}
