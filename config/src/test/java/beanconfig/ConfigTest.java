package beanconfig;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigRenderOptions;
import org.junit.Test;

public class ConfigTest {
    @Test
    public void testConfigLoad() {
        Config config = ConfigFactory.load("seatunnel_job.conf");
        ConfigRenderOptions options = ConfigRenderOptions.concise().setFormatted(true).setJson(false);
        String data = config.root().render(options);
        System.out.println(data);
    }
}
