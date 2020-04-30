package huaplus.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstanceRenewListener implements ApplicationListener<EurekaInstanceRenewedEvent> {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onApplicationEvent(EurekaInstanceRenewedEvent event) {
        logger.info("心跳检测服务: {}" , event.getInstanceInfo().getAppName());
    }
}
