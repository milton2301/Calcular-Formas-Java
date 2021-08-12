
public class Circulo {
    private double area;
    private double perimetro;
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
        calculaCirculo();
    }
    
    @Override
    public String toString(){
        return "Figura selecionada Circulo! Raio:"+this.raio+" Area:"+this.area+" Perimetro:"+this.perimetro;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    private void calculaCirculo() {
        area = Math.PI * raio * raio;
        perimetro = 2 * Math.PI * raio;
    }
}
