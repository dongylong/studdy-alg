package com.dongyl.study.alg.queue;

/**
 * @author dongyl-work
 * @date 2021/1/4 下午3:37
 **/
public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new Queue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        queue.enqueue("c");
        queue.enqueue("c1");
        queue.enqueue("c2");
        queue.enqueue("c3");
        queue.enqueue("c4");
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
