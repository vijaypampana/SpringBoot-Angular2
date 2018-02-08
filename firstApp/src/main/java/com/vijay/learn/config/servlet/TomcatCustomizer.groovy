package com.vijay.learn.config.servlet

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory
import org.springframework.stereotype.Component
import org.apache.catalina.connector.Connector

@Component
class TomcatCustomizer implements EmbeddedServletContainerCustomizer {
    int port
    long asyncTimeout

    @Autowired
    TomcatCustomizer(@Value('${Tomcat.port}') int port,
                         @Value('${Tomcat.asyncTimeout}') long asyncTimeout){
        this.port = port
        this.asyncTimeout = asyncTimeout

    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        if(container instanceof TomcatEmbeddedServletContainerFactory) {
            TomcatEmbeddedServletContainerFactory containerFactory = (TomcatEmbeddedServletContainerFactory) container
            containerFactory.addConnectorCustomizers(new TomcatConnectorCustomizer() {

                @Override
                public void customize(Connector connector) {
                    connector.port = port
                    connector.asyncTimeout = asyncTimeout
                }
            })
        }
    }
}
