import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUnit {
    App a = new App();
    
    @Test
    public void testAdd() {
       assertEquals(false,App.getBoolTest());
    }
}
