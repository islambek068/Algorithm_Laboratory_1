public class Problem1 {
    public float findminimum(float[] a,float n){
        float min = a[0];
        for(int i=0;i<n;i++){
            if (min>a[i]){
                min=a[i];
            }
        }
        return min;
    }
}
