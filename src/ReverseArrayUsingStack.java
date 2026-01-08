import java.util.Stack;

public class ReverseArrayUsingStack {

    public static void main(String[] args) {
        // 1. Mảng ban đầu
//        int[] arr = {1, 2, 3, 4, 5};
//        // 2. Tạo stack rỗng
//        Stack<Integer> stack = new Stack<>();
//        // 3. Push các phần tử của mảng vào stack
//        for (int i = 0; i < arr.length; i++) {
//            stack.push(arr[i]);
//        }
//        // 4. Pop từ stack và gán lại cho mảng
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = stack.pop();
//        }
//        // 5. In mảng sau khi đảo
//        System.out.print("Mảng sau khi đảo: ");
//        for (int value : arr) {
//            System.out.print(value + " ");
//        }
        // chuoi
        String input = "code gym ha noi";
        Stack<String> wStack = new Stack<>();
        for (String word : input.split(" ")) {
            wStack.push(word);
        }

        // 2. Pop các word ra và in
        while (!wStack.isEmpty()) {
            System.out.print(wStack.pop() + " ");
        }
    }

    }
}
