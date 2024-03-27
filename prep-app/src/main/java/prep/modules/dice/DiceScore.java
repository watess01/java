package prep.modules.dice;

public class DiceScore implements IDiceScore{

    private IDiceValueEvaluator _dve;
    private IDiceScoreCalculate _dsc;
    public DiceScore(IDiceValueEvaluator dve, IDiceScoreCalculate dsc) {
        _dve = dve;
        _dsc = dsc;
    }
    
    public int score(int[] values) {
        DiceValueCase valueCase = _dve.evaluateCase(values);

        switch (valueCase) {
            case SingleOne:
                return _dsc.getSingleOne();
            case Single5:
                return _dsc.getSingle5();
            case Triples:
                return _dsc.getTriple(values[0]);
            case FourOfAKind:
                return _dsc.getFourOfAKind(values[0]);
            case FiveOfAKind:
                return _dsc.getFiveOfAKind(values[0]);
            case SixOfAKind:
                return _dsc.getSixOfAKind(values[0]);
            case ThreePairs:
                return _dsc.getThreePairs();
            case StraightSix:
                return _dsc.getStraightSix();
             default:
                return _dsc.getOthers(values);
        }

    }
}
