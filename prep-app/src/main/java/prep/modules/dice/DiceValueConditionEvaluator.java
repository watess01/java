package prep.modules.dice;

import java.util.Arrays;

public class DiceValueConditionEvaluator implements IDiceValueConditionEvaluator{

    public boolean checkIdentical(int[] values){
        return Arrays.stream(values).allMatch(val -> val == values[0]);
    }

    public DiceValueCase evaluateSingles(int[] values){
        // 
        if(values.length!=1){
            throw new IllegalArgumentException("Single value expected");
        }
        if(values[0]==1) {
            return DiceValueCase.SingleOne;
        } else if(values[0]==5) {
            return DiceValueCase.Single5;
        }
        return DiceValueCase.Others;
    }

    public DiceValueCase evaluateAllOfAKind(int[] values){
        switch (values.length) {
            case 3:
                return DiceValueCase.Triples;
            case 4:
                return DiceValueCase.FourOfAKind;
            case 5:
                return DiceValueCase.FiveOfAKind;
            case 6:
                return DiceValueCase.SixOfAKind;
            default:
                break;
        }
        return DiceValueCase.Others;
    }

    public DiceValueCase evaluateThreePairs(int[] values){
        // sort incoming array into ascending order
        Arrays.sort(values);
        // check every 2 items are equal
        for(int i=0; i<6; i+=2){
            if(values[i]!=values[i+1]){
                return DiceValueCase.Others;
            }
        }
        return DiceValueCase.ThreePairs;
    }
    public DiceValueCase evaluateSixes(int[] values){
        // sort incoming array into ascending order
        Arrays.sort(values);
        
        if(Arrays.equals(values, new int[]{1,2,3,4,5,6})){
            return DiceValueCase.StraightSix;
        } 
        return evaluateThreePairs(values);
    }

}
