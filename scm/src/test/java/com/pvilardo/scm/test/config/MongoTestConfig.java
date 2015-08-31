package com.pvilardo.scm.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.github.fakemongo.Fongo;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories("com.pvilardo.scm.repository")
@ComponentScan( basePackages
		= {"com.pvilardo.scm.services",
		"com.pvilardo.scm.services.impl","com.pvilardo.scm.model"
		})
public class MongoTestConfig extends AbstractMongoConfiguration {

	
	@Bean
	public GridFsTemplate gridFsTemplate() throws Exception {
		return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
	}
 
	
    @Override
    protected String getDatabaseName() {
        return "local";
    }

    @Override
    public Mongo mongo() throws Exception {
    	
        return (new Fongo("Test")).getMongo();
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.pvilardo.scm.repository";
    }
}
