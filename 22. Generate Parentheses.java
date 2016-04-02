public class Solution {
    public List<String> generateParenthesis(int n) {
        permuteParentheses(n*2,"");
        return list;
    }
    
    public List<String> list = new ArrayList<>();
    
    	public  void permuteParentheses(int n, String res){
		if(n == 0){
			if(isValid(res)){
				System.out.println(res);
				list.add(res);
			}
		}
		if(n >0){
			permuteParentheses(n-1, res+"(");
			permuteParentheses(n-1, res+")");
		}
	}
	
	
	
	public  boolean isValid(String s) {
        Stack stack=new Stack();
        if(s.length()%2!=0){
            return false;
        }
        else{
            for(int i=0;i<s.length();i++){
                switch(s.charAt(i)){
                    case '(':
                    case '[':
                    case '{':
                    stack.push(s.charAt(i));
                    break;
                    case ')':
                        if(stack.empty()){
                            return false;
                        }else{
                            if(!stack.pop().equals('(')){
                                return false;
                            }
                        }
                        break;
                    case ']':
                        if(stack.empty()){
                            return false;
                        }else{
                            if(!stack.pop().equals('[')){
                                return false;
                            }
                        }
                        break;
                    case '}':
                        if(stack.empty()){
                            return false;
                        }else{
                            if(!stack.pop().equals('{')){
                                return false;
                            }
                        }
                        break;
                }
            }
            if(!stack.empty()){
                return false;
            }
        }
        return true;
    }
}
