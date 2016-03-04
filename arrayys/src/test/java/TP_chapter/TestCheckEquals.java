package TP_chapter;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class TestCheckEquals {
    CheckEquas myEquals = new CheckEquas();

    @Before
    public void setup() throws Exception
    {

    }

    @Test
    public void testEquals() throws Exception{
        Assert.assertEquals(myEquals.name1, myEquals.name2);
    }
}
