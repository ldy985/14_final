package Test.Fields;

import Game.Fields.Start;
import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Objects;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * StartTest class
 * <p>
 * Bugs: none known
 *
 * @author Lasse Dyrsted
 * @version v.0.1
 */
public class StartTest {


    Start startField;

    @Before
    public void setUp() {
        this.startField = new Start("P-Plads", 0, Color.black);
    }

    @Test
    public void entityTest() {
        assertNotNull(startField);
        assertTrue(startField instanceof Start);
        assertTrue(Objects.equals(startField.getName(), "P-Plads"));
    }

    @Test
    public void testPassAction() {
        // TODO: 05-01-2017 implement testPassAction
    }

    @Override
    public String toString() {
        return "StartTest{" +
                "startField=" + startField +
                '}';
    }
}

