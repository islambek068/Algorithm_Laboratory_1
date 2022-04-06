public class Problem6 {
    //I think that you ask about not using a math
    public int findPower(int a, int n){
        int answer= 1;
        for(int i=0;i<n;i++){
            answer = answer * a;
        }
        return answer;
    }
}
