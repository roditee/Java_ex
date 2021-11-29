package dataStructure;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		
		try {
			stk.push("È«±æµ¿");
			stk.push("ÀÌ¸ù·æ");
			stk.push("¼ºÃáÇâ");
			
			for(int i=0; i<stk.size(); i++) {
				System.out.println(i + " : " + stk.get(i));
			}
			
			System.out.println("½ºÅÃ Å©±â : " + stk.size());
			System.out.println("ÃÖ»óÀ§ °ª : " + stk.peek());
			System.out.println("ÀÌ¸ù·æ µé¾î ÀÖ³ª? : " + stk.contains("ÀÌ¸ù·æ"));
			System.out.println("pop ¼öÇà1 : " + stk.pop());
			System.out.println("pop ¼öÇà2 : " + stk.pop());
			
			for(int i=0; i<stk.size(); i++) {
				System.out.println(i + " : " + stk.get(i));
			}
			
			System.out.println("clear ¼öÇà");
			stk.clear();
			System.out.println("empty? : " + stk.empty());
			
			System.out.println("pop ¼öÇà3 : " + stk.pop());
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
