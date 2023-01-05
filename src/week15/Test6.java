package week15;

import util.SoutUtil;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode
 * @description 1160. 拼写单词
 * @date 2023/1/4 17:00:44
 */
public class Test6 {
    public static void main(String[] args) {
        String[] strings = {"qobxtxjzdngkrzamsxzdvbvkiwijokwdyndqllhqpaoxzwonriclsm","fahtqqnuzhhhrcblquaosdfdcqoskxcsdnhtwvvvzsxkpjprytieieniafnltxmuzwkdnttofpibi","xedhntgrqegfs","wrssfvsbcehbahbvojnzgacbgveitirkjmmyiorwykynqddgydzgfvlvplfnyumgxturxraonpchd","hpmdzhpgijirecxzkuyhptiytnuscu","xljgysrjjukphjgzbpn","gmwbirxt","yhvpsvsnhfmbmcpihnqtodspbvexnpgcqrrughbakbufyjispkquvfppkaffypdpnvikjygdaarcigipfhuvzzzbgw","gvvbgpjolobpbxcnhnzuqrsqgrkanwmnnkqynakkooailoafunopsrlijqhaqmszssxikftcfoqsw","naktgxfyuvuoh","muui","ghzqskipqprrzeligdjyowypeerogxonvztsq","onosezgutawtzteoagbftclsqpfsxtwetourxjxurdqevrir","fcskqxwkzsldsjihahalnw","lsstgzxjxabcbspjwelqmhtnurgfmdtpaihxnxad","nwrwtwetgjwooevhxhkzlvsyghtkldioyjhkkniepktqs","utohzbqvkqkq","vdoqnhtidgicevprrrwlbtldtaxpsxdhxhgbwlkbeglkbhrujtafswjkozdmdpvwhsuskofmxxtprtpopacslinwozth","zqlzxpemomnbzxlorvlkxt","kubshvnldnkofitnnjere","czxmqpowzzhdbhgtlqdokrzxowsvwyavfhcycctgdvrsfzmanrlktfaetnuayrqkvhcbxezfahkrxgaaztovrxuhnll","rrcesnfbxglhjawldnnuiiepdsofbrsbjczlemusqwvenicxmtdmpwfrnizymfmqynvtkbrmablcugroshc","thholqebekkysstqzlbbdapktxumygplqganucwnahmrihiraxdnvbiaqhykcti","fagqnapzeeglbdzsbneosxmptmwopjcxztukhpjkqjmjbkpbzrfaqskctehyboeddmilkwlurcb","wtjdykncubkduhxiwwusoxvzpnaxpnzdjmwddnonsmmvwmuaxghetgrwpoeqbprxgviwzagyqopfdakrqjgiy","nsftehpgzstetbganbtozdopptseucdqkhzdmujnzjdvufqtikgeepttnrabb","ozihktgnvljzhqwanxemtzxphzqvmoblvi","iwdsrekqllbbyarzzmbqbvldvxctdeswiyahiwfoefhfsfwktdzaulnalewbusazjhcbtxjuck","dylhds","idnaddnzbodhjrpshhahnbbnrskruxszxeeyanumazvahktizectmmvjbhnhbrohsyqhrgq","scyzsykrwzuozmbrbenfiqpxchtpmcxepjiglaeionsmbwrzeidupayusczcooudpcgkgspbuyzcdfymsejucb","otpcfrhckxmnseayhwoyjjfkceaoznmmkikpdsuueyqmbsuelmhqnmdsjs","xoghnhpypfiibqrpgtyux","cxhpbcziptgandiwxtctdjpboiqwv","gyjosuhwgbqpcdsdqadopdqozjxpzwxbqaffnxaddhgrxmunpidvpnijxnbawshcznkmprpgkhvzxmzbaftedgtfgjhaisdnva","jlnxshfthqgzlnvjzztrnjswwsotpybxecyqhnfkbfwvmxpcs","mtddspmqwbnoiajpexsuhxogarduzsoammqqelh","sixkvxgnbalipwmkbcwpugpvolsvvlmaaeeobmoeogspbkbsskwjdqkite","xhsutriuynfrldjbhexhxjgcfwcujvwsqfiaqwvjnkjkswdpaynelhryrzfeqjhajezmolk","zfiredtxenzgtrkiamuoubetexzbnwkdtxbtihhtsfubnmryxq","sot","szgkkhuhkcnr","firxkgvkzqlnallzwjispsizoawobemuhqrhpyvknasjzwctamfuonder","vyei","fidqszoicndwifns","xkickycwzj","gmybflbjunudxrwguzditaxmyadgdjeengut","gvlwwnmrddhzwewugdtobauecealfhasyftgxkiqeluysxxmroukfziifpryvddggttojhcszeyjetbsldmorqnbuqreuxfw","vbhuerxkcjlkamgruturkbrubbscmvzqruwvlrlyylcvuiothkhpznjzsfnyfoaqkziyjqzdreeygmtbdljwnaojexfgmjlup","bxjvop","aswdmctosieicucsjwxych","lxbtlhnrfyaznrqgxrltmxkjmhdqjjgnvstxaygmuxznjfiiukm","npncdabkmbgfhnedcmbfyjiplzwymgvsfrifvvjayobsygwolqbwkblqutakcshnlsqadtfiqmpauslvqd","kuyemuuymacyvmahtagmcewkspverpjtjscccnrczchgkjzppdxcalxxcxrwnepk","jxwouobfvzttz","yucpsdhqvzboeezcqpxsepuuk","iwbdmxdcbypnzqmgkrjhfivkrmnv","lpqklgcwdvgbghfyoyejnpexrelywqfdtczflwetbxvzigtvisi","dlasodatffcreungntdmezgfqklrabyymsnhdberufcrgpxgsziklznhdprbczhbxgtuslufycjronozdqumzlnidkvaydg","oejzlmrrbdysqlezifcvgjnmvodfvmrnjmnfkejdbnnyljzjaxfecrfefdgarqbtwoijuktacywmsubtxtgzkbnstgrsrjpkdfe","mlegvhxielwlfadlnqvnipcuizpdxgtvro","vwgmwkbturocovaykdsjaftbtgmtwknnmhexfgcfchpwwgcgecfobbencotjizxbtdrijwfjxdsxanwfjyjamrxrdaiusgr","xjmkcsekcorldyrjiavrhuhqtndujymc","rmxwcaorznumwxgwnibnxwzvnxjhzwqzgmkgifnnnnzpgtsvprycjtdeirtpqbduursabbidzkfbexgthkoacagkb","tkrsxhztwgvqxamjtexklnooaloydjhejlbasavskttwxiabarogvmfdfjttaxhgqljlbfnrvrwwbxkurhufiknoxfmemcv","cojlyayladyrhofzetaddteqrjbyxtvyszgdorexqmgznqmuvemegbwki","zktqnurtpttlcjgkmnprqeyeepqunfqqvjwuevwbvnaupyofwiqwhpyumyfwpjrruhleromrmpvczlkxqiuq","gyxl","qmhwlymfsjixvvjhkczylqcsnbjxliasetxciggtfl","gizysqkqbyhzeagzsscvdigtcfiupyhqovaaioxfrphugxzrcjvwqwc","hpgkulrmbaixnjiapmjiwhwsgromfqpxqkkiscjwpiicslwcijginxfiwqakeezeohhskxgvgdkezmqys","vibswdyqaxjvqsffwmcismooheyhwzqvyzezluejztlgddshvwcryzcllaisxrygwqyyoiaivfvgtzicycyrkckv","oyclwdejlifmocfjsbgmernsyitkfaahjxfnwnusrdypsziawlpsjgnavytdihpxcmugshnqbkyfts","xwcbiporfbktpvqhznjuaxfcdykifuzwdsdhxirwwxinoffywgxscrtuwhvuwjejzqirsfijgguouapqpmfdnpsfm","qffrjfkj","rpynimubaxdgbrkdawgugnhobaowxdnzkiidworcsnejgqctftyksvbhiwkcnyffmsbxwptqn","oeqdvldvfbklukstxwomapaauaozblhxudkdxihepqagndnlkvbqhluscvczhrsrhodnftoszhjdymuywdtjgzbmkrdf","xviupppkeswkctwlqwyuhokbhqqjshmaeiouhununbhrkabacenkg","habomjnlznqvckmowgelhnglfizogckplbymkdowfpicxydzgoskckraxpdysksvzezcpg","zemawxwjeowraaqsqytsshtavnvoyiyollelxqabmjwhxtrdijiacbbjiiyzwkxboot","jcnpsxnkbqdbh","bftrbaurtzkftodotjguzjmwxrrmswxwclohotuanypmhtemmsaicwckowmcdmpnhcfzptekpgljfvwpqjgilxu","bbaigjqxdmuchkkb","effbptpwafzqbsebbjmvdcxdbmnlfqjklongafzkvaqmkehefedjxgxlbdhltihtgfqjjsdis","lhuxgqpwcgpujfvvnlrxhgbiwxmxzhglyhkdkafafojtlkuxkmjwlxrd","ussuyjqsxwsdhkjeipwycrkcxxjatoqhygzymgikqdnqiyyzlbcdlgtmneyickucbkpkza","ykmsksjorovmdymlbgprvprnyxwppvwgmzfjsqouvgara","wduqkbncayo","qdfkyomjlhfozonwpdxllqdnvpohyijqmyymuclnydzmlqksntdfj","ynzekkkljzrvnwclzcfgtvcmstxgadxpztofckypbgqgbnumnkeaqclaspzxjbygtkjznxeduhbksr","aw","jbremnahqoiqktpbkteefdkbrerrxmhqbbselpnfzapgmxidrhbixetaetjcroufa","wtufuqgljvxzsurhviikdxyuythezjnvwrxqrykmotkhlphlyfljjsfugzwxxfqkc","ytjuaagqnfxqwiopolnejmoxow","oqoskpzkwxsffgeuuhdklidtmjobzayatyaqefgwgqbo","qkhtpuhhkspffkpryvdjasbxhtfrmptpljszvtgvhfvqpxypxfdaphfqdmigzgfg","goddugelwdvemxwureitzwqmbqeqtymrlrzahuxnpgufaagbpexwpoahvdnsyvgxw","dfhxrctagxkuasofoejsalcerkbtsjwnbnoahsumzfyiiskhzzwyykeefszrzrbztbrzhxxgaajb","tjsardsbhmhefysdqtbhzsxukbwdpioqaohloaancxdkkmofniojrvxj","jzjozqfqiwyfadplibubtpcfxxfvjtbizxlmpaccjpihvnrtvfqtfiaztvfbednyemfmahbljdvykddawaujdksenm"};
        String chars = "fcxpzkzkqeyeijquyfixvlzjpzomujrqzxeoynjiflnmdrpdkrm";
        System.out.println(new Test6().countCharacters(strings, chars));
    }
    public int countCharacters(String[] words, String chars) {
        int []hash = new int[26];
        for (char c : chars.toCharArray()) {
            hash[c - 'a']++;
        }
        int res = 0;
        for (String word : words) {
            boolean flag = true;
            int[] hash1 = new int[26];
            for (char c : word.toCharArray()) {
                hash1[c - 'a']++;
                if (hash1[c - 'a'] >  hash[c - 'a']) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                res += word.length();
        }

        return res;
    }
}
