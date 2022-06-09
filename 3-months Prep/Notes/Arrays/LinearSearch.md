# Linear Search

End Date: June 9, 2022
Number: 2
Priority: high
Start Date: June 8, 2022
Status: done
Success: Yes

- What is searching in arrays?
    - Searching a particular element in an array or string
    - Two techniques/alogs to do this:
        - **Linear Search**
        - **Binary Search**
- Idea of Linear Search
    
    **Question:** Find whether 14 exists in the below array or not!
    
    ```java
    arr = [18, 12, 9, 14, 77, 50] 
    ```
    
    - **Algorithm:**
        - Start searching from the `1st` element of the array, till you find your element
            - If `YES` → return the index value
            - If `NO` → return `-1`
        - Time Complexity:
            - **Best Case** ⇒ $`O(1)`$
                - if the element you are searching for, is the 1st element itself (at `0th` index)
                - Therefore, only `1` comparison made
                - Size of the array does not matter, therefore a constant Time Complexity
            - **Worst Case** ⇒ $`O(N)`$
                - where `N` → size of array
                - we searched the entire array & didn’t find the element
                - Therefore, `N` no. of comparisons made here!
        
- Code
    1. **Returning the index value of the element:**
    
    ```java
    static int linearSearch(int[] arr, int target){
            //checks:
            if (arr.length == 0){
                return -1;
            }
            for (int index = 0; index < arr.length; index++) {
                // check for element at every index:
                int element = arr[index];
                if (element == target){
                    return index;
                }
            }
            // if the element is NOT found!
            return -1;
        }
    ```
    
    1. **Returning the element itself, if FOUND**
    
    ```java
    static int linearSearch2(int[] arr, int target){
            //checks:
            if (arr.length == 0){
                return -1;
            }
            for (int index = 0; index < arr.length; index++) {
                // check for element at every index:
                int element = arr[index];
                if (element == target){
                    return element;
                }
            }
            // if the element is NOT found!
            // it might be the case that '-1' is itself an element in the array! 
    				// Therefore, we are returning a random max-value, to show that element was not found!
            return Integer.MAX_VALUE;
        }
    ```
    
    1. **Boolean Method**
    
    ```java
    static boolean linearSearch3(int[] arr, int target){
            //checks:
            if (arr.length == 0){
                return false;
            }
            for (int index = 0; index < arr.length; index++) {
                // check for element at every index:
                int element = arr[index];
                if (element == target){
                    return true;
                }
            }
            // if the element is NOT found!
            return false;
        }
    ```
    

---

### Questions

- **Q.** Linear Search in a String
    1. **Simple Function:**
    
    ```java
    static boolean searchInString(String str, char target){
            if (str.length() == 0){
                return false;
            }
            for (int index = 0; index < str.length(); index++) {
                //
                char element = str.trim().charAt(index);
                if (element == target){
                    return true;
                }
            }
            return false;
        }
    ```
    
    - `trim()` → used for removing the extra spaces in the string
    - `charAt(i)` → used to get the character at that index, from the string!
    
    ---
    
    1. Using `FOR-EACH` loop:
    
    ```java
    static boolean searchInString2(String str, char target){
            if (str.length() == 0){
                return false;
            }
            for (char ch : str.toCharArray()) {
                if (ch == target){
                    return true;
                }
            }
            return false;
        }
    ```
    
    - `str.toCharArray()` → for a FOR-EACH loop, you need an array or a collection.
        - Therefore, we converted our string to a **character array**
        
        ```java
        // Character Array Conversion:
        String name = "Kunal";
        System.out.println(Arrays.toString(name.toCharArray()));
        
        // Output: 
        [K, u, n, a, l]
        ```
        
- **Q.** Search in a range
    - Question: Search for 2 in the range of index `[1,4]`
    
    ```java
    static int searchInRange(int[] arr, int target, int start, int end){
            if(arr.length == 0){
                return -1;
            }
            // the for-loop is starting with the start index & only checks till the end index
            // Therefore, bounding the range
            for (int index = start; index < end; index++) {
                int element = arr[index];
                if (element == target){
                    return index;
                }
            }
            return -1;
        }
    ```
    
- **Q.** Find minimum number in the array
    
    ```java
    // assuming that arr.length != 0
        static int minNumber(int[] arr){
            int min = Integer.MAX_VALUE;
    
            for (int index = 0; index < arr.length; index++) {
                int element = arr[index];
    
                if (element < min){
                    min = element;
                }
            }
            return min;
        }
    ```
    
