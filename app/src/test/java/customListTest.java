import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class customListTest {

private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null,new ArrayList<City>());
    }


    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Ab"));
        assertEquals(list.getCount(),listSize+1);

    }

    @Test
    void testDelete() {

        City city = new City("Regina", "Saskatchewan");
        list.add(city);
        assertEquals(1, list.getCount());
        list.delete(city);
        assertEquals(0, list.getCount());
    }
}
