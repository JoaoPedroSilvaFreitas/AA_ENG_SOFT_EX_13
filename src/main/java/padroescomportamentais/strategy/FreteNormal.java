package padroescomportamentais.strategy;

public class FreteNormal implements TipoFrete {
    public float calcular(float distancia, float peso) {
        return (distancia * 0.5f) + (peso * 1.0f);
    }
}