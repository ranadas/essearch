package com.rdas.es.config

import org.elasticsearch.client.RestHighLevelClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.RestClients
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration
import org.springframework.data.elasticsearch.core.ElasticsearchOperations
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate

@Configuration
class RestClientConfig : AbstractElasticsearchConfiguration() {

    @Value("\${spring.elasticsearch.uris}")
    private val esServerHost: String? = null

//    @Bean
//    fun client() :RestHighLevelClient {
//        var clientConfiguration: ClientConfiguration = ClientConfiguration.builder().connectedTo(esServerHost).build()
//        return RestClients.create(clientConfiguration).rest()
//    }
//
//    @Bean
//    fun elasticsearchTemplate(): ElasticsearchOperations {
//        return ElasticsearchRestTemplate(client())
//    }

    @Bean
    override fun elasticsearchClient(): RestHighLevelClient {
//        val host = "localhost"
//        val port = 9200
//        val user = "elastic"
//        val password = "mypassword"
//
//        val credentialsProvider = BasicCredentialsProvider()
//        credentialsProvider.setCredentials(AuthScope.ANY, UsernamePasswordCredentials(user, password))
//
//        var context: SSLContext? = null
//
//        // CREATE A KEYSTORE OF TYPE "pkcs12"
//        val ks = KeyStore.getInstance("pkcs12")
//
//        /*
//         * LOAD THE STORE
//         * The first time you're doing this (i.e. the keystore does not
//         * yet exist - you're creating it), you HAVE to load the keystore
//         * from a null source with null password. Before any methods can
//         * be called on your keystore you HAVE to load it first. Loading
//         * it from a null source and null password simply creates an empty
//         * keystore. At a later time, when you want to verify the keystore
//         * or get certificates (or whatever) you can load it from the
//         * file with your password.
//         */
//        ks.load(null, null)
//
//        // GET THE FILE CONTAINING YOUR CERTIFICATE
//        val fis = FileInputStream("/Users/raphaeldelio/ca.crt")
//        val bis = BufferedInputStream(fis)
//
//        // .crt is an extension of X.509 type
//        val cf: CertificateFactory = CertificateFactory.getInstance("X.509")
//        val cert = cf.generateCertificate(bis)
//
//        //ADD TO THE KEYSTORE AND GIVE IT AN ALIAS NAME
//        ks.setCertificateEntry("ca", cert)
//
//        // INIT A TRUST MANAGER FACTORY
//        val tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm())
//        tmf.init(ks)
//
//        // INIT A SSLCONTEXT
//        context = SSLContext.getInstance("TLS")
//        context.init(null, tmf.trustManagers, null)
//
//        // BUILD A REST CLIENT WITH THE CREDENTIALS PROVIDER AND THE SSL CONTEXT INITIALIZED PREVIOUSLY
//        val restClientBuilder = RestClient.builder(
//            HttpHost(host, port, "https")
//        ).setHttpClientConfigCallback { httpClientBuilder: HttpAsyncClientBuilder ->
//            httpClientBuilder.setDefaultCredentialsProvider(credentialsProvider)
//            httpClientBuilder.setSSLContext(context)
//        }
//        return RestHighLevelClient(restClientBuilder)

        var clientConfiguration: ClientConfiguration = ClientConfiguration.builder().connectedTo(esServerHost).build()
        return RestClients.create(clientConfiguration).rest()
    }

}