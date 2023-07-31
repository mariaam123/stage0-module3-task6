package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        
        int result = Math.round(numberToBeRounded);

        System.out.println(result);
    }


    public static void main(String[] args) {
        FloatTypeCasting floatTypeCasting = new FloatTypeCasting();
        float numberToBeRounded = 19.4f;
        floatTypeCasting.roundNumber(numberToBeRounded);
    }
}
