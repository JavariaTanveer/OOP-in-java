public class DuplicateFinder {
    private int[] numbers;
    private int[] duplicates;
    
    public DuplicateFinder(int[] numbers) {
        this.numbers = numbers;
        this.duplicates = findDuplicates();
    }
    
    public int[] getDuplicates() {
        return duplicates;
    }
    
    private int[] findDuplicates() {
        int[] duplicates = new int[numbers.length];
        int count = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    boolean alreadyExists = false;
                    for (int k = 0; k < count; k++) {
                        if (duplicates[k] == numbers[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        duplicates[count] = numbers[i];
                        count++;
                    }
                }
            }
        }
        
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = duplicates[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 3, 6, 5, 8, 11};
        DuplicateFinder finder = new DuplicateFinder(numbers);
        int[] duplicates = finder.getDuplicates();
        
        System.out.print("Duplicate elements in the array: ");
        for (int i = 0; i < duplicates.length; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }
}
