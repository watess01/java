package prep.modules.dice;

import junit.framework.TestCase;

public class DiceScoreTest  extends TestCase {

    private IDiceValueEvaluator dve = new DiceValueEvaluator(new DiceValueConditionEvaluator());
    private IDiceScoreCalculate dsc = new DiceScoreCalculate();

    private IDiceScore dc = new DiceScore(dve, dsc);

    public void testSingleOne() {
        int [] values = {1};
        int actual = dc.score(values);
        assertEquals(100, actual);
    }
    public void testSingle5() {
        int [] values = {5};
        int actual = dc.score(values);
        assertEquals(50, actual);
    }
    public void testTripleOnes() {
        int [] values = {1,1,1};
        int actual = dc.score(values);
        assertEquals(1000, actual);
    }
    public void testTripleTwos() {
        int [] values = {2,2,2};
        int actual = dc.score(values);
        assertEquals(200, actual);
    }
    public void testTripleThrees() {
        int [] values = {3,3,3};
        int actual = dc.score(values);
        assertEquals(300, actual);
    }
    public void testTripleFours() {
        int [] values = {4,4,4};
        int actual = dc.score(values);
        assertEquals(400, actual);
    }
    public void testTripleFives() {
        int [] values = {5,5,5};
        int actual = dc.score(values);
        assertEquals(500, actual);
    }
    public void testTripleSixes() {
        int [] values = {6,6,6};
        int actual = dc.score(values);
        assertEquals(600, actual);
    }
    public void testFourOfAKind() {
        int [] values = {1,1,1,1};
        int actual = dc.score(values);
        assertEquals(2000, actual);
    
    }
    public void testFiveOfAKind() {
        int [] values = {1,1,1,1,1};
        int actual = dc.score(values);
        assertEquals(4000, actual);
    }
    
    public void testSixOfAKind() {
        int [] values = {1,1,1,1,1,1};
        int actual = dc.score(values);
        assertEquals(8000, actual);
    }
    public void testThreePairs() {
        int [] values = {1,1,2,2,3,3};
        int actual = dc.score(values);
        assertEquals(800, actual);
    }
    public void testStraightSix() {
        int [] values = {1,2,3,4,5,6};
        int actual = dc.score(values);
        assertEquals(1200, actual);
    }
    public void testOthers() {
        int [] values = {1,2,3,4,5,5};
        int expected = 10+20+30+40+50+50;
        int actual = dc.score(values);
        assertEquals(expected, actual);
    }

}


