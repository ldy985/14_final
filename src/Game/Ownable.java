package Game;


/**
 * Ownable class
 * <p>
 * Bugs: none known
 *
 * @author Timothy Rasmussen
 * @author Lasse Dyrsted
 * @version v.0.2
 */
public abstract class Ownable extends Field {

    private final int price;
    private final int groupID;
    private Player owner;
    /**
     * The constructor of the Ownable type
     *
     * @param name   The name of the Field
     * @param price  The price of the Field
     */
    public Ownable(String name, int price, int groupID) {
        super(name);
        this.price = price;
        this.groupID = groupID;
    }

    /**
     * Getter for property 'groupID'.
     *
     * @return Value for property 'groupID'.
     */
    public int getGroupID() {
        return this.groupID;
    }

    /**
     * Calculated the Prawn value
     * @return the money amount you get for prawning the ownable.
     */
    private int calculatePrawnValue(){
        return price / 2;
    }

    public int getPawnPrice(){
        return calculatePrawnValue();
    }

    /**
     * Gets the price of the Field
     * @return the price
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * Make sure all subclasses implement this method
     */
    protected abstract int getRent();

    /**
     * Gets the owner of an ownable Field
     *
     * @return returns the owner.
     */
    public Player getOwner() {
        return owner;
    }

    /**
     * Sets the owner of an ownable field
     *
     * @param owner The new owner
     */
    public void setOwner(Player owner) {
        this.owner = owner;
    }

    /**
     * Runs when a player lands on the Field
     * @param player The player that lands on the Field
     */
    public void landOnField(Player player) {
        // TODO: 05-01-2017 add code
/*
        // No one owns the field and the player has the money to buy it
        if (owner == null && price <= player.getBalance()) {


            final String question = player.getName() + " " + (Language.getString("turn1") + " " +
                    Language.getString("buy1") + " " + getName() + " " + Language.getString("buy2") + " " + price + " ?");

            final String answer1 = Language.getString("no");
            final String answer2 = Language.getString("yes");

            // Checks whether the player wants to buy
            if (InterfaceController.getUserButtonPressed(question, answer1, answer2) == answer2) {

                player.addBalance(-price);
                player.addRealEstateValue(price);
                this.setOwner(player);
                InterfaceController.showMessage(player.getName() + " " + Language.getString("bought") + " " + getName());

            }
        }
        //Someone else owns the field
        if (owner != player && owner != null) {
            player.addBalance(-getRent());
            owner.addBalance(getRent());
        }
*/
    }
}