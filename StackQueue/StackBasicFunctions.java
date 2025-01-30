import java.util.*;

class StackBasicFunctions{

    public static void main(String args[]){
        Stack<Integer>st = new Stack();
        
        for(int i=0;i<=10;i++){
            st.push(i);
        }

        for(int i=0;i<=10;i++){
            System.out.println(st.peek());
            st.pop();
        }
        
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

        return ;

    }
};