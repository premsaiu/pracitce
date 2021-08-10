package com.practice.arrays;

public class BalancedExpression {

    public static char OPEN_FLOWER_BRACES = '{';
    public static char CLOSE_FLOWER_BRACES = '}';

    public static void main(String[] args) {

    }

    static boolean isBalanced(String expression){
        boolean isBalanced = false;
        if(null != expression && !expression.isEmpty()){
            int len = expression.length();
            if(len%2 == 0){
                int count = 0;
                for (int i=0; i<expression.length(); i++){
                    char c = expression.charAt(i);
                    if(OPEN_FLOWER_BRACES == c){
                        count++;
                    }else if(CLOSE_FLOWER_BRACES == c){
                        if(count ==0)
                            break;
                        count--;
                    }
                }
            }
        }
        return isBalanced;
    }
}
