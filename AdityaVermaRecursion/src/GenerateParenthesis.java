import java.util.ArrayList;
import java.util.List;


//Time->O(2^N) , Space->O(N)
public class GenerateParenthesis {

	public static void main(String[] args) {
		List<String> parenthesis = generateParenthesis(3);
		System.out.println(parenthesis);
	}

	public static List<String> generateParenthesis(int n) {
		List<String> parenthesisList = new ArrayList<>();
		int openBracketCount = n, closeBracketCount = n;
		String output = "";
		solve(openBracketCount, closeBracketCount, output, parenthesisList);
		return parenthesisList;
	}

	public static void solve(int open, int close, String output, List<String> parenthesisList) {
		if (open == 0 && close == 0) {
			parenthesisList.add(output);
			return;
		}

		if (open != 0) {
			if (open == close) { // in this case only 1 choice '('
				solve(open - 1, close, output + "(", parenthesisList);
			} else if (close > open) { // in this case 2 choices '(' and ')'
				solve(open - 1, close, output + "(", parenthesisList);
				solve(open, close - 1, output + ")", parenthesisList);
			}
		} else { // in this case only 1 choice ')'
			solve(open, close - 1, output + ")", parenthesisList);
		}
		
		//OR (use below which is having no redundancy)

//		if (open != 0) {
//			solve(open - 1, close, output + "(", parenthesisList); // if(open==close) in this case only 1 choice '(' =>
//																	// if equal number of open and cloase brackets
//																	// obviously next bracket should be '('
//		}
//
//		if (close > open) { // Case1: if(open!=0) in this case 2 choices '(' and ')'
//							// Case2: if(open==0) in this case only 1 choice ')' as open brackets already
//							// exhausted
//			solve(open, close - 1, output + ")", parenthesisList);
//		}
	}

}
