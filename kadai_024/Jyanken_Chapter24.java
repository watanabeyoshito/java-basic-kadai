package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			String input = scanner.next();
			if("r".equals(input) || "s".equals(input) || "p".equals(input) ) {
				scanner.close();
				return input;
			} else {
				System.out.println("r,s,pのどれかを入力してください");
				continue;
			}	
			
		}
		
		
	}
	
	public String getRandom() {
		String[] myHands = {"r", "s", "p"};
			String myHand = myHands[(int) Math.floor(Math.random()* 3)];
			return myHand;
	}
	
	public void playGame(String mych, String random) {
		HashMap<String, String> jyanken = new HashMap<String, String>();
		
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");
		
		System.out.println("自分の手は" + jyanken.get(mych) + "対戦相手の手は" + jyanken.get(random));
		if(("r".equals(mych) && "s".equals(random)) || ("s".equals(mych) && "p".equals(random)) || ("p".equals(mych) && "r".equals(random))) {
		System.out.println("自分の勝ちです");	
		}else if(("s".equals(mych) && "r".equals(random)) || ("p".equals(mych) && "s".equals(random)) || ("r".equals(mych) && "p".equals(random))) {
			System.out.println("自分の負けです");	
			} else { 
				System.out.println("あいこです");
			}
		
		
		
	}
	
	

}
