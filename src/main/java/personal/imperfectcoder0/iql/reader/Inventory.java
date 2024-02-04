package personal.imperfectcoder0.iql.reader;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

public class Inventory implements Iterable<Integer> {
    private final int id;
    private List<Integer> inventory;
    public Inventory(int id) {
        this.id = id;
    }

    public Inventory(int id, List<Integer> inventory) {
        this(id);
        this.inventory = inventory;
    }

    public int getId() {
        return id;
    }



    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return inventory.listIterator();
    }
}
