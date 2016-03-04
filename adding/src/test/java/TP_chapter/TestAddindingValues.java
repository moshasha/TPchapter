package TP_chapter;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class TestAddindingValues {

    Adding myAdding = new Adding();

    @Before
    public void setup() throws  Exception
    {

    }

    @Test
    public void testAdding() throws Exception
    {
        Assert.assertEquals(10, myAdding.addValues());
    }
}
