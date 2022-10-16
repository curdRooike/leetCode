package week1;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 重新排列单词间的空格
 * @date 2022/9/7 16:23:08
 */
public class Test1 {
    public static void main(String[] args) {
        String text = "  walks  udp package   into  bar a" ;
        System.out.println(new Test1().reorderSpaces(text)+"1");
    }
    public String reorderSpaces(String text) {
        int length = text.length();
        String[] words = text.trim().split("\\s+");
        int cntSpace = length;
        for (String word : words) {
            cntSpace -= word.length();
        }
        StringBuilder sb = new StringBuilder();
        if (words.length == 1) {
            sb.append(words[0]);
            for (int i = 0; i < cntSpace; i++) {
                sb.append(' ');
            }
            return sb.toString();
        }
        int perSpace = cntSpace / (words.length - 1);
        int restSpace = cntSpace % (words.length - 1);
        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                for (int j = 0; j < perSpace; j++) {
                    sb.append(' ');
                }
            }
            sb.append(words[i]);
        }
        for (int i = 0; i < restSpace; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }
//    public String reorderSpaces(String text) {
//        StringBuilder stringBuilder = new StringBuilder();
//        String[] s = text.split("\\s+");
//        int empty = 0;
//        List<String> collect = Arrays.stream(s).filter(item -> !item.equals("")).collect(Collectors.toList());
//        int word  = collect.size();
//        char[] chars = text.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == ' ') {
//                empty++;
//            }
//        }
//        int flag = 0;
//        final int test =word > 1 ? empty % (word - 1) : empty;
//        final int emptyCount = word > 1 ? empty / (word - 1) : empty / word;
//        for (int i = 0; i < collect.size(); i++) {
//            if (!collect.get(i).isEmpty()) {
//                stringBuilder.append(collect.get(i));
//                if (++flag <= word - 1){
//                    for (int j = 0; j < emptyCount; j++) {
//                        stringBuilder.append(" ");
//                    }
//                }
//            }
//        }
//        if (test != 0){
//            for (int i = 0; i < test; i++) {
//                stringBuilder.append(" ");
//            }
//        }
//        return stringBuilder.toString();
//    }
}
