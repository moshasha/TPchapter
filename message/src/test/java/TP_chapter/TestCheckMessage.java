package TP_chapter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2016/03/04.
 */
public class TestCheckMessage {
    CheckMessage myMessage = new CheckMessage();

    @Before
    public void setup() throws Exception{

    }

    @Test
    public void testMessage() throws Exception{
        Assert.assertNotEquals(myMessage.message1, myMessage.message2);
    }
}
