package padroescomportamentais.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularFreteNormal() {
        Pedido Pedido = new Pedido();
        Pedido.calcularFreteNormal(160.0f, 20.0f);
        assertEquals(100.0f, Pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteExpresso() {
        Pedido Pedido = new Pedido();
        Pedido.calcularFreteExpresso(160.0f, 20.0f);
        assertEquals(200.0f, Pedido.getValorFrete());
    }

}
