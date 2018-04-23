




import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","json:target/cucumber.json"},tags= "@ty")
public class AbsenceEnPaieRunner {
}