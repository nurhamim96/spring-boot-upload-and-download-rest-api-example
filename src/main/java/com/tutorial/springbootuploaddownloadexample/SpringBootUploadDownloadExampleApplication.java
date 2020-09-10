package com.tutorial.springbootuploaddownloadexample;

import com.tutorial.springbootuploaddownloadexample.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class SpringBootUploadDownloadExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadDownloadExampleApplication.class, args);
	}

}
