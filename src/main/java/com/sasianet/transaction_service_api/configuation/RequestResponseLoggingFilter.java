package com.sasianet.transaction_service_api.configuation;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class RequestResponseLoggingFilter implements Filter {
	private static final Logger logger = LoggerFactory.getLogger(RequestResponseLoggingFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// Initialization code if needed
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		CustomHttpServletRequestWrapper requestWrapper = new CustomHttpServletRequestWrapper(httpRequest);

		HttpServletResponse httpResponse = (HttpServletResponse) response;
		CustomHttpServletResponseWrapper responseWrapper = new CustomHttpServletResponseWrapper(httpResponse);

		// Log request body
		logger.info("Transaction Request Body: {}", requestWrapper.getBody());
		// Proceed with the filter chain
		chain.doFilter(requestWrapper, responseWrapper);
		// Log response body
		byte[] responseBody = responseWrapper.getResponseBody();
		logger.info("Transaction Response Body: {}", new String(responseBody, StandardCharsets.UTF_8));

		// Copy response body to original output stream
		responseWrapper.copyBodyToOriginalOutputStream();
	}

	@Override
	public void destroy() {
		// Cleanup code if needed
	}
}
