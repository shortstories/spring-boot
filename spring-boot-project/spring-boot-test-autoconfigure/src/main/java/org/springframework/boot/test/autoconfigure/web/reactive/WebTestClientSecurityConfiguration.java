/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.test.autoconfigure.web.reactive;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.test.web.reactive.server.SecurityMockServerConfigurers;
import org.springframework.security.web.server.WebFilterChainProxy;
import org.springframework.test.web.reactive.server.MockServerConfigurer;

/**
 * Auto-configuration for Spring Security's testing support.
 *
 * @author OhChang Kwon(ohchang.kwon@navercorp.com)
 * @since 2.1.0
 */
@Configuration
public class WebTestClientSecurityConfiguration {

	@ConditionalOnBean(WebFilterChainProxy.class)
	@Bean
	public MockServerConfigurer configurer() {
		return SecurityMockServerConfigurers.springSecurity();
	}

}
