package padroescomportamentais.strategy;

public class FreteExpresso implements TipoFrete {
    public float calcular(float distancia, float peso) {
        return (distancia * 1.0f) + (peso * 2.0f);
    }
}