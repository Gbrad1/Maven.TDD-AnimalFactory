package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        Dog Kali = new Dog("Kali", new Date(), 102);
        DogHouse.add(Kali);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogTestById() {
        DogHouse.clear();
        Dog Kali = new Dog("Kali", new Date(), 102);
        DogHouse.add(Kali);
        DogHouse.remove(102);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        DogHouse.clear();
        Dog Kali = new Dog("Kali", new Date(), 102);
        DogHouse.add(Kali);
        DogHouse.remove(Kali);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        DogHouse.clear();
        Dog Kali = new Dog("Kali", new Date(), 102);
        DogHouse.add(Kali);
        Dog actual = DogHouse.getDogById(102);
        Dog expected = Kali;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void getNumberOfDogsTest() {
        DogHouse.clear();
        Dog Kali = new Dog("Kali", new Date(), 102);
        DogHouse.add(Kali);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
}
