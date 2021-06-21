package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    private GHappy gh;

    @BeforeEach
    public void initialize (){this.gh = new GHappy();}
    @Test
    public void GHappyReturnsTrue(){
        boolean result = gh.gHappy("hhhgghhh");
        Assertions.assertTrue(result);
    }

    @Test
    public void GHappyReturnsFlaseWithOneG(){
        boolean result = gh.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void GHappyReturnsFalseWitEvenNumberOfG(){
        boolean result = gh.gHappy("xxggyygxx");
        Assertions.assertFalse(result);
    }
}
