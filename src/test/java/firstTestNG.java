import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstTestNG {
    @Test
    void setup() {
        System.out.println("setup method");
    }
    @Test
    void testSteps(){
        System.out.println("test steps method");
    }
    @Test
    void teardown(){
        System.out.println("tear down method");
    }

}
