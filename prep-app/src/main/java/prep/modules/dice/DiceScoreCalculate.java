package prep.modules.dice;

public class DiceScoreCalculate implements IDiceScoreCalculate {

    public int getSingleOne() {
        return 100;
    }
    public int getSingle5() {
        return 50;
    }
    public int getTriple(int value) {
        if(value==1) {
            return 1000;
        } else {
            return value * 100;
        }
    }
    public int getFourOfAKind(int value) {
        return getTriple(value) * 2;
    }   
    public int getFiveOfAKind(int value) {
        return getTriple(value) * 4;
    }
    public int getSixOfAKind(int value) {
        return getTriple(value) * 8;
    }
    public int getThreePairs() {
        return 800;
    }
    public int getStraightSix() {
        return 1200;
    }
    public int getOthers(int [] values) {
        int ret = 0;
        for (int value : values) {
            ret += value * 10;
        }
        return ret;
    }
}
