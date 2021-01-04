package com.dongyl.study.alg.stack;

import org.junit.Before;
import org.junit.Test;

/**
 * @author dongyl-work
 * @date 2021/1/4 下午3:38
 **/
public class StackTest {
    Stack<String> stack = new Stack();

    @Test
    public void pop(){
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    @Test
    public void popEmpty(){
        java.util.Stack stack = new java.util.Stack();
        stack.pop();
    }

    @Before
    public void init(){
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.push("c");
        stack.push("c1");
        stack.push("c2");
        stack.push("c3");
        stack.push("c4");
    }
}
