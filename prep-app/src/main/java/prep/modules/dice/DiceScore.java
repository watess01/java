package prep.modules;

public class DiceScore {

    public enum ValueCase {
        SingleOne,
        Single5,
        Triple,
        FourOfAKind,
        FiveOfAKind,
        SixOfAKind,
        ThreePairs,
        StraightSix,
        Others

    }

    public ValueCase getCase(int[] values){
        int len = values.length;
        if(len==1){
            if(values[0]==1) {
                return ValueCase.SingleOne;
            } else if(values[0]==5) {
                return ValueCase.Single5;
            }
        } else
        {
            if (len == 3 && values[0]==values[1] && values[0]==values[2]){
                    return ValueCase.Triple;
            }
        }
        return ValueCase.Others;
    }

    private int getValueScore(int value) {
//        switch(value) {
//            case 1:
//                return 100;
//            default:
//                return value *10;
//        }
        return -1;
    }

    private int handleTriples(int[] values){
        return -1;

    }

    private int handleAllSame(int[] values) {
        return -1;
    }
    private int handle(int[] values) {
        return -1;

    }
    private int handlePairs(int[] values) {
        return -1;

    }






    private int handleMultiples(int[] values, int multiplier){

        // handle all of same kind

        // handle 3 pairs for 6 items

        // handle straight for 6 items

        return 0;
    }





    public int score(int[] values) {
        int ret = 0 ;

        // define different rules for number of calues
        int size = values.length;
        switch(size) {
            case 1:
                // handle 1 value
                break;
            case 3:
                // 3 case
                break;
            case 4:
            case 5:
            case 6:


        }



        for(int i=0;i< values.length; i++) {
            ret += getValueScore(values[i]);
        }



        return ret;
    }
}
