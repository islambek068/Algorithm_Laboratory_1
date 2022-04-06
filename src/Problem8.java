public class Problem8 {
    public void onlyNumberChecker(String s){
        if(s.matches("[0-9]+")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
