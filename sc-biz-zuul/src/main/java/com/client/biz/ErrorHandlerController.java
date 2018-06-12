package com.client.biz;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

@Component
public class ErrorHandlerController {
	/**
	 * 返回值表示需要针对此微服务做回退处理（该名称一定要是注册进入 eureka 微服务中的那个 serviceId 名称）；
	 *
	 * @return
	 */

	public String getRoute() {
		return "biz-server";
	}

	public ClientHttpResponse fallbackResponse() {
		return new ClientHttpResponse() {

			@Override
			public HttpStatus getStatusCode() throws IOException {
				return HttpStatus.BAD_REQUEST;
			}

			@Override
			public int getRawStatusCode() throws IOException {
				return HttpStatus.BAD_REQUEST.value();
			}

			@Override
			public String getStatusText() throws IOException {
				return HttpStatus.BAD_REQUEST.getReasonPhrase();
			}

			@Override
			public void close() {
			}

			/**
			 * 当 springms-provider-user 微服务出现宕机后，客户端再请求时候就会返回 fallback
			 * 等字样的字符串提示；
			 *
			 * 但对于复杂一点的微服务，我们这里就得好好琢磨该怎么友好提示给用户了；
			 *
			 * @return
			 * @throws IOException
			 */

			@Override
			public InputStream getBody() throws IOException {
				return new ByteArrayInputStream((getRoute() + " fallback").getBytes());
			}

			@Override
			public HttpHeaders getHeaders() {
				HttpHeaders headers = new HttpHeaders();
				headers.setContentType(MediaType.APPLICATION_JSON);
				return headers;
			}
		};
	}
}
