import org.junit.*;

public class GoogleTest {

    @BeforeClass
    public static void openApplication(){
        System.out.println("Gmail Opened");
    }

    @AfterClass
    public static void closeApplication(){
        System.out.println("Gmail Closed");
    }
    @Before
    public void login(){
        System.out.println("Login to application");
    }

    @After
    public void logout(){
        System.out.println("Logged out of application");
    }

    @Test
    public void CreateAndSendMail(){
        System.out.println("Mail created and sent");
    }

    @Test @Ignore
    public void CheckMail(){
        System.out.println("Mail checked");
    }
}
