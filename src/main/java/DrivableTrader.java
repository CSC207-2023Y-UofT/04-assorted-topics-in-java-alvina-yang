/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;
public class DrivableTrader extends Trader<Drivable> {
    /**
     * Construct a DrivableTrader identical to trader with only Drivable
     * objects such as inventory, wishlist, and money.
     *
     * @param inventory Objects which are in the DrivableTrader's inventory
     * @param wishlist Objects which are in the DrivableTrader's wishlist.
     * @param money The DrivableTrader's money.
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    public DrivableTrader(int money){
        super(money);
    }

    @Override
    public int getSellingPrice(Drivable object) {
        int sellingPrice = super.getSellingPrice(object);
        if (sellingPrice != Tradable.MISSING_PRICE) {
            sellingPrice += object.getMaxSpeed();
        }
        return sellingPrice;

    }
}