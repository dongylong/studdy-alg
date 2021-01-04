package com.dongyl.study.alg.bag;

import java.util.Iterator;

/**
 * @author dongyl-work
 * @date 2021/1/4 下午3:59
 **/
public class BagTest {
    public static void main(String[] args) {
        Bag bags = new Bag();
        bags.add("123");
        bags.add("124");
        bags.add("234");
        Iterator bag = bags.iterator();
        while (bag.hasNext()){
            System.out.println(bag.next());
        }
    }
}
