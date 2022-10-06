package java_list_exercise2_221006;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {

        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        for( int i=0; i<50 ; i++) {
            int r =randomNumberGenerator.generate(25);
            System.out.println(r);
        }
    }
}
