
public void SetUp() throws Exception{
        poweroffour p=new poweroffour;

        }

public void tearDown() throws Exception{
        p=null;

        }
@Test
public void testfailmethod(){
    boolean ActualResult=p.method(String Str=ab);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }

@Test
public void testfailmethod(){
         boolean ActualResult=p.method(String Str=123);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }
        @Test
public void testfailmethod(){
        boolean ActualResult=p.method(12.21);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }

@Test
public void testfailmethod(){
        boolean ActualResult=p.method(-12.32);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }

@Test
public void testfailmethod(){
        boolean ActualResult=p.method(-64);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }

@Test
public void testsuccessmethod(){
        boolean ActualResult=p.method(16);
        boolean ExpectedResult="true";
        assertEquals(ExpectedResult,ActualResult);
        }






