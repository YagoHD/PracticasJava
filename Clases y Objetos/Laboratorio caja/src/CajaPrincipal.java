public class CajaPrincipal {
    public static void main(String[] args) {
        Caja caja1 = new Caja(3, 2, 6);
        int volumen = caja1.calculaVolumen();
        System.out.println("El volumen de la caja es: " + volumen);
    }
}
