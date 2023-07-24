package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<T extends Ageable> {

    private List<T> items;
    public Shelter() {
        items = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return items.size();
    }

    public void add(Object object) {
        items.add((T) object);
    }

    public Boolean contains(Object object) {
        return items.contains(object);
    }

    public void remove(Object object) {
        items.remove(object);
    }

    public Object get(Integer index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }

    public Integer getIndexOf(Object ageable) {
        return items.indexOf(ageable);
    }
}