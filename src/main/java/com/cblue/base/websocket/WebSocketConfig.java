package com.cblue.base.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.HandshakeInterceptor;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {

    /**
     * 注册WebSocket处理类
     */
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(createWebSocketPushHandler(), "/webSocketServer")
                .addInterceptors(createHhandshakeInterceptor()).setAllowedOrigins("*");
        registry.addHandler(createWebSocketPushHandler(), "/sockjs/webSocketServer")
                .addInterceptors(createHhandshakeInterceptor()).withSockJS();
    }

    /**
     * @return
     * @Title: createHhandshakeInterceptor
     * @Description: 握手拦截器
     */
    @Bean
    public HandshakeInterceptor createHhandshakeInterceptor() {
        return new MyWebSocketInterceptor();
    }

    /**
     * @return
     * @Title: createWebSocketPushHandler
     * @Description: 处理类
     */
    @Bean
    public WebSocketHandler createWebSocketPushHandler() {
        return new WebSocketPushHandler();
    }

}
