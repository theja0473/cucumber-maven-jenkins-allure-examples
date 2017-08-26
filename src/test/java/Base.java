import com.codeborne.selenide.Configuration;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;

public class Base {

    @Before
    public void setUp() {
//        PhantomJsDriverManager.getInstance().useTaobaoMirror().setup();
//        Configuration.browser = "PhantomJS";
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "Chrome";
    }
}
