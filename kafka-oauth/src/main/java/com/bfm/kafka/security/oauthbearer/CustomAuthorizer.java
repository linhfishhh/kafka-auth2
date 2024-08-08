/*
Copyright © 2020 BlackRock Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package com.bfm.kafka.security.oauthbearer;



import org.apache.kafka.common.Endpoint;
import org.apache.kafka.common.acl.AclBinding;
import org.apache.kafka.common.acl.AclBindingFilter;
import org.apache.kafka.common.security.auth.KafkaPrincipal;
import org.apache.kafka.server.authorizer.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import scala.collection.immutable.Set;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;

/**
 * The type Oauth authorizer.
 */
public class CustomAuthorizer implements Authorizer {
	private static final Logger log = LoggerFactory.getLogger(CustomAuthorizer.class);

	@Override
	public Map<Endpoint, ? extends CompletionStage<Void>> start(AuthorizerServerInfo serverInfo) {
		return null;
	}

	@Override
	public List<AuthorizationResult> authorize(AuthorizableRequestContext requestContext, List<Action> actions) {
		return null;
	}

	@Override
	public List<? extends CompletionStage<AclCreateResult>> createAcls(AuthorizableRequestContext requestContext, List<AclBinding> aclBindings) {
		return null;
	}

	@Override
	public List<? extends CompletionStage<AclDeleteResult>> deleteAcls(AuthorizableRequestContext requestContext, List<AclBindingFilter> aclBindingFilters) {
		return null;
	}

	@Override
	public Iterable<AclBinding> acls(AclBindingFilter filter) {
		return null;
	}

	@Override
	public void close() throws IOException {

	}

	@Override
	public void configure(Map<String, ?> configs) {

	}
}
