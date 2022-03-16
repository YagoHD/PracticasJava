package operacioes;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Variables locales
        int a = 10;
        int b = 2;
        miMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a:" + aritmetica1.a);
        System.out.println("aritmetica1 b:" + aritmetica1.b);
        
        aritmetica1.sumar();
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("EL resultado de la operacion con retorno es : " + resultado);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 7);
        System.out.println("aritmetica2 a:" + aritmetica2.a);
        System.out.println("aritmetica2 b:" + aritmetica2.b);
        
        aritmetica2.sumar();
        resultado = aritmetica2.sumarConRetorno();
        System.out.println("EL resultado de la operacion con retorno es : " + resultado);
    }
    public static void miMetodo(){
        //la variable a esta fuera del alcance donde fue definida
        //int a = 3;
        System.out.println("Otro metodo");
    }
}
