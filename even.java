public void SetUp() throws Exception{
        EvenNumTest p=new evenNumTest;

        }

public void tearDown() throws Exception{
        p=null;

        }

@Test
        public void testfailmethod(){
        boolean ActualResult=p.method(-20);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }
@Test
        public void testfailmethod(){
       boolean  ActualResult=p.method(25);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }

@Test
public void testsuccessmethod(){
        boolean ActualResult=p.method(20);
        boolean ExpectedResult="true";
        assertEquals(ExpectedResult,ActualResult);
        }





