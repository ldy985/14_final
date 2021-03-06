package Game.Fields;


import Game.GameBoard;
import Game.GameController;

import java.awt.*;
import java.util.Objects;

/**
 * Brewery field: Keeps track on the rent of the field.
 * <p>
 * Bugs: none known
 *
 * @author Mathias S Larsen (2016)
 * @author Casper Bodskov
 * @author Lasse Dyrsted
 * @author Michael Klan
 * @author Rasmus Blichfeldt
 * @author Timothy Rasmussen
 * @version v.0.2
 */
public class Brewery extends Ownable {


    int baseRent;

    public Brewery(String name, int groupID, Color color, int price, int baseRent) {
        super(name, groupID, color, price);
        this.baseRent = baseRent;

    }


    /** {@inheritDoc} */
    public int getRent() {
        // receive gameboard object from GameController
        GameBoard gameBoard = GameController.getGameBoard();

        Ownable otherField;

        if (Objects.equals(this, gameBoard.getField(13))) {

            otherField = (Ownable) gameBoard.getField(13);

        } else {

            otherField = (Ownable) gameBoard.getField(29);
        }

        if (Objects.equals(this.getOwner(), otherField.getOwner())) {

            baseRent = gameBoard.getShaker().getSum() * 200;

        } else {

            baseRent = gameBoard.getShaker().getSum() * 100;
        }

        return baseRent;
    }


    /** {@inheritDoc} */
    public desktop_fields.Brewery convertToGUI() {
        desktop_fields.Brewery.Builder a = new desktop_fields.Brewery.Builder()
                .setTitle(name)
                .setFgColor(Color.black)
                .setBgColor(color)
                .setSubText(price + "");
        return a.build();
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return "Brewery{" +
                "baseRent=" + baseRent +
                '}';
    }
}



