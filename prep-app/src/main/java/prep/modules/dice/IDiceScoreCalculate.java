package prep.modules.dice;

public interface IDiceScoreCalculate {
    
        int getSingleOne();
        int getSingle5();
        int getTriple(int value);
        int getFourOfAKind(int value);
        int getFiveOfAKind(int value);
        int getSixOfAKind(int value);
        int getThreePairs();
        int getStraightSix();
        int getOthers(int [] values);
}
