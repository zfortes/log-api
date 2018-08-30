package com.fortes.log.api.data;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.solr.repository.config.EnableSolrRepositories;
//
//import javax.annotation.Resource;
//
//@Configuration
//@EnableSolrRepositories(basePackages={"com.doj.app.solr"}, multicoreSupport=true)
//public class SolrConfig {
//
//    static final String SOLR_HOST = "solr.host";
//
//    @Resource
//    private Environment environment;
//
//    @Bean
//    public SolrServer solrServer() {
//        String solrHost = environment.getRequiredProperty(SOLR_HOST);
//        return new HttpSolrServer(solrHost);
//    }
//}