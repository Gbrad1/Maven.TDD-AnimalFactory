package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

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
        Date expected = new Date();
        dog.setBirthDate(expected);
        Assert.assertEquals(expected, dog.getBirthDate());
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
        Dog dog = new Dog("Milo", null, null);
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

    @Test
    public void instanceOfAnimal() {
        Dog dog = new Dog(null, null, 0);
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void instanceOfMammal() {
        Dog dog = new Dog(null, null, 0);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
