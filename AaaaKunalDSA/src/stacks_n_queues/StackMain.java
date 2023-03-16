package stacks_n_queues;

public class StackMain {
    public static void main(String[] args) throws StackException {

        CustomStack stack = new DynamicStack(5);
        stack.push(31);
        stack.push(32);
        stack.push(33);
        stack.push(34);
        stack.push(35);
        stack.push(36);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
