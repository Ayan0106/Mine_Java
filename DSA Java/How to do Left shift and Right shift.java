/* RIGHT SHIFT (One Position)
 1.  Store last element----int last = arr[n - 1];
 2.  Move elements from RIGHT → LEFT direction.
        for(int i = n - 1; i > 0; i--)
        {
            arr[i] = arr[i - 1];
        }
 3.  Put stored last element at beginning.
        arr[0] = last;  
   Why Reverse Direction? Because if you go forward: arr[i+1] = arr[i]; you overwrite data.

     WE USE IT IN ARRAY_PROBLEMS_JAVA:LC189 in the Brute Force Approach.
     
-------------------------------------------------------------------------------
  
  LEFT SHIFT (One Position)
  1.  Store first element----int first = arr[0];
  2.  Move elements LEFT.
        for(int i = 0; i < n - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
   3. Put stored first element at end.
        arr[n - 1] = first; 
