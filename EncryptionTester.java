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
    public void testAdd0(){
        
        int result = Encryption.wordsNum("aaa bbb");
        assertEquals(2,result);
        
    }
    @Test
    public void testAdd1(){
        
        int result = Encryption.wordsNum("aaa");
        assertEquals(1,result);
        
    }
    @Test
    public void testAdd2(){
        
        int result = Encryption.wordsNum("bfdh");
        assertEquals(1,result);
        
    }
    @Test
    public void testAdd3(){
        
        int result = Encryption.wordsNum("fdhdfh dfhdfh");
        assertEquals(2,result);
        
    }
    // methods 2 tests (matan)
    @Test
    public void testAdd4(){
        
        String result = Encryption.newPassword("aaa",1);
        assertEquals("aaa",result);
        
    }
    @Test
    public void testAdd5(){
        
        String result = Encryption.newPassword("aaa bbb",2);
        assertEquals("bbb aaa",result);
        
    }
    @Test
    public void testAdd6(){
        
        String result = Encryption.newPassword("aaa bbb ccc",3);
        assertEquals("ccc aaa bbb",result);
        
    }
    @Test
    public void testAdd7(){
        
        String result = Encryption.newPassword("dfghd dghg",2);
        assertEquals("dghg dfghd",result);
        
    }
    @Test
    public void testAdd8(){
        
        String result = Encryption.newPassword("gvjjgv jhvhvj hvhv",3);
        assertEquals("hvhv gvjjgv jhvhvj",result);
        
    }
    
    @Test
    public void testAdd9(){//muli
        
        String result = Encryption.restore("@b&1g0");
        assertEquals("abuigo",result);
        
    }
     @Test
    public void testAdd10(){//muli
        
        String result = Encryption.restore("@&10");
        assertEquals("auio",result);
        
    }
     @Test
    public void testAdd11(){//muli
        
        String result = Encryption.restore("00 11 &&@@");
        assertEquals("oo ii uuaa",result);
        
    }
     @Test
    public void testAdd12(){//muli
        
        String result = Encryption.restore("00 @@ p0");
        assertEquals("oo aa po",result);
        
    }
     @Test
    public void testAdd13(){//muli
        
        String result = Encryption.restore("o01i@");
        assertEquals("ooiia",result);
        
    }
        @Test
    public void testAdd14(){//muli
        
        String result = Encryption.replace("abuigo");
        assertEquals("@b&1g0",result);
        
    }
        @Test
    public void testAdd15(){//muli
        
        String result = Encryption.replace("aa bb io");
        assertEquals("@@ bb 10",result);
        
    }
        @Test
    public void testAdd16(){//muli
        
        String result = Encryption.replace("abcs");
        assertEquals("@bcs",result);
        
    }
        @Test
    public void testAdd17(){//muli
        
        String result = Encryption.replace("im ironman");
        assertEquals("1m 1r0nm@n",result);
        
    }
        @Test
    public void testAdd18(){//muli
        
        String result = Encryption.replace("David");
        assertEquals("D@v1d",result);
        
    }
    //Fisher
    //test method 3
     @Test
    public void testAdd19(){
        
        String result = Encryption.oldPassword("aaa",1);
        assertEquals("aaa",result);
        
    }
    @Test
    public void testAdd20(){
        
        String result = Encryption.oldPassword("aaa bbb",2);
        assertEquals("bbb aaa",result);
        
    }
    @Test
    public void testAdd21(){
        
        String result = Encryption.oldPassword("aaa bbb ccc",3);
        assertEquals("bbb ccc aaa",result);
        
    }
    @Test
    public void testAdd22(){
        
        String result = Encryption.oldPassword("one two",2);
        assertEquals("two one",result);
        
    }
    @Test
    public void testAdd23(){
        
        String result = Encryption.oldPassword("one two three",3);
        assertEquals("two three one",result);
        
    }
//everyonr except Eitan
//test method 4
     @Test
    public void testAdd24(){
        
        String result = Encryption.moveSingsRight("eitan didn't help");
        assertEquals("peitan didn't hel",result);
        
    }
    public void testAdd25(){
        
        String result = Encryption.moveSingsRight("test the work");
        assertEquals("ktest the wor",result);
        
    }
    public void testAdd26(){
        
        String result = Encryption.moveSingsRight("I don't know");
        assertEquals("wI don't kno",result);
        
    }
    public void testAdd27(){
        
        String result = Encryption.moveSingsRight("david cohen");
        assertEquals("ndavid cohe",result);
        
    }
    public void testAdd28(){
        
        String result = Encryption.moveSingsRight("last one");
        assertEquals("elast on",result);
        
    }
    //test method 5
     @Test
    public void testAdd29(){
        
        String result = Encryption.moveSingsRight("eitan didn't help");
        assertEquals("itan didn't helpe",result);
        
    }
    public void testAdd30(){
        
        String result = Encryption.moveSingsRight("test the work");
        assertEquals("est the workt",result);
        
    }
    public void testAdd31(){
        
        String result = Encryption.moveSingsRight("I don't know");
        assertEquals(" don't knowI",result);
        
    }
    public void testAdd32(){
        
        String result = Encryption.moveSingsRight("david cohen");
        assertEquals("avid cohend",result);
        
    }
    public void testAdd33(){
        
        String result = Encryption.moveSingsRight("last one");
        assertEquals("ast onel",result);
        
    }
}
