public class Gameplay {
    /*
        Analyze the players and find the imposters
        Crewmates win if all imposters are frozen
        Imposters win if they hold a majority of the unfrozen players (greater than or equal to half)
        ** Use knowledge of abstract classes and interfaces **
        Solution Description
     */
    public static void main(String[] args) {
        //Todo: Create 2 interfaces, 1 abstract classes and 2 concrete subclasses
        //You should be able to put @Override on the line before the method header for any methods you override
        BlueAstronaut bob = new BlueAstronaut("Bob", 20, 6, 30);
        BlueAstronaut health = new BlueAstronaut("Health", 30, 3, 21);
        BlueAstronaut albert = new BlueAstronaut("Albert", 44, 2, 0 );
        BlueAstronaut angel = new BlueAstronaut("Angel", 0, 1, 0);
        RedAstronaut liam = new RedAstronaut("Liam", 19);
        RedAstronaut suspiciousPerson = new RedAstronaut("Suspicious Person", 100, "experienced");
        RedAstronaut scott = new RedAstronaut("scott", 20, "experienced");
        RedAstronaut kayla = new RedAstronaut("scott", 20, "experienced");

        liam.sabotage(bob);
        System.out.println(bob.toString());
        liam.sabotage(suspiciousPerson);
        System.out.println(suspiciousPerson.toString());
        liam.freeze(albert);
        System.out.println(liam.toString());
        System.out.println(albert.toString());
        albert.emergencyMeeting();
        System.out.println(suspiciousPerson.toString());
        suspiciousPerson.emergencyMeeting();
        System.out.println(suspiciousPerson.toString());
        bob.emergencyMeeting();
        System.out.println(suspiciousPerson.toString());
        health.completeTask();
        health.completeTask();
        health.completeTask();
        liam.freeze(angel);
        System.out.println(liam.toString());
        System.out.println(angel.toString());
        //Todo:Have RedAstronaut Liam sabotage Bob twice:
        //Bob should have: susLevel = 46 (30 -> 37 -> 46)
        liam.sabotage(bob);
        liam.sabotage(bob);
        System.out.println(bob.toString());
        liam.freeze(bob);
        System.out.println(bob.toString());
//        angel.emergencyMeeting();
//        System.out.println(liam.toString());
        liam.sabotage(health);
        liam.sabotage(health);
        liam.sabotage(health);
        liam.sabotage(health);
        liam.sabotage(health);
        System.out.println(health.toString());
        liam.freeze(health);
        System.out.println(liam.testInst(health));
        System.out.println(scott.equals(kayla));



        //Todo: Error1
        //Running: test_compareTo_method_susLevel_less
        //Failed: Incorrect implementation for current player's
        //susLevel < other players' susLevel

        //Todo: Error2
        //Running: test_compareTo_method_susLevel_greater
        //Failed: Incorrect implementation for current player's
        //susLevel > other players' susLevel

        //Todo: Error3
        //Failed: We expected: MY NAME IS TESTNAME, AND I HAVE A
        //SUSLEVEL OF 999. I AM CURRENTLY NOT FROZEN. I AM AN EXPERIENC
        //ED PLAYER!
        //Your output: MY NAME IS TESTNAME, AND I HAVE A SUSLEVEL OF
        //999. I AM CURRENTLY NOT FROZEN.

        //Todo: Error4
        //Finished: test_freeze_method_return_type
        //Running: test_successful_freeze
        //Failed: The player is an imposter, the method should e
        //nd immediately. expected:<20> but was:<40>

        //Todo: Error5
        //Running: test_Equals_equals_implementation
        //        Failed: Incorrect implementation for a RedAstronaut ob
        //ject that does not have the same skill.

        //Todo: Error6
        //Running: test_toString_method_output_frozen_all_caps
        //        Failed: We expected: MY NAME IS TESTNAME, AND I HAVE A
        // SUSLEVEL OF 999. I AM CURRENTLY FROZEN. I AM AN EXPERIENCED P
        //LAYER!
        //    Your output: MY NAME IS TESTNAME, AND I HAVE A SUSLEVEL OF
        // 999. I AM CURRENTLY FROZEN.

        //Todo: Error7
        //Running: test_toString_method_output_not_frozen
        //        Failed: We expected: My name is testName, and I have a
        // susLevel of 12. I am currently not frozen. I am an experience
        //d player!
        //    Your output: My name is testName, and I have a susLevel of
        // 12. I am currently not frozen.

        //Todo: Error8
        //Running: test_toString_method_output_frozen
        //Failed: We expected: My name is testName, and I have a
        //susLevel of 12. I am currently frozen. I am an experienced pl
        //ayer!
        //Your output: My name is testName, and I have a susLevel of
        // 12. I am currently frozen.

        //Todo: Error9
        //Running: test_toString_method_signature
        //Failed: Method toString with parameters [] does not ex
        //ist in BlueAstronaut

        //Todo: Error10
        //Running: completeTask_test_less_than_zero
        //        Failed: did not set numTask to 0 if it is < 0 expected
        //:<3> but was:<-1>







    }
}
