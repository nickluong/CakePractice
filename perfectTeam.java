import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.CharacterAction;

public class PerfectTeam {

     public static void main(String[] args){
        String skills = "pcmpcmbbbzz";
        String skills2 = "pcmpp";
        System.out.println(getTeamCount(skills));
        System.out.println(getTeamCount(skills2));
    }

    public static int getTeamCount (String skills) {
        
        HashMap<Character, Integer> skillCount = new HashMap<Character, Integer>();
        int teamCount = 0;
        
        for(Character s : skills.toCharArray()) {
            if(skillCount.containsKey(s)){
                skillCount.put(s, skillCount.get(s) + 1);
            } else {
                skillCount.put(s, 1);
            }
        }

        if(skillCount.size() == 5){
             int minCount = Integer.MAX_VALUE;
            for (int i = 1; i < 5; i++){
                minCount = Math.min(minCount, skillCount.getOrDefault(skillCount.keySet().toArray()[i], 0));
            }
            teamCount = minCount;
        }

        return teamCount;
    }

//     public static void main(String[] args) {
// 	String s1 = "pcmbzpcmbz";
// 	String s2 = "mppzbmbpzcbmpbmczcz";
// 	String s3 = "pcmbz";
// 	String s4 = "pcmpp";
// 	String s5 = "pcmpcmbbbzz";
// 	System.out.println(solve(s1));
// 	System.out.println(solve(s2));
// 	System.out.println(solve(s3));
// 	System.out.println(solve(s4));
// 	System.out.println(solve(s5));
// }

// private static int solve(String s) {
// 	int res = Integer.MAX_VALUE;
// 	Map<Character, Integer> map = new HashMap<>();
// 	char[] chars = { 'p', 'c', 'm', 'b', 'z' };
// 	for (char c : s.toCharArray()) {
// 		map.put(c, map.getOrDefault(c, 0) + 1);
// 	}
// 	for (char c : chars) {
// 		res = Math.min(res, map.getOrDefault(c, 0));
// 	}
// 	return res;
// }
}