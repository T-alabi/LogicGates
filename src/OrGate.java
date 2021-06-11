public class OrGate {

    public int ReturnOrGate(int a, int b){
        int result;
        if (a != b){
            result = 1;
        } else {
            result = 0;
        }
        System.out.println(a + " + " + b);
        return result;
    }
}
