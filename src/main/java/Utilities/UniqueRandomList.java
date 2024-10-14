package Utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The UniqueRandomList class generates a list of unique random integers.
 * This class ensures that no integer appears more than once in the generated list.
 */
public class UniqueRandomList {
    private List<Integer> randomList;  // List to store the unique random integers
    private int[] counterList;          // Array to track used integers
    private Random random;              // Random number generator

    /**
     * Constructs a UniqueRandomList instance.
     * Initializes the randomList and random fields.
     */
    public UniqueRandomList() {
        this.randomList = new ArrayList<>();
        this.random = new Random();
    }

    /**
     * Generates a list of unique random integers.
     *
     * @param index the number of unique random integers to generate.
     * @param bound the upper bound (exclusive) for the random integers.
     * @return a list of unique random integers of specified size.
     * <p>
     * This method fills the randomList with unique random integers, ensuring that
     * no integer is repeated. It uses a counter array to track which integers
     * have already been added to the list.
     * @throws IllegalArgumentException if the index is greater than the bound.
     */
    public List<Integer> uniqueRandomList(int index, int bound) {
        if (index > bound) {
            throw new IllegalArgumentException("Index cannot be greater than the bound.");
        }

        counterList = new int[bound];
        int x;
        for (int i = 0; i < index; i++) {
            x = random.nextInt(bound);
            while (this.counterList[x] != 0) {
                x = random.nextInt(bound);
            }
            this.counterList[x] = 1;
            this.randomList.add(x);
        }
        return this.randomList;
    }
}
