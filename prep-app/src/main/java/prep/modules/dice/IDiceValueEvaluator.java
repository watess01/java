package prep.modules.dice;

public interface IDiceValueEvaluator {
    DiceValueCase evaluateCase(int[] values);
}
