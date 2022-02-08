import java.util.ArrayList;
/**
 * This class represents a UsedCarLot
 *
 * @author Raymond Chen
 */
public class UsedCarLot {
    /** The arrayList of the UsedCarLot */
    private ArrayList<Car> inventory;

    /**
     * Instantiates a UsedCarLot object and initializes the inventory to an empty ArrayList
     */
    public UsedCarLot()
    {
        inventory = new ArrayList<Car>();
    }

    /**
     * Returns the inventory of the used car lot
     * @return inventory
     */
    public ArrayList<Car> getInventory()
    {
        return inventory;
    }

    /**
     * adds Car to end of inventory
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *  @param car new Car object added to inventory
     */
    public void addCar(Car car)
    {
        inventory.add(car);
    }

    /**
     * Swaps the Car at idx1 with the Car at idx2 in inventory and
     * returns true; however, if either idx1 or idx2 exceed the
     * bounds of the inventory or is negative, no changes are made
     * to the inventory and false is returned.
     * <p>
     * PRECONDITION: num &lt; inventory.size(); num2 &lt; inventory.size(); 0 &lt;= num; 0 &lt;= 0
     * @param num index of car1 being swapped
     * @param num2 index of car2 being swapped
     * @return true if inventory was swapped
     */
    public boolean swap(int num, int num2)
    {
        if(num< inventory.size()&&num2< inventory.size()&&num>=0&&num2>=0)
        {
            Car car1 = inventory.get(num);
            Car car2 = inventory.get(num2);
            inventory.set(num, car2);
            inventory.set(num2, car1);
            return true;
        }
        else
        {
            return false;
        }
    }


    /**
     * void method that adds a car object at the given index
     * @param indexToAdd index where car object being added
     * @param carToAdd car object being added
     * Adds a Car to the inventory list at the index specified
     * by indexToAdd; this method increases the size of inventory by 1
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     * DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
     * like you did the other addCar method; also note that this method is void
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd,carToAdd);
    }

    /**
     * car method that return sold car
     * @param indexOfCarToSell index of car being removed
     * "sells" the Car located at indexOfCarToSell which
     * removes it from the inventory list and shifting the remaining
     * Cars in the inventory list to the left to fill in the gap;
     * this method reduces the size of inventory by 1
     * Returns the Car that is being "sold" (removed from lot)
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * HINT: the ArrayList remove() method returns the removed element while also
     * removing it from the ArrayList
     * @return car "sold"
      */
    public Car sellCarShift(int indexOfCarToSell)
    {
        Car sold = inventory.remove(indexOfCarToSell);
        return sold;
    }

    /**
     * car method that returns car being "sold" (replaced with null)
     * @param indexOfCarToSell index of Car in inventory
     * "sells" the Car located at indexOfCarToSell,
     * but instead of removing it and shifting the inventory
     * list to the left, REPLACE the Car at indexOfCarToSell
     * with NULL, thus creating an "empty parking spot" on the lot;
     * this method does NOT reduce the size of inventory by 1
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     * @return car "sold"
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        Car sold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold;
    }

    /**
     * Moves Car located at index indexOfCarToMove to index
     * destinationIndex; if destinationIndex >
     * indexOfCarToMove, moves the Car to the right in
     * inventory; if destinationIndex &lt; indexOfCarToMove, moves
     * the Car to the left in the inventory.
     * @param  indexOfCarToMove  index of car being moved
     * @param destinationIndex   where car is being moved
     * should shift accordingly
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     *                 destinationIndex &lt; inventory.size()
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car move = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, move);
    }



}
