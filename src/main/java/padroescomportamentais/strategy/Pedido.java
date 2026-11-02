package padroescomportamentais.strategy;

public class Pedido {
    private float valorFrete;

    public float getValorFrete() {
        return valorFrete;
    }

    public void calcularFreteNormal(float distancia, float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distancia, peso);
        this.valorFrete = calculadora.calcular(new FreteNormal());
    }

    public void calcularFreteExpresso(float distancia, float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distancia, peso);
        this.valorFrete = calculadora.calcular(new FreteExpresso());
    }
}