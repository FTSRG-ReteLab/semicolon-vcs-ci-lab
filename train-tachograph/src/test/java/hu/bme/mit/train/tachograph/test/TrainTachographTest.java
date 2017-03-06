package hu.bme.mit.train.tachograph.test;

import hu.bme.mit.train.tachograph.TrainTachograph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by meres on 3/6/17.
 */
public class TrainTachographTest {

    TrainTachograph tt;

    @Before
    public void before() {
        tt = new TrainTachograph();
    }

    @Test
    public void test1() {
        Assert.assertEquals(0, tt.getCount());
        tt.fillData();
        Assert.assertEquals(2, tt.getCount());
    }

}
