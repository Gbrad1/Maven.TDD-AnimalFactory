package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest() {
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";
        dog.setName(givenName);
        Date currentDate = new Date();
        Date actual = dog.getBirthDate();
        Assert.assertEquals(currentDate, actual);
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";
        dog.setName(givenName);
        String expected = dog.speak();
        Assert.assertEquals(expected, dog.speak());
    }

    @Test
    public void eatTest() {
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";
        int expected = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, 0);
    }

    @Test
    public void getIdTest() {
        Dog dog = new Dog(null, null, 0);
        String givenName = "Milo";
        Integer id = dog.getId();
        Integer expected = 0;
        Assert.assertEquals(expected, id);
    }
}
