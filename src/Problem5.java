public class Problem5 {
    public int findFibanacci(int n){
        int[] arrayFib= new int[n+1];
        arrayFib[0]=0;
        arrayFib[1]=1;
        int answer = 0;
        for(int i = 2; i<n+1;i++){
            arrayFib[i]=arrayFib[i-1]+arrayFib[i-2];
            answer=arrayFib[i];
        }
        return answer;
    }


}
