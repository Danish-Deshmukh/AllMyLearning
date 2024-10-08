
package KunalKushwaha.BinarySearch.BinarySearchInterviewQuestions;

class Q3FindTheSmallestLetterGreaterThenTarget {

    public static void main(String[] args) {

        System.out.println("Printing the smallest Number in arrays");
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char target = 'g';
        System.out.println(nextGreatestLetter(letters, target));
                      }

    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
