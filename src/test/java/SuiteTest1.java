import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(WildcardPatternSuite.class)
@SuiteClasses("**/*.class")
public class SuiteTest1 {
}
