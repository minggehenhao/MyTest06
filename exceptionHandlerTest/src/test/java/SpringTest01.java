import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author YueZhiMing
 * @create 2020-06-28 11:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTest01 {

    @Test
    public void Test1() {
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();
        System.out.println("version:"+version);
        System.out.println("version:"+version1);
        System.out.println("--------------------------------");

    }
}