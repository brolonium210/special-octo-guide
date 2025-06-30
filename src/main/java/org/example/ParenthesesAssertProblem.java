package org.example;

//The answer must have balanced parentheses
public class ParenthesesAssertProblem{
    //This question shows that we can use the question marks
    //in multiple places, and that they all get replaced
    //with the same text.
    public static int foo=1;
    public static void main(String [] arg){
        int foo=10;


        assert (10==ParenthesesAssertProblem.foo):"assertion10";
        assert (11==foo++):"assertion11";
        assert (12==foo++):"assertion12";
        assert (13==foo++):"assertion13";
    }
}

