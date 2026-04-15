import java.util.*;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int a : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && a < 0 && stack.peek() > 0) {
                if (stack.peek() < -a) {
                    // stack asteroid is smaller → destroyed
                    stack.pop();
                    continue;
                } else if (stack.peek() == -a) {
                    // both same size → both destroyed
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    // current asteroid is smaller → destroyed
                    destroyed = true;
                    break;
                }
            }

            if (!destroyed) {
                stack.push(a);
            }
        }

        // Convert stack to array
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
