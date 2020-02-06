/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.salesforce.SalesforceComponent;

/**
 * The salesforce component is used for integrating Camel with the massive
 * Salesforce API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SalesforceComponentBuilderFactory {

    /**
     * Salesforce (camel-salesforce)
     * The salesforce component is used for integrating Camel with the massive
     * Salesforce API.
     * 
     * Category: api,cloud,crm
     * Since: 2.12
     * Maven coordinates: org.apache.camel:camel-salesforce
     */
    static SalesforceComponentBuilder salesforce() {
        return new SalesforceComponentBuilderImpl();
    }

    /**
     * Builder for the Salesforce component.
     */
    interface SalesforceComponentBuilder
            extends
                ComponentBuilder<SalesforceComponent> {
        /**
         * Explicit authentication method to be used, one of USERNAME_PASSWORD,
         * REFRESH_TOKEN or JWT. Salesforce component can auto-determine the
         * authentication method to use from the properties set, set this
         * property to eliminate any ambiguity.
         * 
         * The option is a:
         * <code>org.apache.camel.component.salesforce.AuthenticationType</code>
         * type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder authenticationType(
                org.apache.camel.component.salesforce.AuthenticationType authenticationType) {
            doSetProperty("authenticationType", authenticationType);
            return this;
        }
        /**
         * All authentication configuration in one nested bean, all properties
         * set there can be set directly on the component as well.
         * 
         * The option is a:
         * <code>org.apache.camel.component.salesforce.SalesforceLoginConfig</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder loginConfig(
                org.apache.camel.component.salesforce.SalesforceLoginConfig loginConfig) {
            doSetProperty("loginConfig", loginConfig);
            return this;
        }
        /**
         * URL of the Salesforce instance used after authentication, by default
         * received from Salesforce on successful authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder instanceUrl(
                java.lang.String instanceUrl) {
            doSetProperty("instanceUrl", instanceUrl);
            return this;
        }
        /**
         * URL of the Salesforce instance used for authentication, by default
         * set to https://login.salesforce.com.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: https://login.salesforce.com
         * Group: security
         */
        default SalesforceComponentBuilder loginUrl(java.lang.String loginUrl) {
            doSetProperty("loginUrl", loginUrl);
            return this;
        }
        /**
         * OAuth Consumer Key of the connected app configured in the Salesforce
         * instance setup. Typically a connected app needs to be configured but
         * one can be provided by installing a package.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder clientId(java.lang.String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * OAuth Consumer Secret of the connected app configured in the
         * Salesforce instance setup.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder clientSecret(
                java.lang.String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * KeyStore parameters to use in OAuth JWT flow. The KeyStore should
         * contain only one entry with private key and certificate. Salesforce
         * does not verify the certificate chain, so this can easily be a
         * selfsigned certificate. Make sure that you upload the certificate to
         * the corresponding connected app.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.KeyStoreParameters</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder keystore(
                org.apache.camel.support.jsse.KeyStoreParameters keystore) {
            doSetProperty("keystore", keystore);
            return this;
        }
        /**
         * Refresh token already obtained in the refresh token OAuth flow. One
         * needs to setup a web application and configure a callback URL to
         * receive the refresh token, or configure using the builtin callback at
         * https://login.salesforce.com/services/oauth2/success or
         * https://test.salesforce.com/services/oauth2/success and then retrive
         * the refresh_token from the URL at the end of the flow. Note that in
         * development organizations Salesforce allows hosting the callback web
         * application at localhost.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder refreshToken(
                java.lang.String refreshToken) {
            doSetProperty("refreshToken", refreshToken);
            return this;
        }
        /**
         * Username used in OAuth flow to gain access to access token. It's easy
         * to get started with password OAuth flow, but in general one should
         * avoid it as it is deemed less secure than other flows.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder userName(java.lang.String userName) {
            doSetProperty("userName", userName);
            return this;
        }
        /**
         * Password used in OAuth flow to gain access to access token. It's easy
         * to get started with password OAuth flow, but in general one should
         * avoid it as it is deemed less secure than other flows. Make sure that
         * you append security token to the end of the password if using one.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * If set to true prevents the component from authenticating to
         * Salesforce with the start of the component. You would generally set
         * this to the (default) false and authenticate early and be immediately
         * aware of any authentication issues.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default SalesforceComponentBuilder lazyLogin(boolean lazyLogin) {
            doSetProperty("lazyLogin", lazyLogin);
            return this;
        }
        /**
         * Global endpoint configuration - use to set values that are common to
         * all endpoints.
         * 
         * The option is a:
         * <code>org.apache.camel.component.salesforce.SalesforceEndpointConfig</code> type.
         * 
         * Group: common (advanced)
         */
        default SalesforceComponentBuilder config(
                org.apache.camel.component.salesforce.SalesforceEndpointConfig config) {
            doSetProperty("config", config);
            return this;
        }
        /**
         * Used to set any properties that can be configured on the underlying
         * HTTP client. Have a look at properties of SalesforceHttpClient and
         * the Jetty HttpClient for all available options.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         * 
         * Group: common (advanced)
         */
        default SalesforceComponentBuilder httpClientProperties(
                java.util.Map<java.lang.String, java.lang.Object> httpClientProperties) {
            doSetProperty("httpClientProperties", httpClientProperties);
            return this;
        }
        /**
         * Used to set any properties that can be configured on the
         * LongPollingTransport used by the BayeuxClient (CometD) used by the
         * streaming api.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         * 
         * Group: common (advanced)
         */
        default SalesforceComponentBuilder longPollingTransportProperties(
                java.util.Map<java.lang.String, java.lang.Object> longPollingTransportProperties) {
            doSetProperty("longPollingTransportProperties", longPollingTransportProperties);
            return this;
        }
        /**
         * SSL parameters to use, see SSLContextParameters class for all
         * available options.
         * 
         * The option is a:
         * <code>org.apache.camel.support.jsse.SSLContextParameters</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default SalesforceComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
        /**
         * Timeout used by the HttpClient when waiting for response from the
         * Salesforce server.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 10000
         * Group: common
         */
        default SalesforceComponentBuilder httpClientIdleTimeout(
                long httpClientIdleTimeout) {
            doSetProperty("httpClientIdleTimeout", httpClientIdleTimeout);
            return this;
        }
        /**
         * Connection timeout used by the HttpClient when connecting to the
         * Salesforce server.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 60000
         * Group: common
         */
        default SalesforceComponentBuilder httpClientConnectionTimeout(
                long httpClientConnectionTimeout) {
            doSetProperty("httpClientConnectionTimeout", httpClientConnectionTimeout);
            return this;
        }
        /**
         * Max content length of an HTTP response.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: common
         */
        default SalesforceComponentBuilder httpMaxContentLength(
                java.lang.Integer httpMaxContentLength) {
            doSetProperty("httpMaxContentLength", httpMaxContentLength);
            return this;
        }
        /**
         * Hostname of the HTTP proxy server to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default SalesforceComponentBuilder httpProxyHost(
                java.lang.String httpProxyHost) {
            doSetProperty("httpProxyHost", httpProxyHost);
            return this;
        }
        /**
         * Port number of the HTTP proxy server to use.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default SalesforceComponentBuilder httpProxyPort(
                java.lang.Integer httpProxyPort) {
            doSetProperty("httpProxyPort", httpProxyPort);
            return this;
        }
        /**
         * Username to use to authenticate against the HTTP proxy server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder httpProxyUsername(
                java.lang.String httpProxyUsername) {
            doSetProperty("httpProxyUsername", httpProxyUsername);
            return this;
        }
        /**
         * Password to use to authenticate against the HTTP proxy server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder httpProxyPassword(
                java.lang.String httpProxyPassword) {
            doSetProperty("httpProxyPassword", httpProxyPassword);
            return this;
        }
        /**
         * If set to true the configures the HTTP proxy to use as a SOCKS4
         * proxy.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: proxy
         */
        default SalesforceComponentBuilder isHttpProxySocks4(
                boolean isHttpProxySocks4) {
            doSetProperty("isHttpProxySocks4", isHttpProxySocks4);
            return this;
        }
        /**
         * If set to false disables the use of TLS when accessing the HTTP
         * proxy.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: security
         */
        default SalesforceComponentBuilder isHttpProxySecure(
                boolean isHttpProxySecure) {
            doSetProperty("isHttpProxySecure", isHttpProxySecure);
            return this;
        }
        /**
         * A list of addresses for which HTTP proxy server should be used.
         * 
         * The option is a: <code>java.util.Set<java.lang.String></code> type.
         * 
         * Group: proxy
         */
        default SalesforceComponentBuilder httpProxyIncludedAddresses(
                java.util.Set<java.lang.String> httpProxyIncludedAddresses) {
            doSetProperty("httpProxyIncludedAddresses", httpProxyIncludedAddresses);
            return this;
        }
        /**
         * A list of addresses for which HTTP proxy server should not be used.
         * 
         * The option is a: <code>java.util.Set<java.lang.String></code> type.
         * 
         * Group: proxy
         */
        default SalesforceComponentBuilder httpProxyExcludedAddresses(
                java.util.Set<java.lang.String> httpProxyExcludedAddresses) {
            doSetProperty("httpProxyExcludedAddresses", httpProxyExcludedAddresses);
            return this;
        }
        /**
         * Used in authentication against the HTTP proxy server, needs to match
         * the URI of the proxy server in order for the httpProxyUsername and
         * httpProxyPassword to be used for authentication.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder httpProxyAuthUri(
                java.lang.String httpProxyAuthUri) {
            doSetProperty("httpProxyAuthUri", httpProxyAuthUri);
            return this;
        }
        /**
         * Realm of the proxy server, used in preemptive Basic/Digest
         * authentication methods against the HTTP proxy server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default SalesforceComponentBuilder httpProxyRealm(
                java.lang.String httpProxyRealm) {
            doSetProperty("httpProxyRealm", httpProxyRealm);
            return this;
        }
        /**
         * If set to true Digest authentication will be used when authenticating
         * to the HTTP proxy, otherwise Basic authorization method will be used.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: security
         */
        default SalesforceComponentBuilder httpProxyUseDigestAuth(
                boolean httpProxyUseDigestAuth) {
            doSetProperty("httpProxyUseDigestAuth", httpProxyUseDigestAuth);
            return this;
        }
        /**
         * In what packages are the generated DTO classes. Typically the classes
         * would be generated using camel-salesforce-maven-plugin. Set it if
         * using the generated DTOs to gain the benefit of using short SObject
         * names in parameters/header values.
         * 
         * The option is a: <code>java.lang.String[]</code> type.
         * 
         * Group: common
         */
        default SalesforceComponentBuilder packages(java.lang.String[] packages) {
            doSetProperty("packages", packages);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default SalesforceComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default SalesforceComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SalesforceComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class SalesforceComponentBuilderImpl
            extends
                AbstractComponentBuilder<SalesforceComponent>
            implements
                SalesforceComponentBuilder {
        @Override
        protected SalesforceComponent buildConcreteComponent() {
            return new SalesforceComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "authenticationType": ((SalesforceComponent) component).setAuthenticationType((org.apache.camel.component.salesforce.AuthenticationType) value); return true;
            case "loginConfig": ((SalesforceComponent) component).setLoginConfig((org.apache.camel.component.salesforce.SalesforceLoginConfig) value); return true;
            case "instanceUrl": ((SalesforceComponent) component).setInstanceUrl((java.lang.String) value); return true;
            case "loginUrl": ((SalesforceComponent) component).setLoginUrl((java.lang.String) value); return true;
            case "clientId": ((SalesforceComponent) component).setClientId((java.lang.String) value); return true;
            case "clientSecret": ((SalesforceComponent) component).setClientSecret((java.lang.String) value); return true;
            case "keystore": ((SalesforceComponent) component).setKeystore((org.apache.camel.support.jsse.KeyStoreParameters) value); return true;
            case "refreshToken": ((SalesforceComponent) component).setRefreshToken((java.lang.String) value); return true;
            case "userName": ((SalesforceComponent) component).setUserName((java.lang.String) value); return true;
            case "password": ((SalesforceComponent) component).setPassword((java.lang.String) value); return true;
            case "lazyLogin": ((SalesforceComponent) component).setLazyLogin((boolean) value); return true;
            case "config": ((SalesforceComponent) component).setConfig((org.apache.camel.component.salesforce.SalesforceEndpointConfig) value); return true;
            case "httpClientProperties": ((SalesforceComponent) component).setHttpClientProperties((java.util.Map<java.lang.String, java.lang.Object>) value); return true;
            case "longPollingTransportProperties": ((SalesforceComponent) component).setLongPollingTransportProperties((java.util.Map<java.lang.String, java.lang.Object>) value); return true;
            case "sslContextParameters": ((SalesforceComponent) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "useGlobalSslContextParameters": ((SalesforceComponent) component).setUseGlobalSslContextParameters((boolean) value); return true;
            case "httpClientIdleTimeout": ((SalesforceComponent) component).setHttpClientIdleTimeout((long) value); return true;
            case "httpClientConnectionTimeout": ((SalesforceComponent) component).setHttpClientConnectionTimeout((long) value); return true;
            case "httpMaxContentLength": ((SalesforceComponent) component).setHttpMaxContentLength((java.lang.Integer) value); return true;
            case "httpProxyHost": ((SalesforceComponent) component).setHttpProxyHost((java.lang.String) value); return true;
            case "httpProxyPort": ((SalesforceComponent) component).setHttpProxyPort((java.lang.Integer) value); return true;
            case "httpProxyUsername": ((SalesforceComponent) component).setHttpProxyUsername((java.lang.String) value); return true;
            case "httpProxyPassword": ((SalesforceComponent) component).setHttpProxyPassword((java.lang.String) value); return true;
            case "isHttpProxySocks4": ((SalesforceComponent) component).setIsHttpProxySocks4((boolean) value); return true;
            case "isHttpProxySecure": ((SalesforceComponent) component).setIsHttpProxySecure((boolean) value); return true;
            case "httpProxyIncludedAddresses": ((SalesforceComponent) component).setHttpProxyIncludedAddresses((java.util.Set<java.lang.String>) value); return true;
            case "httpProxyExcludedAddresses": ((SalesforceComponent) component).setHttpProxyExcludedAddresses((java.util.Set<java.lang.String>) value); return true;
            case "httpProxyAuthUri": ((SalesforceComponent) component).setHttpProxyAuthUri((java.lang.String) value); return true;
            case "httpProxyRealm": ((SalesforceComponent) component).setHttpProxyRealm((java.lang.String) value); return true;
            case "httpProxyUseDigestAuth": ((SalesforceComponent) component).setHttpProxyUseDigestAuth((boolean) value); return true;
            case "packages": ((SalesforceComponent) component).setPackages((java.lang.String[]) value); return true;
            case "basicPropertyBinding": ((SalesforceComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "lazyStartProducer": ((SalesforceComponent) component).setLazyStartProducer((boolean) value); return true;
            case "bridgeErrorHandler": ((SalesforceComponent) component).setBridgeErrorHandler((boolean) value); return true;
            default: return false;
            }
        }
    }
}