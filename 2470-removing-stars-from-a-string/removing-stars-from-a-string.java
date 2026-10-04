class Solution {
    public String removeStars(String s) {
    StringBuilder newstr= new  StringBuilder("");
    Stack<Character> str= new Stack<>();
    for(int i=0;  i<s.length(); i++){
        if(s.charAt(i)=='*'){
          str.pop();
        }
        else{
            str.push(s.charAt(i));
           
        }
    
    }
    while(!str.isEmpty()){
    char temp= str.pop();
    newstr.append(temp);

}
  return newstr.reverse().toString();
        }
}