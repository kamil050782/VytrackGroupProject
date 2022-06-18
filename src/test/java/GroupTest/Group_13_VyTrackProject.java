package GroupTest;

import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Group_13_VyTrackProject {
    @Test
    public void vyTrackTest(){
        //1.Go to home page
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
}
