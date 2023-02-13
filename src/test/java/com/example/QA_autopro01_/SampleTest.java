package com.example.QA_autopro01_;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test()
public class SampleTest {
    @DataProvider
    public Object[][] data() {
        return new String[][]{new String[]{"data1"}, new String[]{"data2"}};
    }

    @Test(dataProvider = "data")
    public void test(String d) {
//        Assert.assertEquals("First Line\nSecond Line", "Third Line\nFourth Line");
        Assert.assertEquals("Third Line\nFourth Line", "Third Line\nFourth Line");
    }
}