public class Problem2 {
    public float findaverage (float[] a, float n){
    float answer = 0;
    for(int i =0 ; i <n ; i++){
        answer = answer + a[i];
    }
    return answer/n;
    }

}
