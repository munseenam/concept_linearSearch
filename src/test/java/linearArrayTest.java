


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class linearArrayTest {
    linearArray myArray = new linearArray();
    @Test
    public void sequentialSearchTest(){

        int[] arr = { 3, 4, 1, 7, 5 };
        int val;
        int output=1;
        val=myArray.sequentialSearch(arr,output);
        char p1 = 0;

        if(val== -1)
            assertEquals(0,p1);
        else
            assertEquals(2,val);


    }



}
