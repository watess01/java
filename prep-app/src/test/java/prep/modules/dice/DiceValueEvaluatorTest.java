package prep.modules.dice;

import junit.framework.TestCase;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class DiceValueEvaluatorTest extends TestCase {

    // use mockito to  mock the IDiceValueEvaluator interface
    IDiceValueConditionEvaluator dvce = mock(IDiceValueConditionEvaluator.class);

    IDiceValueEvaluator dve = new DiceValueEvaluator(dvce);

    // reset tests before each test
    protected void setUp() {
        reset(dvce);
    }

    public void testEvaluateCase_EvaluatesOneItem_OK() {
        // check the method evaluateSingles was called when the size is 1
        int [] values = {1};
        when(dvce.evaluateSingles(any(int[].class))).thenReturn(DiceValueCase.SingleOne);
        dve.evaluateCase(values);
        verify(dvce).evaluateSingles(values);
    }
    // check checkIdentical is called when array length is either 3,4,5 or 6
    public void testEvaluateCase_EvaluatesAllOfAKind_OK() {
        int [] values = {1,1,1};
        when(dvce.evaluateAllOfAKind(any(int[].class))).thenReturn(DiceValueCase.Triples);
        when(dvce.checkIdentical(any(int[].class))).thenReturn(true);
        dve.evaluateCase(values);
        verify(dvce).evaluateAllOfAKind(values);
    }
    // when items are not identical 
    public void testEvaluateCase_EvaluatesTwo_ReturnsOthers() {
        int [] values = {1,2};
        DiceValueCase actual = dve.evaluateCase(values);
        assertEquals(DiceValueCase.Others, actual);
    }
    // when items are not identical but length is 6
    public void testEvaluateCase_EvaluatesSixes_EvaluatesSixes() {
        int [] values = {1,2,3,4,5,6};
        when(dvce.checkIdentical(any(int[].class))).thenReturn(false);
        when(dvce.evaluateSixes(values)).thenReturn(DiceValueCase.SixOfAKind);
        dve.evaluateCase(values);
        verify(dvce).evaluateSixes(values);
    }





}


