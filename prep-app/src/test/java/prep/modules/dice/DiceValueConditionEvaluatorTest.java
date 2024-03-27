package prep.modules.dice;

import junit.framework.TestCase;

public class DiceValueConditionEvaluatorTest  extends TestCase {

        DiceValueConditionEvaluator dvce = new DiceValueConditionEvaluator();


    public void testIdentical_Success() {
        int [] values = {1,1,1};
        boolean actual = dvce.checkIdentical(values);

        assertTrue(actual);
    }
    public void testIdentical_Failure() {
        int [] values = {1,1,2};
        boolean actual = dvce.checkIdentical(values);
        assertFalse(actual);
    }

    public void testEvaluateSingles_IsOne() {
        int [] values = {1};
        DiceValueCase actual = dvce.evaluateSingles(values);
        assertEquals(DiceValueCase.SingleOne, actual);
    }
    public void testEvaluateSingles_IsNotOneOrFive() {
        int [] values = {2};
        DiceValueCase actual = dvce.evaluateSingles(values);
        assertEquals(DiceValueCase.Others, actual);
    }
    public void testEvaluateSingles_IsFive() {
        int [] values = {5};
        DiceValueCase actual = dvce.evaluateSingles(values);
        assertEquals(DiceValueCase.Single5, actual);
    }
    public void testEvaluateAllOfAKind_TwoOfAKind() {
        int [] values = {1,1};
        DiceValueCase actual = dvce.evaluateAllOfAKind(values);
        assertEquals(DiceValueCase.Others, actual);
    }

    public void testEvaluateAllOfAKind_ThreeOfAKind() {
        int [] values = {1,1,1};
        DiceValueCase actual = dvce.evaluateAllOfAKind(values);
        assertEquals(DiceValueCase.Triples, actual);
    }
    public void testEvaluateAllOfAKind_FourOfAKind() {
        int [] values = {1,1,1,1};
        DiceValueCase actual = dvce.evaluateAllOfAKind(values);
        assertEquals(DiceValueCase.FourOfAKind, actual);
    }
    public void testEvaluateAllOfAKind_FiveOfAKind() {
        int [] values = {1,1,1,1,1};
        DiceValueCase actual = dvce.evaluateAllOfAKind(values);
        assertEquals(DiceValueCase.FiveOfAKind, actual);
    }
    public void testEvaluateAllOfAKind_SixOfAKind() {
        int [] values = {1,1,1,1,1,1};
        DiceValueCase actual = dvce.evaluateAllOfAKind(values);
        assertEquals(DiceValueCase.SixOfAKind, actual);
    }
    // tests for evaluateThreePairs
    public void testEvaluateThreePairs_Success() {
        int [] values = {1,1,2,2,3,3};
        DiceValueCase actual = dvce.evaluateThreePairs(values);
        assertEquals(DiceValueCase.ThreePairs, actual);
    }
    public void testEvaluateThreePairs_Failure() {
        int [] values = {1,1,2,2,3,4};
        DiceValueCase actual = dvce.evaluateThreePairs(values);
        assertEquals(DiceValueCase.Others, actual);
    }
    // tests for evaluateSixes
    public void testEvaluateSixes_SequentialSuccess() {
        int [] values = {1,2,3,4,5,6};
        DiceValueCase actual = dvce.evaluateSixes(values);
        assertEquals(DiceValueCase.StraightSix, actual);
    }
    public void testEvaluateSixes_NotSequentialSuccess() {
        int [] values = {6,5,4,3,2,1};
        DiceValueCase actual = dvce.evaluateSixes(values);
        assertEquals(DiceValueCase.StraightSix, actual);
    }
    public void testEvaluateSixes_Failure() {
        int [] values = {1,2,3,4,5,5};
        DiceValueCase actual = dvce.evaluateSixes(values);
        assertEquals(DiceValueCase.Others, actual);
    }


}


