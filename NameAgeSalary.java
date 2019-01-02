public void SetUp() throws Exception{
        NameAgeSalary p=new NameAgeSalary;

        }

public void tearDown() throws Exception{
        p=null;

        }
@Test
        public void testfailmethod(){
       boolean ActualResult=p.method(121,ad,12.000);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }

        @Test
        public void testfailmethod(){
        boolean ActualResult=p.method(sanjay,45,-1200.000);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
@Test
        public void testsuccessmethod(){
        boolean ActualResult=p.method(sanjay,45,1200.000);
        boolean ExpectedResult="true";
        assertEquals(ExpectedResult,ActualResult);
        }

@Test
public void testfailmethod(){
        boolean ActualResult=p.method(sanjay,45,1200.000);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }
@Test
public void testfailmethod(){
       boolean ActualResult=p.method(56,45,120000);
        boolean ExpectedResult="false";
        assertEquals(ExpectedResult,ActualResult);
        }
@Test
public void Membervariabltestmethodsuccess(){
    ActualResult=Membervariable.method( 0,0,0);
        assertnotnull(ActualResult);
        }
@Test
public void Membervariablefailuresuccess(){
        ActualResult=Membervariable.method(null);
        assertnull(ActualResult);
        }





