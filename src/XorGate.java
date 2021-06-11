public class XorGate {
    public int ReturnXorGate(int a, int b){
        int result;
        if (a != b){
            result = 1;
        }else{
            result = 0;
        }
        System.out.println(a + " + " + b + "(OR NOT 1 + 1) = ");
        return result;
    }
}
