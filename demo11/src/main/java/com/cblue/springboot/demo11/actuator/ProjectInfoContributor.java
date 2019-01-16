package com.cblue.springboot.demo11.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class ProjectInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("company.name", "study") ;
        builder.withDetail("version", "V1.0") ;
        builder.withDetail("author", "sss") ;
    }
}
