public static void main(String[] args) {
    String text = "Егор Алла Анна";
    Pattern pattern = Pattern.compile("А.+?а");

    Matcher matcher = pattern.matcher(text);
    while (matcher.find()) {
        int start=matcher.start();
        int end=matcher.end();
        System.out.println("Найдено совпадение " + text.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
    }
    System.out.println(matcher.replaceFirst("Ира"));
    System.out.println(matcher.replaceAll("Ольга"));
    System.out.println(text);
}
