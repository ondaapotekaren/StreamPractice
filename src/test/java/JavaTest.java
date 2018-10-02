import com.practice.Predicate;
import junit.framework.TestCase;

public class JavaTest extends TestCase {

    protected Predicate<String> moreThan1,moreThan3,lessThan3;

    protected void setUp(){
        moreThan1 = s -> s.length() > 1;
        moreThan3 = s -> s.length() > 3;
        lessThan3 = s -> s.length() < 3;
    }

    public void testAnd(){
        Predicate<String> cond = moreThan1.and(lessThan3);
        boolean res = cond.apply("ab");
        assertTrue(res);
    }

    public void testOr1() {
        Predicate<String> cond = moreThan1.or(moreThan3);
        boolean res = cond.apply("ab");
        assertTrue(res);
    }

    public void testOr2() {
        Predicate<String> cond = moreThan1.or(moreThan3);
        boolean res = cond.apply("a");
        assertFalse(res);
    }

    public void testNot() {
        Predicate<String> cond= moreThan1.not();
        boolean res = cond.apply("a");
        assertTrue(res);
    }

    public void tearDown() {
    }
}
