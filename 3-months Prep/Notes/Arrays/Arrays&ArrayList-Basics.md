# Arrays & ArrayList

Number: 1
Priority: high
Start Date: June 6, 2022
End Date: June 7, 2022
Status: done
Success: Yes

<aside>
📕 Source → DSA Bootcamp (KK) ⇒ [https://youtu.be/n60Dn0UsbEk](https://youtu.be/n60Dn0UsbEk)

</aside>

---

### Basics

- What is an Array?
    - collection of related data types
- Syntax:
    - declaring an array:
    
    ```java
    dataType[] var_name = new datatype [size]
    ```
    
    - declaring + initialising at the same time:
    
    ```java
    dataType[] var_name = {1,2,3,4,5};
    ```
    
    - `dataType` → the whole data type of your array.
        - Example: int, float, double etc.
    - Meaning of the statement:
        - `var_name` is referencing to an array object i.e. `new var_name` of type `int`
        
        ```java
        int[] rnos; // declaration of the array. 'rnos' gets defined in the stack
        rnos = new int[5]; // initialisation - object is being created in the heap memory!
        ```
        
- How memory management works here?
    - `int[] arr`  → (declaration) happens at compile time
    - `new int[5]` → (object creation in heap) happens at run-time
        - **process is called: Dynamic Memory Allocation**
    - Memory Management depends on JVM:
        - Array objects are in heap
        - “**Heap objects are not continuous”** - Said by Java
        - Dynamic Memory Allocation
        
        **⇒ Array objects may not be continuous**
        
- `new` keyword
    
    **used to create an object at runtime (in heap)**
    
- `null`
    - its a special literal/value → means NULL value
    - can only be assigned to **non-primitive** data types
        - Example: String etc.
    - Any reference variable has by default value as `null`
- Array Input (1D)
    - Initialisation:
    
    ```java
    int[] arr = new int[5];
    ```
    
    - input (using FOR loop):
    
    ```java
    for(int i=0; i<arr.length;i++){
    	arr[i] = in.nextInt();
    }
    ```
    
    - print the array:
    
    ```java
    // 1st method
    for(int i=0; i<arr.length;i++){
    		System.out.print(arr[i]+" ");
    }
    
    // 2nd method: enhanced FOR loop (foreach loop):
    for (int element : arr) {
    		System.out.print(element + " ");
    }
    
    // 3rd method:
    System.out.println(Arrays.toString(arr));
    ```
    
- Array passing in Functions
    - Arrays are mutable in Java i.e they can be modified/changed
    - When we use array in functions:
        - It would be pointing to the same reference variable
            - Therefore, the value will be changed
        
        ```java
        // main()
        int[] nums = {1,2,3,4,5};
        
        System.out.println(Arrays.toString(nums));
        change(nums); // calling the function here
        
        System.out.println(Arrays.toString(nums));
        ```
        
        ```java
        // Function:
        
        static void change(int[] arr){
        	arr[0] = 88;
        }
        ```
        
        ```java
        // OUPUT:
        1 2 3 4 5
        88 2 3 4 5
        ```
        
        - We can see from the above output, the element is changed!

---

### 2D Arrays

- 2D Arrays
    - Syntax:
    
    ```java
    int[][] nums = new int[rows][cols];
    ```
    
    - Adding the number of columns in 2D arrays is not mandatory
    - Examples:
        
        ```java
        int[][] arr = {
        		{1,2,3},
        		{4,5},
        		{6,7,8,9}
        }
        ```
        
- Internal Working of 2D arrays
    - **“An Array of arrays”**
    - Size of individual rows does not matter
        - Therefore, writing or not writing the column size does not matter:
    
    ```java
    // int[][] nums = new int[3][];
    
    int[][] arr = {
    		{1,2,3},
    		{4,5},
    		{6,7,8,9}
    }
    // indivisual arrays/columns can have different sizes
    ```
    
- Input
    - No. of rows is given by → `arr.length`
        - i.e. the length of an array
    
    ```jsx
    // 1st Loop:
    for (int row = 0; row < arr2D.length; row++) {
                
            }
    ```
    
    - Now, for every column at each row:
    
    ```jsx
    // Nested Loop:
    for (int col = 0; col < arr2D[row].length; col++) {
                    arr2D[row][col] = in.nextInt();
                }
    ```
    
    - Therefore:
    
    ```jsx
    for (int row = 0; row < arr2D.length; row++) {
                // for each column at every row
                for (int col = 0; col < arr2D[row].length; col++) {
                    arr2D[row][col] = in.nextInt();
                }
            }
    ```
    
- Internal Working of Input
    - For the 1st loop, its simple as we are iterating over each ROW (like a 1D array)
    
    ```jsx
    for (int row = 0; row < arr2D.length; row++){
    }
    ```
    
    - About the 2nd loop (nested):
        - We are iterating over each column of that row
        - Till when?
            - Till the size of an individual row → `arr[row].length` or we can also say: `column<size(row)`
        - Therefore,
        
        ```jsx
        for (int col = 0; col < arr2D[row].length; col++) {
                        arr2D[row][col] = in.nextInt();
                    }
        ```
        
        - **Individual size of the row → we only need that much amout of columns**
        - **Dry run:**
            
            ![Screenshot 2022-06-06 at 7.40.11 AM.png](Arrays%20&%20ArrayList%20d8cd7226832e465cbdd4315bf6ba4d53/Screenshot_2022-06-06_at_7.40.11_AM.png)
            
            - `size(arr[0])` = 3 (1st row)
                - So, the column values will go till 3
            - `size(arr[1])` = 2 (2nd row)
                - So, the column values will go till 2
            - `size(arr[2])` = 4 (3rd row)
                - So, column values will go till 4
- Ways Of Printing
    
    ```java
    // Using Arrays.toString()
    for (int row = 0; row < arr2D.length; row++) {
                System.out.println(Arrays.toString(arr2D[row]));
            }
    
    // Output:
    1 2 3 4 5 6 7 8 9
    
    [1, 2, 3]
    [4, 5, 6]
    [7, 8, 9]
    
    // Enhanced FOR LOOP approach:
    for(int[] elementAsArr : arr2D){
    		System.out.println(Arrays.toString(elementAsArr);
    }
    ```
    
    - Using enhanced FOR-Loop:
    
    ```java
    for (int[] ints : arr2D) {
                // for each column at every row
                for (int anInt : ints) {
                    System.out.printf(anInt + " ");
                }
                System.out.println();
            }
    ```
    
- Why are we using `arr[row].length` in columns?
    - It might be the case that the column size is not fixed
    
    Example:
    
    ```java
    int[][] arr = {
                    {1,2,3,4},
                    {5,6},
                    {7,8,9}
            };
    ```
    
    - For that, we want the column to go till the size of a particular row, every time we iterate!
        - Thats why we use `arr[row].length` → means, till the length/size of that particular row

---

### Dynamic Arrays/ArrayList

- Similar to `<vectors>` in C++
- We use this when the size of our array is **not fixed** or **unknown**
- Its part of the **Collection Framework**
- **Slower** than a standard array
- Syntax
    
    ```java
    ArrayList<DataType> list = new ArrayList<>(Initial Capacity);
    ```
    
    - For the `initial capacity`, we can specify an initial size of the array
    - Only wrapper classes can be passed in the DataTypes
        - i.e. `Integer`, `String`, `Float` etc.
- Taking the input
    - Using `list.add()`
    
    ```java
    list.add(12);
    list.add(88);
    list.add(22);
    list.add(344);
    
    ```
    
    - Using FOR-LOOP:
    
    ```java
    for (int ele = 0; ele < 5; ele++) {
                list.add(in.nextInt());
            }
            System.out.println(list+" ");
    ```
    
    ```java
    // Using list.get()
    
    for (int ele = 0; ele < 5; ele++) {
                list.add(in.nextInt());
            }
            for (int ele = 0; ele < 5; ele++) {
                System.out.print(list.get(ele)+" ");
            }
    ```
    
- Functions that can be applied
    - Modifying an index:
    
    ```java
    //Modifying Values:
    list.set(0,99);
    ```
    
    - Removing an item:
    
    ```java
    // Removing an item:
    list.remove(3);
    ```
    

---

### Questions

- Swapping two indices in an array
- Get max value in the array
- Reversing the array