- **Q.** Search in 2D array
    - Example:
    
    ```java
    // Question:
    int[][] arr = {
                    {23, 4, 1},
                    {18, 12, 3, 9},
                    {78, 99, 34, 56},
                    {18, 12}
            };
    ```
    
    ```java
    static int[] searchIn2DArray(int[][] arr, int target){
    
            for (int row = 0; row < arr.length; row++) {
    
                for (int col = 0; col < arr[row].length; col++) {
                    int element = arr[row][col];
    
                    if (element == target){
                        return new int[]{row, col};
                    }
                }
            }
            return new int[]{-1,-1};
        }
    ```
    
    - In here, we are actually **returning an array itself** & that would be the row & col index of the element, **IF FOUND**
        
        `{row, col}`
        
    - `return new int[]{row, col};` → reason for returning this is because the `{row, col}`array wasn’t initialised before!
        - Therefore, we are creating a new object & returning that here!
- **Q.** Max. value in 2D array
    
    ```java
    static int maxIn2DArray(int[][] arr){
            int max = Integer.MIN_VALUE;
            for (int row = 0; row < arr.length; row++) {
    
                for (int col = 0; col < arr[row].length; col++) {
    
                    int element = arr[row][col];
    
                    if (element > max){
                        max = element;
                    }
    
                }
            }
            return max;
        }
    ```
    
    - Using Enhanced FOR-LOOP:
    
    ```java
    static int maxIn2DArray(int[][] arr){
            int max = Integer.MIN_VALUE;
            for (int[] ints : arr) {
                for (int element : ints) {
                    if (element > max) {
                        max = element;
                    }
    
                }
            }
            return max;
        }
    ```
    
- **Leetcode #1**
    - [https://leetcode.com/problems/find-numbers-with-even-number-of-digits/](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)
    - **Method-1**
        - The function `NumberOfDigits` is basically returning the number of digits in an integer we throw at it
        - Now, we use this function in our main function i.e. `findNumbers`to find the number of digits of each element of the array & then they are even or not!
            - If YES, `count++`
            - If NO, continue searching
    
    ```java
    static int findNumbers(int[] nums) {
            if (nums.length == 0){
                return -1;
            }
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                int element = nums[i];
                int digits = NumberOfDigits(element);
                if (digits%2==0){
                    count++;
                }
            }
            return count;
        }
        static int NumberOfDigits(int num){
            int count = 0;
            while (num!=0){
                num/=10;
                count++;
            }
            return count;
        }
    ```
    
    ---
    
    - **Method-2**
        - We created a boolean function to check that whether a number has even number of digits or not: `evenDigits`
        - Then we used this in our main function accordingly
        
        ```java
        static int findNumbers2(int[] nums) {
                int count = 0;
                // checking for each element in the number array! (using FOR Each loop)
                for (int element : nums){
                    if (evenDigits(element)){
                        count++;
                    }
                }
                return count;
            }
            static boolean evenDigits(int num) {
                int count = 0;
                while (num>0){
                    count++;
                    num/=10;
        
                }
                return count % 2 == 0;
            }
        ```
        
    - Shortcut to find number of digits in a number:
    
    ```java
    // Shortcut to find number of digits in a number:
        static int digits(int num){
            return (int)(Math.log10(num)) + 1;
        }
    ```
    
- **Leetcode #2**
    - [https://leetcode.com/problems/richest-customer-wealth/](https://leetcode.com/problems/richest-customer-wealth/)
    - Things we are doing here:
        - Iterating over the whole 2D array (as we always do)
        - Storing the sum of a row (i.e a person) in a variable called as `rowSum`
        - After each row is completely iterated, we are comparing this the main MAX value & updating the MAX `if(rowSum > MAX)`
        - At the end, we are returning the MAX value as a whole
    
    ```java
    static int maximumWealth(int[][] accounts) {
            int MAX = Integer.MIN_VALUE;
            // row = person
            // each column = the account they have money in
            for (int customer = 0; customer < accounts.length; customer++) {
                int rowSum = 0;
                for (int account = 0; account < accounts[customer].length; account++) {
                    rowSum += accounts[customer][account];
                }
                if (rowSum > MAX){
                    MAX = rowSum;
                }
            }
            return max;
        }
    ```