import static org.junit.Assert.*;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void setup() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NX"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void hasCityTest() {
        City city = new City("Halifax", "NX");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        assertFalse(list.hasCity(new City("Edmonton", "AB")));
    }

    @Test
    public void deleteCityTest() {
        City city = new City("Halifax", "NX");
        list.addCity(city);
        list.addCity(new City("Edmonton", "AB"));
        int listSize = list.getCount();
        list.deleteCity(city);
        assertEquals(list.getCount(), listSize - 1);
    }

    @Test
    public void countCityTest() {
        City city = new City("Halifax", "NX");
        int expected = 10;
        for (int i=0; i<expected; i++) {
            list.addCity(city);
        }
        assertEquals(list.countCity(city), 10);

    }
}
