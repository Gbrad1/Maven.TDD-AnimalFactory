package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest() {
        CatHouse.clear();
        Cat mittens = new Cat(null, null, null);
        CatHouse.add(mittens);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeId() {
        CatHouse.clear();
        Cat mittens = new Cat(null, null, 10);
        CatHouse.add(mittens);
        CatHouse.remove(10);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        CatHouse.clear();
        Cat mittens = new Cat(null, null, null);
        CatHouse.add(mittens);
        CatHouse.remove(mittens);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        CatHouse.clear();
        Cat mittens = new Cat("Mittens", new Date(), 404);
        CatHouse.add(mittens);
        Cat actual = CatHouse.getCatById(404);
        Assert.assertEquals(mittens, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCats() {
        CatHouse.clear();
        Cat mittens = new Cat("Mittens", new Date(), 404);
        Cat chaunceyVonSnufflesTheThird = new Cat("Mittens", new Date(), 404);
        CatHouse.add(mittens);
        CatHouse.add(chaunceyVonSnufflesTheThird);
        Integer expected = 2;
        CatHouse.getNumberOfCats();
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
}
