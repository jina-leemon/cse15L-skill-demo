// Includes jUnit code that tests function
import static org.junit.Assert.*;
import org.junit.*;

// To run this command: 
//  javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar SkillDemoTest_1.java
//  java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore SkillDemoTest_1.java

public class SkillDemoTest_1{
    @Test
    public void average(){
        int[] array = {10, 12, 14, 12};
        assertEquals(12, SkillDemo_1.average(array)); // test that passes
    }
}
