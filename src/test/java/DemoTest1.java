import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest1 {

    //pre & post condition

    @Before
    public void demoBefore(){
        System.out.println("This is demo before");
    }
    @After
    public void demoAfter(){
        System.out.println("This is demo after");
    }
    @Test
    public void test3(){
        System.out.println("this is demo test3");
    }

    @Test
    public void test1(){
        System.out.println("this is demo test1");
    }

    @Test
    public void test2(){
        System.out.println("this is demo test2");
    }
}
