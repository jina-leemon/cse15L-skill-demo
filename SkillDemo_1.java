//code that has a function

public class SkillDemo_1{
    public static int average(int[] n){
        int sum = 0;
        for(int i : n) {
            sum += i;
        }
        
        return sum/ n.length;
    }
}
