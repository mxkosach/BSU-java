import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
/*11.	В каждом предложении текста исключить подстроку максимальной длины, начинающуюся и заканчивающуюся заданными символами */
    public static void main(String[] args) {
        String text = "а+б а++б +а+++б+ ++а++++б++";

        // паттерн означает строку, которая содержит один или более непробельных символов "\\S+"
        // перед которыми подстрока "а" (франгмент (?<=а) — это так называемый positive lookbehind),
        // после которых подстрока "б" (франгмент (?=б) — это так называемый positive lookahead).
        String regexPattern = "(?<=а)\\S+(?=б)";

        // получаем объект для итерации по всем совпадениям
        Matcher matcher = Pattern.compile(regexPattern).matcher(text);

        // для хранения максимульной длины совпадения
        int maxLength = 0;
        // для хранения индексов самого длинного совпадения
        int startIndex = -1;
        int endIndex = -1;

        // итерируемся по всем совпадениям
        while (matcher.find()) {

            int length = matcher.end() - matcher.start();
            // если совпадение самое длинное, то сохраняем его индексы
            if (length > maxLength) {
                startIndex = matcher.start();
                endIndex = matcher.end();
            }
        }

        // если совпадение найдено (оно будет самым длинным), то вырезаем его
        if (startIndex > 0)
            text = text.substring(0, startIndex) + text.substring(endIndex);

        System.out.println(text);
    }
}
