public class Q13
{
    public static void main(String[] args) {
        int a=1,b=100;
        for(int i=a;i<=b;i++){
            if(checkPrime(i)){
                System.out.print(i+" " );
            }
        }
    }
    public static boolean checkPrime(int num){
        if(num<2){
            return false;
        }
        else{
            for(int i=2;i<num-1;i++){
                if(num%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}