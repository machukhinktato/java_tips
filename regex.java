import java.util.regex.*;

public class java_tips {
    public static void main(String[] args) {
        String text = "Егор Алла Александр";
        Pattern pattern = Pattern.compile("А.+а");
//        Pattern pattern = Pattern.compile("А.++а"); Ничего не найдет
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
