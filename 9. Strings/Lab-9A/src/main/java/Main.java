import java.util.*;

/*
* 10.	В тексте найти и напечатать п символов (и их количество), встречающихся наиболее часто.
* */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        sc.close();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            int k = 1;
            if (map.containsKey(c)) {
                k = map.get(c) + 1;
            }
            map.put(c, k);
        }

        Set<Map.Entry<Character, Integer>> setvalue = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> i = setvalue.iterator();
        Map.Entry<Character, Integer> max = null;
        while (i.hasNext()) {
            Map.Entry<Character, Integer> me = i.next();
            if (max == null) {
                max = me;
            } else if (me.getValue() > max.getValue()) {
                max = me;
            }
        }
        String string = "";
        for (int l = 0;  l< max.getValue(); l++) {
            string += max.getKey();
        }
        System.out.println("Cимвол в строке, встречающийся наибольшее число раз : ( n= "+ max.getValue()+") \'"+ max.getKey() + "\' - " + string);
    }

}
