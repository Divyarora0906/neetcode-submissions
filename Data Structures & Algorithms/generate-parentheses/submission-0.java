class Solution {
    public List<String> generateParenthesis(int n) {
        int open = 0;
        int close = 0;
        List<String> newString = new ArrayList<>();
        Parthesis(newString, new StringBuilder(), open, close, n);
        return newString;
    }
    public void Parthesis(List<String> newString, StringBuilder sb, int open,int close,int n){
        if(sb.length() == 2*n){
            String s = sb.toString();
            newString.add(s);
            return;
        }
        if(open < n){
            sb.append('(');
            Parthesis(newString, sb, open+1, close, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if(close< open){
            sb.append(')');
            Parthesis(newString,  sb, open, close+1, n);
            sb.deleteCharAt(sb.length() - 1);
       
        }
        return;
    }
}
