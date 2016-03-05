package TP_chapter;

import TP_chapter.determineFalse.ReturnFalse;
import TP_chapter.determineFloat.FloatingPoint;
import TP_chapter.determineInteger.IntegerPoint;
import TP_chapter.determineNonNull.CheckNonNull;
import TP_chapter.determineNull.CheckIsNull;
import TP_chapter.determineTrue.ReturnTrue;
import TP_chapter.objectEquality.CheckObjectEquality;
import TP_chapter.objectIdentity.CheckObjectIdentity;
import org.junit.*;

/**
 * Created by student on 2016/03/02.
 */


public class ApplicationTesting {
    FloatingPoint myFloat = new FloatingPoint();
    IntegerPoint myInteger = new IntegerPoint();
    CheckObjectEquality equality1 = new CheckObjectEquality();
    CheckObjectEquality equality2 = new CheckObjectEquality();
    CheckObjectIdentity identity = new CheckObjectIdentity();
    ReturnFalse checkFalse = new ReturnFalse();
    ReturnTrue checkTrue = new ReturnTrue();
    CheckIsNull nullValue = new CheckIsNull();
    CheckNonNull notNullValue = new CheckNonNull();
    DetermineTimeout myTout = new DetermineTimeout();
    DetermineArrayContent myArrayy = new DetermineArrayContent();
    DetermineDisabling disable = new DetermineDisabling();
    DetermineFailing fail = new DetermineFailing();

    @Before
    public void setUp() throws Exception {

    }

    //Testing a float
    @Test
    public void testFloat() throws Exception{
       Assert.assertEquals(7.0, myFloat.isFloat(),.0);

    }

    //Testing integer
    @Test
    public  void testInt() throws Exception{
        Assert.assertEquals(6, myInteger.isInteger());
    }

    @Test
    public void testObjectEquality() throws Exception
    {
        Assert.assertEquals(equality1.firstObject, equality2.secondObject);
    }

    @Test
    public void testObjectIdentity() throws Exception
    {
        Assert.assertNotSame(identity.firstObject, identity.secondObject);
    }

    @Test
    public  void testReturnTrue() throws Exception{
        Assert.assertTrue(checkTrue.returnTrue());
    }

    @Test
    public  void testReturnFalse() throws Exception{
        Assert.assertFalse(checkFalse.returnFalse());
    }

    @Test
    public void testNull() throws Exception{
        Assert.assertNull(nullValue.checkNull());
    }

    @Test
    public void testNonNull() throws Exception{
        Assert.assertNotNull(notNullValue.returnNonNull());
    }

    @Test(timeout=5000)
    public void timeoutObj() throws Exception {
        myTout.timeOut();
    }

    @Test
    public void testArray() throws Exception{
        Assert.assertEquals(myArrayy.names1[1], myArrayy.names2[1]);
    }

    @Ignore
    public void testDiasbling() throws Exception
    {
        Assert.assertEquals(40, disable.disabling());
    }


    @Test
    public void testFailing() throws Exception{
        Assert.assertNotEquals(0,fail.failing());
        //Assert.fail("assert failed");
    }

    @After
    public void tearDown() throws Exception {
    }
}
