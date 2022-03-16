package operacioes;

public class Aritmetica {
    //ATRIBUTOS
    int a;
    int b;
    
    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
        
    }
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    //METODOS
    public void sumar(){
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        //return resultado;
        return a + b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;//El argumento se asigna al atributo this.a
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
    
    
}
