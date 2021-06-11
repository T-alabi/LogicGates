public class NandGate extends AndGate {

    public int ReturnNandGate(int a, int b){
        int resultAND = ReturnAndGate(a, b);
        int result;
        if (resultAND == 0){
            result = 1;
        } else{
            result = 0;
        }
        System.out.print("NOT " + a + " x " +  b + " = ");
        return result;
    }
}
