# Linear Search

Number: 2
Priority: high
Start Date: June 8, 2022
Status: in-progress
Success: No

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