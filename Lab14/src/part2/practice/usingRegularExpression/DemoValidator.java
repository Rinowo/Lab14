package part2.practice.usingRegularExpression;

public class DemoValidator {
    public static void main(String[] args) {
        Validator simpleEmail = new Validator("\\w+@\\w+(\\.\\w+)+");
      //  simpleEmail.setPattern("\\w+@\\w+(\\.\\w+)+");

        System.out.println(simpleEmail.Validator("abc@cde.com"));
        System.out.println(simpleEmail.Validator("abccde.com"));
    }
}
