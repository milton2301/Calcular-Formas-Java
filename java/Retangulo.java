
public class Retangulo {
    private float area;
    private float perimetro;
    private float base = 0;
    private float altura = 0;
    
    @Override
    public String toString(){
        return "Figura selecionada Retangulo! base:"+this.base+" altura: "+this.altura+" Arae:"+this.area+" Perimetro:"+this.perimetro;
    }
    
    public Retangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
        calcularRetangulo();
    }
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    private void calcularRetangulo() {
        area = base * altura;
        perimetro = base * 2 + altura * 2;
    }
}
