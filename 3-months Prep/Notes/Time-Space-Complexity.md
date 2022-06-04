# Time & Space Complexity

Number: 0
Priority: high
Start Date: June 4, 2022
Status: in-progress

- What is Time Complexity?
    - Time complexity ≠ Time taken to execute
    - A **function** that gives the relationship about how the time for execution grows, as the input grows
    - A **relation** between the time & input size
- Importance of Time Complexity
    - Examples:
    - Linear Search grows linearly ⇒ `N`
    - Binary Search ⇒ `log(N)`
    - Helps to analyse, which algorithm takes lesser time to execute, if the input size is large
- What to consider, when thinking about Complexity? ⇒ `**Important: pt. 3,4**`
    - Always look at the **WORST CASE** complexity
    - Always look at complexity for **LARGE / INFINIT**E data
    - Always ignore the **constants**
        - As, we are looking only for a relation of how the time grows, as the input grows & not the actual value of time!
    - Always ignore less dominating terms in the relation

---

- Order of complexity:

$`O(1)`$ < $`O(log(N))`$ < $`O(N)`$ < $`O(2^N)`$

---

### Notations

- Big-Oh Notation $`O()`$
    - Word Definition:
        - **Upperbound complexity** of an algorithm
            - Example: Time complexity of a program =  $`O(N^3)`$
                - This means that the algorithm complexity will not exceed this value at all
                - Can be lesser than this
    - Mathematically:
        - Using `limits`, we can prove this
- Big-Omega Notation $`Ω()`$
    - Opposite of **Big-Oh** $`Ω()`$
    - Word Definition:
        - This represents the L**owerbound complexity** of the algorithm
            - Example: $`Ω(N^3)`$
                - This is the min. possible complexity of the algo
                - It can be greater than this, but **NOT LESS**

---

**Q.** What if an algo has lowerbound & upperbound as $`N^2`$. How we’ll represent this?

- Big-Theta Notation $`θ()`$
    - Combining both the upperbound and lowerbound

---

- Little-Oh Notation
    - Giving the upperbound complexity
    - But a **loose** one
        
        ![](https://i.imgur.com/gWNnYqr.png)
        
    
- Little-Omega Notation
    - Giving the lowerbound, but a **loose** one
        
        ![](https://i.imgur.com/9ZzHhNn.png)
        
    

---

### Space Complexity

- What is Space Complexity?
    - The input space + auxiliary space
    - Total space taken by the algo w.r.t to the input size
    - Auxiliary Space
        - Extra or temporary space used by an algorithm
    

---

- **Question**
    
    **Q.** Find time complexity of the algorithm:
    
    ![](https://i.imgur.com/oScXLbA.png)
    
    - Inner loop:
        - Running `K` times & having time as `t`
        - Therefore, time complexity = $`O(Kt)`$
    - Outer Loop:
        - How the outer loop is working?
            - 1…..1+K…..1+2K….1+3k….1+xK, where `x` → time taken by outer loop
            - Now, this value will be equal to till where the loop is running i.e. `i ≤ N`
            - Therefore:
            `1 + xK = N
            x = N - 1/K`
        - Complexity:
            - $`O(Kt * (N-1/K))`$
            - Therefore, $`O(Nt)`$

---