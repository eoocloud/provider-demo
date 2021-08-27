package com.shendu.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
@RefreshScope
public class ProviderController {

	@Value("${provider.name:default}")
	private String providerName;
	
	@GetMapping("/test")
	public String test() {
		return "I am " + providerName;
	}
}
