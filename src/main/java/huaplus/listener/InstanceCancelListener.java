package huaplus.listener;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceCancelListener implements ApplicationListener<EurekaInstanceCanceledEvent> {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onApplicationEvent(EurekaInstanceCanceledEvent event) {
        logger.info("服务: {} 已挂! ", event.getAppName());
    }
}
