package prep.modules.dice;

import java.util.Arrays;

/*
 * Write a class with a score() method that accepts an array of dice values (up to 6). Scoring rules are as follows:
•	A single one (100)
•	A single five (50)
•	Triple ones [1,1,1] (1000)
•	Triple twos [2,2,2] (200)
•	Triple threes [3,3,3] (300)
•	Triple fours [4,4,4] (400)
•	Triple fives [5,5,5] (500)
•	Triple sixes [6,6,6] (600)


Note that the scorer should work for any number of dice up to 6.
•	Four-of-a-kind (Multiply Triple Score by 2)
•	Five-of-a-kind (Multiply Triple Score by 4)
•	Six-of-a-kind (Multiply Triple Score by 8)
•	Three Pairs [2,2,3,3,4,4] (800)
•	Straight [1,2,3,4,5,6] (1200)
 
 The class DiceCaseEvaluator is a helper class that evaluates the case of the dice values. 
 It has a method evaluateCase() that accepts an array of dice values and returns the 
 case of the dice values. 
 * 
 */


public class DiceValueEvaluator implements IDiceValueEvaluator{
    private IDiceValueConditionEvaluator _dve;
    // constructor
    public DiceValueEvaluator(IDiceValueConditionEvaluator dve) {
        _dve = dve;
    }





    public DiceValueCase evaluateCase(int[] values){
        int len = values.length;
        switch (len) {
            case 1:
                return _dve.evaluateSingles(values);
            case 3:
            case 4:
            case 5:
            case 6:
                if(_dve.checkIdentical(values)){
                    return _dve.evaluateAllOfAKind(values);
                }
                else {
                    if(len == 6) {
                        return _dve.evaluateSixes(values);
                    }
                }
                
            default:
                break;
        }
        return DiceValueCase.Others;
    }

}
