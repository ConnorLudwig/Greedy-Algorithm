    
//was later added to master code. This is the test that catches the exception for a empty array.

    @Test
    public void testMethod4(){
        int array[] = {};
        boolean thrown = false;
        try {
        Program4.greedy(array, 0);
        } 
        catch (IllegalArgumentException e) {
            thrown = true;
        }
        
    assertTrue(thrown);
  }
