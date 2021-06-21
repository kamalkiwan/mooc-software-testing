package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {
    private CaesarShiftCipher csc;

    @BeforeEach
    public void initailize (){
        this.csc = new CaesarShiftCipher();
    }
    @Test
    public void normalMessageABC(){
        String result = "def";
        Assertions.assertEquals(csc.CaesarShiftCipher("abc",    3),result );
    }

    @Test
    public void normalMessageXYZ(){
        String result = "abc";
        Assertions.assertEquals(csc.CaesarShiftCipher("xyz",    3),result );
    }

}
