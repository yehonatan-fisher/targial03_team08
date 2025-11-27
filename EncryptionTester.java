import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Write a description of class EncryptionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EncryptionTester
{
    @Test
    //methods 1 tests (matan)
    public void testAdd(){
        
        int result = Encryption.wordsNum("aaa bbb ccc");
        assertEquals(3,result);
        
    }
    @Test
    public void testAdd1(){
        
        int result = Encryption.wordsNum("aaa bbb");
        assertEquals(2,result);
        
    }
    @Test
    public void testAdd2(){
        
        int result = Encryption.wordsNum("aaa");
        assertEquals(1,result);
        
    }
    // methods 2 tests (matan)
    @Test
    public void testAdd3(){
        
        String result = Encryption.newPassword("aaa",1);
        assertEquals("aaa",result);
        
    }
    @Test
    public void testAdd4(){
        
        String result = Encryption.newPassword("aaa bbb",2);
        assertEquals("bbb aaa",result);
        
    }
    @Test
    public void testAdd5(){
        
        String result = Encryption.newPassword("aaa bbb ccc",3);
        assertEquals("ccc aaa bbb",result);
        
    }
}
