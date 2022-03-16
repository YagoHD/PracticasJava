
public class Caja {
    int anchura;
    int altura;
    int profundidad;
    
    public Caja(){
        System.out.println("Constructor ejecutandose");
    }
    
    public Caja(int anchura, int altura, int profundidad){
        this.anchura = anchura;
        this.altura = altura;
        this.profundidad = profundidad;
    }
    
    public int calculaVolumen(){
        int volumen = this.anchura * this.altura * this.profundidad;
        return volumen;
    }
}
