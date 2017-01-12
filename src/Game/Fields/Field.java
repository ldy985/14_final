package Game.Fields;


import Game.Player;

import java.awt.*;

/**
 * Field defines common attribues and methods for all the Field types
 * <p>
 * Bugs: none known
 *
 * @author Timothy Rasmussen
 * @version v.0.1
 */
public abstract class Field {

    protected final int groupID;
    protected final Color color;
    protected String name;

    /**
     * Constructs a Field
     *
     * @param name The name of the Field
     * @param color
     */
    public Field(String name, int groupID, Color color) {

        this.name = name;
        this.groupID = groupID;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
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
     * Handles the stuff that needs to happen when a player lands on a Field
     *
     * @param player The player that lands on the Field
     */
    public abstract void landOnField(Player player);

    public abstract desktop_fields.Field convertToGUI();

    @Override
    public String toString() {
        return "Field{" +
                "groupID=" + groupID +
                ", name='" + name + '\'' +
                '}';
    }
}
