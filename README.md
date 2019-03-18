# File-Data-Structures-Java-App-that-performs-Dynamic-Hashing
This is a Java application that performs **Dynamic Hashing** in the main memory. Also, the application includes functionalities as *Search*, *Insert* and *Delete* elements. We are going to use a static array which has a size of 100 enties (tthis is our data structure). The pages of storage has a size of 2 elements.
## Methods
* **Insert Method :** We have to calculate, on average the number of comparisons during the insertion of 20 new keys.
* **Search Method :** After the insertion of those 20 new keys, we have to caclulate on average the number of comparisons during the search of 20 keys.
* **Delete Method :** After the insertion of those 20 new keys, we have to caclulate on average the number of comparisons during the deletion of 20 keys.
Subsequently, we can repeat all the steps above when the static array has a size of 1000 and 10000 entries respectively. For the calculation of the number of comparisons we increase a counter by 1 each time a key is being used.
## Dynamic Hashing 
Now its time to implement dynamic hashing in the hard drive directly. We are going to use the static array from above together with a pointing tree. Both of them are lying in the main memory. Every hard drive page has a size of b = 128 bytes. Thus there are pointers from the main memory pointing to data pages. During the implementation of the dynamic hashing we have to perform all the methods described above only now we have to calculate the number of hard drive accesses during insertion, search and deletion for different sizes of the static array. In case of deletion we can ignore the merge of neighboring pages. Thus two neighboring pages with less or not at all elements are allowed.
