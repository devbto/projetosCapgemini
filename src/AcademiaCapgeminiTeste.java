import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AcademiaCapgeminiTeste {

    @Test
    public void AtvMedianaTest() {
        int array[] = { 9, 2, 1, 4, 6 };
        int resultado = AcademiaCapgemini.EncontrarMediana(array);

        assertEquals(4, resultado);
    }

    @Test
    public void ContarParesPorDiferencaTest() {
        int n[] = { 1, 5, 3, 4, 2 };
        int x = 2;

        int resultado = AcademiaCapgemini.ContarDiferenca(n, x);

        assertEquals(3, resultado);
    }

    @Test
    public void EncriptandoTextoEx1Test(){
        String resultado = AcademiaCapgemini.EncriptandoTexto("tenha um bom dia");
        assertEquals("taoa eum nmd hbi", resultado);
    }

    @Test
    public void EncriptandoTextoEx2Test(){
        String resultado = AcademiaCapgemini.EncriptandoTexto("ola mundo");
        assertEquals("omd luo an", resultado);
    }

}