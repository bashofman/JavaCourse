import nl.bas.archaeo.model.Pallace;
import org.junit.Assert;
import org.junit.Test;


public class PallaceTest {

    @Test
    public void testSetArea(){
        Pallace pallace = new Pallace("Mallia", "Pallace");
        pallace.setArea(45.98);

        Assert.assertEquals(45.98, pallace.getArea(),0.01);

    }
}
