
public void SetUp() throws Exception{
    palindrome p=new palindrome;

        }

public void tearDown() throws Exception{
        p=null;

        }
        @Test
public void failmethod(){
    boolean expectedResult="false";

    boolean ActualResult=p.method(abba);
    assertEquals(expectedResult,actualResult);
              }
public void failmethod(){
        boolean expectedResult="false";
        boolean ActualResult=p.method(-a2);
        assertEquals(expectedResult,actualResult);
        }
public void successmethod(){
        boolean expectedResult="true";

        boolean ActualResult=p.method(a22a);
        assertEquals(expectedResult,actualResult);
        }
public void successmethod(){
        boolean expectedResult="true";

        boolean ActualResult=p.method(121);
        assertEquals(expectedResult,actualResult);
        }
public void failmethod(){
        boolean expectedResult="false";

        boolean ActualResult=p.method(-222);
        assertEquals(expectedResult,actualResult);
        }







