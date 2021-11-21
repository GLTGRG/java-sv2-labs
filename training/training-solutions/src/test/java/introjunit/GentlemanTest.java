package introjunit;

import junit.framework.TestCase;
import org.junit.Test;

public class GentlemanTest extends TestCase {

    @Test
    public void testSayHello() {
        String name = "Gergo";
        String greeting = new Gentleman().sayHello(name);
        assertEquals("Hello Gergo", greeting);
    }

    @Test
    public void  testSayHelloNull(){
        String name = null;
        String greeting = new Gentleman().sayHello(name);
        assertEquals("Hello Anonymous", greeting);
    }
}