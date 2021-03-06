package Game.ChanceCards;

import Game.GameController;
import Game.Player;

/**
 * MoneyCard does....blabla
 * <p>
 * Bugs: none known
 *
 * @author Mathias S Larsen (2016)
 * @author Casper Bodskov
 * @author Lasse Dyrsted
 * @author Michael Klan
 * @author Rasmus Blichfeldt
 * @author Timothy Rasmussen
 * @version v.0.1
 */
public class MoneyCard extends ChanceCard {

    private int baseAmount;
    private int baseHouse;
    private int baseHotel;

    public MoneyCard(String description, int baseAmount, int baseHouse, int baseHotel) {
        super(description);
        this.baseAmount = baseAmount;
        this.baseHouse = baseHouse;
        this.baseHotel = baseHotel;
    }

    /** {@inheritDoc} */
    @Override
    public void action(Player user) {

        int[] housesAndHotels = GameController.getGameBoard().getNumberOfOwnedHH(user);

        user.addBalance(baseAmount + ((baseHotel * housesAndHotels[0]) * (baseHouse * housesAndHotels[1])));

    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "MoneyCard{" +
                "baseAmount=" + baseAmount +
                ", baseHouse=" + baseHouse +
                ", baseHotel=" + baseHotel +
                '}';
    }
}
