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
     
    @Test
    public void testAdd6(){//muli
        
        String result = Encryption.restore("@b&1g0");
        assertEquals("abuigo",result);
        
    }
     @Test
    public void testAdd7(){//muli
        
        String result = Encryption.restore("@&10");
        assertEquals("auio",result);
        
    }
     @Test
    public void testAdd8(){//muli
        
        String result = Encryption.restore("00 11 &&@@");
        assertEquals("oo ii uuaa",result);
        
    }
     @Test
    public void testAdd9(){//muli
        
        String result = Encryption.restore("00 @@ p0");
        assertEquals("oo aa po",result);
        
    }
     @Test
    public void testAdd10(){//muli
        
        String result = Encryption.restore("o01i@");
        assertEquals("ooiia",result);
        
    }
        @Test
    public void testAdd11(){//muli
        
        String result = Encryption.replace("abuigo");
        assertEquals("@b&1g0",result);
        
    }
        @Test
    public void testAdd12(){//muli
        
        String result = Encryption.replace("aa bb io");
        assertEquals("@@ bb 10",result);
        
    }
        @Test
    public void testAdd13(){//muli
        
        String result = Encryption.replace("abcs");
        assertEquals("@bcs",result);
        
    }
        @Test
    public void testAdd14(){//muli
        
        String result = Encryption.replace("im ironman");
        assertEquals("1m 1r0m@n",result);
        
    }
        @Test
    public void testAdd15(){//muli
        
        String result = Encryption.replace("David");
        assertEquals("D@v1d",result);
        
    }
    
}
