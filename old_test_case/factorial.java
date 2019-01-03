
public void SetUp() throws Exception{
        factorial p=new factorial;

        }

public void tearDown() throws Exception{
        p=null;

        }

@Test
public void testfailmethod(){
        boolean ActualResult=p.method(23);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }
@Test
public void testfailmethod(){
        boolean ActualResult=p.method(-20);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }
@Test
public void testsuccessmethod(){
        boolean  ActualResult=p.method(5);
        boolean ExpectedResult="true";
        assertEquals(ExpectedResult,ActualResult);
        }
@Test
public void testsuccessmethod(){
        boolean  ActualResult=p.method(10);
        boolean ExpectedResult="true";
        assertEquals(ExpectedResult,ActualResult);
        }
