public class NorGate {

    public int ReturnNorGate(int a, int b){
        int result;
        if (a != b){
            result = 0;
        } else if (a == 0 && b == 0){
            result = 1;
        } else{
            result = 0;
        }
        System.out.println("NOT " + a + " + " +  b + " = ");
        return result;
    }
}
