import com.poo.model.alsc2.model.PileEmptyException;
import com.poo.model.alsc2.model.PileFullException;
import com.poo.model.alsc2.model.PileList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PileListTest {

    @Test
    public void testStack() throws PileFullException, PileEmptyException {
        PileList<Integer> pile = new PileList<>(3);
        pile.stack(1);
        pile.stack(2);
        pile.stack(3);
        assertEquals(3, pile.size());
        assertEquals(3, pile.capacity());
        assertEquals(3, pile.top().intValue());
        assertTrue(pile.isFull());
    }

    @Test
    public void testUnstack() throws PileFullException, PileEmptyException {
        PileList<Integer> pile = new PileList<>(3);
        pile.stack(1);
        pile.stack(2);
        pile.stack(3);
        assertEquals(3, pile.unstack().intValue());
        assertEquals(2, pile.unstack().intValue());
        assertEquals(1, pile.unstack().intValue());
        assertEquals(0, pile.size());
        assertEquals(3, pile.capacity());
        assertTrue(pile.isEmpty());
    }

    @Test
    public void testTop() throws PileFullException, PileEmptyException {
        PileList<Integer> pile = new PileList<>(3);
        pile.stack(1);
        pile.stack(2);
        pile.stack(3);
        assertEquals(3, pile.top().intValue());
        assertEquals(3, pile.top().intValue());
        assertEquals(3, pile.top().intValue());
        assertEquals(3, pile.size());
        assertEquals(3, pile.capacity());
        assertFalse(pile.isEmpty());
        assertTrue(pile.isFull());
    }

    @Test
    public void testCapacity() {
        PileList<Integer> pile = new PileList<>(3);
        assertEquals(3, pile.capacity());
    }

    @Test
    public void testSize() throws PileFullException {
        PileList<Integer> pile = new PileList<>(3);
        assertEquals(0, pile.size());
        pile.stack(1);
        assertEquals(1, pile.size());
        pile.stack(2);
        assertEquals(2, pile.size());
        pile.stack(3);
        assertEquals(3, pile.size());
    }

    @Test
    public void testIsEmpty() throws PileFullException {
        PileList<Integer> pile = new PileList<>(3);
        assertTrue(pile.isEmpty());
        pile.stack(1);
        assertFalse(pile.isEmpty());
        pile.stack(2);
        assertFalse(pile.isEmpty());
        pile.stack(3);
        assertFalse(pile.isEmpty());
    }

    @Test
    public void testIsFull() throws PileFullException {
        PileList<Integer> pile = new PileList<>(3);
        assertFalse(pile.isFull());
        pile.stack(1);
        assertFalse(pile.isFull());
        pile.stack(2);
        assertFalse(pile.isFull());
        pile.stack(3);
        assertTrue(pile.isFull());
    }
}
