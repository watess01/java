package prep.modules.dice;

public interface IDiceValueConditionEvaluator {
    DiceValueCase evaluateSingles(int[] values);
    DiceValueCase evaluateAllOfAKind(int[] values);
    DiceValueCase evaluateThreePairs(int[] values);
    DiceValueCase evaluateSixes(int[] values);
        boolean checkIdentical(int[] values);

}
