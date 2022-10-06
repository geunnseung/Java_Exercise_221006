package java_list_exercise3_221006;

public class AlphabetGenerator implements Generator<Character> {
    @Override

    public Character generate(int num) {
        int randomNum = (int)(Math.random() *26);
        char alphabet = (char)(randomNum +65);

        return alphabet;
    }
}
