package com.nettuf.cursomc.services;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class S3Service {

	private Logger LOG = LoggerFactory.getLogger(S3Service.class);
	
	@Autowired
	private AmazonS3 s3client;
	
	@Value("${s3.bucket}")
	private String bucketName;
	
	public void uploadFile(String localFilePath) {
		try {
		File file = new File(localFilePath);
		s3client.putObject(new PutObjectRequest(bucketName, "teste", file));
	}
		catch(AmazonServiceException e) {
			LOG.info("Exception Error");
		}
		catch(AmazonClientException e) {
			LOG.info("Exception Error");
		}
	}
}
