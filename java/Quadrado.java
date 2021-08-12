
public class Quadrado {
    private float area;
    private float perimetro;
    private float lado;
    
    public Quadrado(float lado){
        this.lado = lado;
        calcularQuadrado();
    }
    
    @Override
    public String toString(){
      return "Figura selecionada Quadrado! Lado:"+this.lado+" Area:"+this.area+" Perimetro:"+this.perimetro;  
    }
    
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    private void calcularQuadrado() {
        area = lado * lado;
        perimetro = lado * 4;
    }

}
