package Builder;

public class BuilderTest {

    public static void test(){

        NurtionFacts nurtionFacts = new NurtionFacts.Builder(1, 2).calories(3).fat(4).sodium(5).carbohydrate(6).build();
        System.out.println("toString: " + nurtionFacts);
    }


}
