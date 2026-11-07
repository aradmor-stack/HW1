import java.util.Arrays;

public class Assignment01Q04 {

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if (array.length == 0) {
            return array;
        }
        if (direction == 'R') {
            if (move < 0) {
                move = (-move) % array.length;
                return moveLeft(array, move);
            } else {
                return moveRight(array, move % array.length);
            }
        } else if (direction == 'L') {
            if (move < 0) {
                move = (-move) % array.length;
                return moveRight(array, move);
            } else {
                return moveLeft(array, move % array.length);
            }
        }
        return array;
    }

    public static int[] moveRight(int[] array, int move) {
        int l = array.length;
        int[] moved_arr = new int[l];
        for (int i = 0; i < l; i++) {
            moved_arr[i] = array[(i - move + l) % l];
        }
        return moved_arr;
    }

    public static int[] moveLeft(int[] array, int move) {
        int l = array.length;
        int[] moved_arr = new int[l];

        for (int i = 0; i < l; i++) {
            moved_arr[i] = array[(i + move + l) % l];
        }
        return moved_arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 1, 2, 3, 4, 5 }, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] { 0, 8, 9, 5, 6 }, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
                shiftArrayCyclic(new int[] {}, 3, 'R'))); // []
    }
}