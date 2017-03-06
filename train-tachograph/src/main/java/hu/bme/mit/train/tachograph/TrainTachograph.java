package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * Created by meres on 3/6/17.
 */
public class TrainTachograph {


    Table<Date, Integer, Integer> adatok = HashBasedTable.create();


    public void fillData() {
        adatok.put(new Date(), 5, 10);
        adatok.put(new Date(), -5, 50);
    }

    public int getCount() {
        return adatok.size();
    }

}
