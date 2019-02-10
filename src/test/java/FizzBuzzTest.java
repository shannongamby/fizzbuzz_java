import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void returnsFizzWhenNumberIsThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.convert(3);
        Assert.assertEquals("fizz", actual);
    }

    @Test
    public void returnsBuzzWhenNumberIsFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.convert(5);
        Assert.assertEquals("buzz", actual);
    }
}

