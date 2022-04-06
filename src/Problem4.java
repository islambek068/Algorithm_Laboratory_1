public class Problem4 {
    public int findFactorial(int n) {
        int answer=1;
        for(int i=1;i<=n;i++){
            answer=answer * i;
        }
        return answer;
    }
}
