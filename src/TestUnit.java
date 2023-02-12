import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUnit {
    App a = new App();
    
    @Test
    public void testAdd() {
        System.out.println("inside test case");
       assertEquals(false,App.getBoolTest());
    }
}
