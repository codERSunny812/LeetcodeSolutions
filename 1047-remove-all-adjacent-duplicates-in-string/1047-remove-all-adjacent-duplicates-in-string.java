class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int i; String str="";

        for(i=0;i<s.length();i++){

            //addding the first element in  the stack if its empty
            if(st.empty()){
                st.push(s.charAt(i));
                continue;
            }

            //check for the condition 

            if(st.peek() == s.charAt(i)){
                st.pop();
                continue;
            }


            st.push(s.charAt(i));
        }


    Stack<Character> st2 = new Stack<>();


        while(!st.empty()){
            st2.push(st.peek());
            // str += st.peek();
            st.pop();
        }


           while(!st2.empty()){
            // st2.push(st.peek());
            str += st2.peek();
            st2.pop();
        }



        return str;
    }
}