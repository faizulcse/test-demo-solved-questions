public class UserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }

    public static class TextInput {
        static StringBuilder sb = new StringBuilder();

        public void add(char c) {
            sb.append(c);
        }

        public String getValue() {
            return sb.toString();
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c) {
            if (c >= '0' && c <= '9')
                new TextInput().add(c);
        }
    }
}