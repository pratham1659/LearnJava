## String In Java - Time Complexity and Space Complexity

| Operation          | Java Method             | Time Complexity | Space Complexity | Description                      |
| ------------------ | ----------------------- | --------------- | ---------------- | -------------------------------- |
| Length             | `str.length()`          | O(1)            | O(1)             | Returns the number of characters |
| Character Access   | `str.charAt(index)`     | O(1)            | O(1)             | Access character at index        |
| Find Index         | `str.indexOf('x')`      | O(n)            | O(1)             | Find index of a character        |
| String Comparison  | `str.compareTo(str2)`   | O(n)            | O(1)             | Lexicographical comparison       |
| Contains Substring | `str.contains("xyz")`   | O(n \* m)       | O(1)             | Checks for substring             |
| Starts With        | `str.startsWith("abc")` | O(k)            | O(1)             | Prefix check                     |
| Ends With          | `str.endsWith("xyz")`   | O(k)            | O(1)             | Suffix check                     |
| Lowercase          | `str.toLowerCase()`     | O(n)            | O(n)             | Converts to lowercase            |
| Uppercase          | `str.toUpperCase()`     | O(n)            | O(n)             | Converts to uppercase            |
| Concatenation      | `str + str2 / concat()` | O(n + m)        | O(n + m)         | Joins two strings                |
| Substring          | `str.substring(i, j)`   | O(k)            | O(k)             | Extract substring                |
| Replace            | `str.replace(a, b)`     | O(n)            | O(n)             | Replace characters               |
| Trim Whitespace    | `str.trim()`            | O(n)            | O(n)             | Removes leading/trailing spaces  |
| Equals             | `str.equals(str2)`      | O(n)            | O(1)             | Checks string equality           |
| Mutable String Ops | `StringBuilder`         | O(1) per op     | O(n)             | Efficient for editing strings    |
