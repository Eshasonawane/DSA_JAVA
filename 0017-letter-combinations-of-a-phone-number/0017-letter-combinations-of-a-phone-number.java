class Solution {
    public static  void solve(String digits,int index,String[] mapping,List<String>result,StringBuilder  output)
    {
        //if the index is out of given digit string  then our output is ready in  the 
        //output String store it in the result
        if(index>=digits.length())
        {
            result.add(output.toString());
            return;
        }
        //now take the digit value and get the values string that are mapped to that value 
        int digit=digits.charAt(index)-'0';
        String mappedString=mapping[digit];
        //example digit=5 mappedString="jkl"
        //now keep the every charcter at each place and then give other to handle by the recursion
        for(int i=0;i<mappedString.length();i++)
        {
            output.append(mappedString.charAt(i));
            solve(digits,index+1,mapping,result,output);
            //backtracking step
            output.deleteCharAt(output.length()-1);
        } 
    }
    public List<String> letterCombinations(String digits) {
        String mapping[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> result=new ArrayList<>();
        StringBuilder output=new StringBuilder();
        int index=0;
        solve(digits,index,mapping,result,output);
        return result;
    }
}