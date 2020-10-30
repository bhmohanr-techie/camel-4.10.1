/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.main;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.main.MainConfigurationProperties;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MainConfigurationPropertiesConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AllowUseOriginalMessage", boolean.class);
        map.put("AutoConfigurationEnabled", boolean.class);
        map.put("AutoConfigurationEnvironmentVariablesEnabled", boolean.class);
        map.put("AutoConfigurationFailFast", boolean.class);
        map.put("AutoConfigurationLogSummary", boolean.class);
        map.put("AutoStartup", boolean.class);
        map.put("AutowireComponentProperties", boolean.class);
        map.put("AutowireComponentPropertiesAllowPrivateSetter", boolean.class);
        map.put("AutowireComponentPropertiesDeep", boolean.class);
        map.put("AutowireComponentPropertiesNonNullOnly", boolean.class);
        map.put("BacklogTracing", boolean.class);
        map.put("BeanIntrospectionExtendedStatistics", boolean.class);
        map.put("BeanIntrospectionLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("BeanPostProcessorEnabled", boolean.class);
        map.put("CaseInsensitiveHeaders", boolean.class);
        map.put("ClearReifiers", boolean.class);
        map.put("ConfigurationClasses", java.lang.String.class);
        map.put("Configurations", java.util.List.class);
        map.put("ConsumerTemplateCacheSize", int.class);
        map.put("DurationHitExitCode", int.class);
        map.put("DurationMaxIdleSeconds", int.class);
        map.put("DurationMaxMessages", int.class);
        map.put("DurationMaxSeconds", int.class);
        map.put("EndpointBasicPropertyBinding", boolean.class);
        map.put("EndpointBridgeErrorHandler", boolean.class);
        map.put("EndpointLazyStartProducer", boolean.class);
        map.put("EndpointRuntimeStatisticsEnabled", boolean.class);
        map.put("FileConfigurations", java.lang.String.class);
        map.put("InflightRepositoryBrowseEnabled", boolean.class);
        map.put("JavaRoutesExcludePattern", java.lang.String.class);
        map.put("JavaRoutesIncludePattern", java.lang.String.class);
        map.put("JmxEnabled", boolean.class);
        map.put("JmxManagementNamePattern", java.lang.String.class);
        map.put("JmxManagementStatisticsLevel", org.apache.camel.ManagementStatisticsLevel.class);
        map.put("Lightweight", boolean.class);
        map.put("LoadTypeConverters", boolean.class);
        map.put("LogDebugMaxChars", int.class);
        map.put("LogExhaustedMessageBody", boolean.class);
        map.put("LogMask", boolean.class);
        map.put("MdcLoggingKeysPattern", java.lang.String.class);
        map.put("MessageHistory", boolean.class);
        map.put("Name", java.lang.String.class);
        map.put("PackageScanRouteBuilders", java.lang.String.class);
        map.put("ProducerTemplateCacheSize", int.class);
        map.put("RouteControllerBackOffDelay", long.class);
        map.put("RouteControllerBackOffMaxAttempts", long.class);
        map.put("RouteControllerBackOffMaxDelay", long.class);
        map.put("RouteControllerBackOffMaxElapsedTime", long.class);
        map.put("RouteControllerBackOffMultiplier", double.class);
        map.put("RouteControllerExcludeRoutes", java.lang.String.class);
        map.put("RouteControllerIncludeRoutes", java.lang.String.class);
        map.put("RouteControllerInitialDelay", long.class);
        map.put("RouteControllerRouteStartupLoggingLevel", org.apache.camel.LoggingLevel.class);
        map.put("RouteControllerSuperviseEnabled", boolean.class);
        map.put("RouteControllerThreadPoolSize", int.class);
        map.put("RouteControllerUnhealthyOnExhausted", boolean.class);
        map.put("RouteFilterExcludePattern", java.lang.String.class);
        map.put("RouteFilterIncludePattern", java.lang.String.class);
        map.put("RoutesBuilderClasses", java.lang.String.class);
        map.put("RoutesBuilders", java.util.List.class);
        map.put("RoutesCollectorEnabled", boolean.class);
        map.put("ShutdownLogInflightExchangesOnTimeout", boolean.class);
        map.put("ShutdownNowOnTimeout", boolean.class);
        map.put("ShutdownRoutesInReverseOrder", boolean.class);
        map.put("ShutdownSuppressLoggingOnTimeout", boolean.class);
        map.put("ShutdownTimeout", int.class);
        map.put("StreamCachingAnySpoolRules", boolean.class);
        map.put("StreamCachingBufferSize", int.class);
        map.put("StreamCachingEnabled", boolean.class);
        map.put("StreamCachingRemoveSpoolDirectoryWhenStopping", boolean.class);
        map.put("StreamCachingSpoolCipher", java.lang.String.class);
        map.put("StreamCachingSpoolDirectory", java.lang.String.class);
        map.put("StreamCachingSpoolThreshold", long.class);
        map.put("StreamCachingSpoolUsedHeapMemoryLimit", java.lang.String.class);
        map.put("StreamCachingSpoolUsedHeapMemoryThreshold", int.class);
        map.put("StreamCachingStatisticsEnabled", boolean.class);
        map.put("ThreadNamePattern", java.lang.String.class);
        map.put("Tracing", boolean.class);
        map.put("TracingPattern", java.lang.String.class);
        map.put("UseBreadcrumb", boolean.class);
        map.put("UseDataType", boolean.class);
        map.put("UseMdcLogging", boolean.class);
        map.put("XmlRests", java.lang.String.class);
        map.put("XmlRouteTemplates", java.lang.String.class);
        map.put("XmlRoutes", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.main.MainConfigurationProperties target = (org.apache.camel.main.MainConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "AllowUseOriginalMessage": target.setAllowUseOriginalMessage(property(camelContext, boolean.class, value)); return true;
        case "autoconfigurationenabled":
        case "AutoConfigurationEnabled": target.setAutoConfigurationEnabled(property(camelContext, boolean.class, value)); return true;
        case "autoconfigurationenvironmentvariablesenabled":
        case "AutoConfigurationEnvironmentVariablesEnabled": target.setAutoConfigurationEnvironmentVariablesEnabled(property(camelContext, boolean.class, value)); return true;
        case "autoconfigurationfailfast":
        case "AutoConfigurationFailFast": target.setAutoConfigurationFailFast(property(camelContext, boolean.class, value)); return true;
        case "autoconfigurationlogsummary":
        case "AutoConfigurationLogSummary": target.setAutoConfigurationLogSummary(property(camelContext, boolean.class, value)); return true;
        case "autostartup":
        case "AutoStartup": target.setAutoStartup(property(camelContext, boolean.class, value)); return true;
        case "autowirecomponentproperties":
        case "AutowireComponentProperties": target.setAutowireComponentProperties(property(camelContext, boolean.class, value)); return true;
        case "autowirecomponentpropertiesallowprivatesetter":
        case "AutowireComponentPropertiesAllowPrivateSetter": target.setAutowireComponentPropertiesAllowPrivateSetter(property(camelContext, boolean.class, value)); return true;
        case "autowirecomponentpropertiesdeep":
        case "AutowireComponentPropertiesDeep": target.setAutowireComponentPropertiesDeep(property(camelContext, boolean.class, value)); return true;
        case "autowirecomponentpropertiesnonnullonly":
        case "AutowireComponentPropertiesNonNullOnly": target.setAutowireComponentPropertiesNonNullOnly(property(camelContext, boolean.class, value)); return true;
        case "backlogtracing":
        case "BacklogTracing": target.setBacklogTracing(property(camelContext, boolean.class, value)); return true;
        case "beanintrospectionextendedstatistics":
        case "BeanIntrospectionExtendedStatistics": target.setBeanIntrospectionExtendedStatistics(property(camelContext, boolean.class, value)); return true;
        case "beanintrospectionlogginglevel":
        case "BeanIntrospectionLoggingLevel": target.setBeanIntrospectionLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "beanpostprocessorenabled":
        case "BeanPostProcessorEnabled": target.setBeanPostProcessorEnabled(property(camelContext, boolean.class, value)); return true;
        case "caseinsensitiveheaders":
        case "CaseInsensitiveHeaders": target.setCaseInsensitiveHeaders(property(camelContext, boolean.class, value)); return true;
        case "clearreifiers":
        case "ClearReifiers": target.setClearReifiers(property(camelContext, boolean.class, value)); return true;
        case "configurationclasses":
        case "ConfigurationClasses": target.setConfigurationClasses(property(camelContext, java.lang.String.class, value)); return true;
        case "configurations":
        case "Configurations": target.setConfigurations(property(camelContext, java.util.List.class, value)); return true;
        case "consumertemplatecachesize":
        case "ConsumerTemplateCacheSize": target.setConsumerTemplateCacheSize(property(camelContext, int.class, value)); return true;
        case "durationhitexitcode":
        case "DurationHitExitCode": target.setDurationHitExitCode(property(camelContext, int.class, value)); return true;
        case "durationmaxidleseconds":
        case "DurationMaxIdleSeconds": target.setDurationMaxIdleSeconds(property(camelContext, int.class, value)); return true;
        case "durationmaxmessages":
        case "DurationMaxMessages": target.setDurationMaxMessages(property(camelContext, int.class, value)); return true;
        case "durationmaxseconds":
        case "DurationMaxSeconds": target.setDurationMaxSeconds(property(camelContext, int.class, value)); return true;
        case "endpointbasicpropertybinding":
        case "EndpointBasicPropertyBinding": target.setEndpointBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "endpointbridgeerrorhandler":
        case "EndpointBridgeErrorHandler": target.setEndpointBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "endpointlazystartproducer":
        case "EndpointLazyStartProducer": target.setEndpointLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "endpointruntimestatisticsenabled":
        case "EndpointRuntimeStatisticsEnabled": target.setEndpointRuntimeStatisticsEnabled(property(camelContext, boolean.class, value)); return true;
        case "fileconfigurations":
        case "FileConfigurations": target.setFileConfigurations(property(camelContext, java.lang.String.class, value)); return true;
        case "inflightrepositorybrowseenabled":
        case "InflightRepositoryBrowseEnabled": target.setInflightRepositoryBrowseEnabled(property(camelContext, boolean.class, value)); return true;
        case "javaroutesexcludepattern":
        case "JavaRoutesExcludePattern": target.setJavaRoutesExcludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "javaroutesincludepattern":
        case "JavaRoutesIncludePattern": target.setJavaRoutesIncludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "jmxenabled":
        case "JmxEnabled": target.setJmxEnabled(property(camelContext, boolean.class, value)); return true;
        case "jmxmanagementnamepattern":
        case "JmxManagementNamePattern": target.setJmxManagementNamePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "jmxmanagementstatisticslevel":
        case "JmxManagementStatisticsLevel": target.setJmxManagementStatisticsLevel(property(camelContext, org.apache.camel.ManagementStatisticsLevel.class, value)); return true;
        case "lightweight":
        case "Lightweight": target.setLightweight(property(camelContext, boolean.class, value)); return true;
        case "loadtypeconverters":
        case "LoadTypeConverters": target.setLoadTypeConverters(property(camelContext, boolean.class, value)); return true;
        case "logdebugmaxchars":
        case "LogDebugMaxChars": target.setLogDebugMaxChars(property(camelContext, int.class, value)); return true;
        case "logexhaustedmessagebody":
        case "LogExhaustedMessageBody": target.setLogExhaustedMessageBody(property(camelContext, boolean.class, value)); return true;
        case "logmask":
        case "LogMask": target.setLogMask(property(camelContext, boolean.class, value)); return true;
        case "mdcloggingkeyspattern":
        case "MdcLoggingKeysPattern": target.setMdcLoggingKeysPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "messagehistory":
        case "MessageHistory": target.setMessageHistory(property(camelContext, boolean.class, value)); return true;
        case "name":
        case "Name": target.setName(property(camelContext, java.lang.String.class, value)); return true;
        case "packagescanroutebuilders":
        case "PackageScanRouteBuilders": target.setPackageScanRouteBuilders(property(camelContext, java.lang.String.class, value)); return true;
        case "producertemplatecachesize":
        case "ProducerTemplateCacheSize": target.setProducerTemplateCacheSize(property(camelContext, int.class, value)); return true;
        case "routecontrollerbackoffdelay":
        case "RouteControllerBackOffDelay": target.setRouteControllerBackOffDelay(property(camelContext, long.class, value)); return true;
        case "routecontrollerbackoffmaxattempts":
        case "RouteControllerBackOffMaxAttempts": target.setRouteControllerBackOffMaxAttempts(property(camelContext, long.class, value)); return true;
        case "routecontrollerbackoffmaxdelay":
        case "RouteControllerBackOffMaxDelay": target.setRouteControllerBackOffMaxDelay(property(camelContext, long.class, value)); return true;
        case "routecontrollerbackoffmaxelapsedtime":
        case "RouteControllerBackOffMaxElapsedTime": target.setRouteControllerBackOffMaxElapsedTime(property(camelContext, long.class, value)); return true;
        case "routecontrollerbackoffmultiplier":
        case "RouteControllerBackOffMultiplier": target.setRouteControllerBackOffMultiplier(property(camelContext, double.class, value)); return true;
        case "routecontrollerexcluderoutes":
        case "RouteControllerExcludeRoutes": target.setRouteControllerExcludeRoutes(property(camelContext, java.lang.String.class, value)); return true;
        case "routecontrollerincluderoutes":
        case "RouteControllerIncludeRoutes": target.setRouteControllerIncludeRoutes(property(camelContext, java.lang.String.class, value)); return true;
        case "routecontrollerinitialdelay":
        case "RouteControllerInitialDelay": target.setRouteControllerInitialDelay(property(camelContext, long.class, value)); return true;
        case "routecontrollerroutestartuplogginglevel":
        case "RouteControllerRouteStartupLoggingLevel": target.setRouteControllerRouteStartupLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "routecontrollersuperviseenabled":
        case "RouteControllerSuperviseEnabled": target.setRouteControllerSuperviseEnabled(property(camelContext, boolean.class, value)); return true;
        case "routecontrollerthreadpoolsize":
        case "RouteControllerThreadPoolSize": target.setRouteControllerThreadPoolSize(property(camelContext, int.class, value)); return true;
        case "routecontrollerunhealthyonexhausted":
        case "RouteControllerUnhealthyOnExhausted": target.setRouteControllerUnhealthyOnExhausted(property(camelContext, boolean.class, value)); return true;
        case "routefilterexcludepattern":
        case "RouteFilterExcludePattern": target.setRouteFilterExcludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "routefilterincludepattern":
        case "RouteFilterIncludePattern": target.setRouteFilterIncludePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "routesbuilderclasses":
        case "RoutesBuilderClasses": target.setRoutesBuilderClasses(property(camelContext, java.lang.String.class, value)); return true;
        case "routesbuilders":
        case "RoutesBuilders": target.setRoutesBuilders(property(camelContext, java.util.List.class, value)); return true;
        case "routescollectorenabled":
        case "RoutesCollectorEnabled": target.setRoutesCollectorEnabled(property(camelContext, boolean.class, value)); return true;
        case "shutdownloginflightexchangesontimeout":
        case "ShutdownLogInflightExchangesOnTimeout": target.setShutdownLogInflightExchangesOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "shutdownnowontimeout":
        case "ShutdownNowOnTimeout": target.setShutdownNowOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "shutdownroutesinreverseorder":
        case "ShutdownRoutesInReverseOrder": target.setShutdownRoutesInReverseOrder(property(camelContext, boolean.class, value)); return true;
        case "shutdownsuppressloggingontimeout":
        case "ShutdownSuppressLoggingOnTimeout": target.setShutdownSuppressLoggingOnTimeout(property(camelContext, boolean.class, value)); return true;
        case "shutdowntimeout":
        case "ShutdownTimeout": target.setShutdownTimeout(property(camelContext, int.class, value)); return true;
        case "streamcachinganyspoolrules":
        case "StreamCachingAnySpoolRules": target.setStreamCachingAnySpoolRules(property(camelContext, boolean.class, value)); return true;
        case "streamcachingbuffersize":
        case "StreamCachingBufferSize": target.setStreamCachingBufferSize(property(camelContext, int.class, value)); return true;
        case "streamcachingenabled":
        case "StreamCachingEnabled": target.setStreamCachingEnabled(property(camelContext, boolean.class, value)); return true;
        case "streamcachingremovespooldirectorywhenstopping":
        case "StreamCachingRemoveSpoolDirectoryWhenStopping": target.setStreamCachingRemoveSpoolDirectoryWhenStopping(property(camelContext, boolean.class, value)); return true;
        case "streamcachingspoolcipher":
        case "StreamCachingSpoolCipher": target.setStreamCachingSpoolCipher(property(camelContext, java.lang.String.class, value)); return true;
        case "streamcachingspooldirectory":
        case "StreamCachingSpoolDirectory": target.setStreamCachingSpoolDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "streamcachingspoolthreshold":
        case "StreamCachingSpoolThreshold": target.setStreamCachingSpoolThreshold(property(camelContext, long.class, value)); return true;
        case "streamcachingspoolusedheapmemorylimit":
        case "StreamCachingSpoolUsedHeapMemoryLimit": target.setStreamCachingSpoolUsedHeapMemoryLimit(property(camelContext, java.lang.String.class, value)); return true;
        case "streamcachingspoolusedheapmemorythreshold":
        case "StreamCachingSpoolUsedHeapMemoryThreshold": target.setStreamCachingSpoolUsedHeapMemoryThreshold(property(camelContext, int.class, value)); return true;
        case "streamcachingstatisticsenabled":
        case "StreamCachingStatisticsEnabled": target.setStreamCachingStatisticsEnabled(property(camelContext, boolean.class, value)); return true;
        case "threadnamepattern":
        case "ThreadNamePattern": target.setThreadNamePattern(property(camelContext, java.lang.String.class, value)); return true;
        case "tracing":
        case "Tracing": target.setTracing(property(camelContext, boolean.class, value)); return true;
        case "tracingpattern":
        case "TracingPattern": target.setTracingPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "usebreadcrumb":
        case "UseBreadcrumb": target.setUseBreadcrumb(property(camelContext, boolean.class, value)); return true;
        case "usedatatype":
        case "UseDataType": target.setUseDataType(property(camelContext, boolean.class, value)); return true;
        case "usemdclogging":
        case "UseMdcLogging": target.setUseMdcLogging(property(camelContext, boolean.class, value)); return true;
        case "xmlrests":
        case "XmlRests": target.setXmlRests(property(camelContext, java.lang.String.class, value)); return true;
        case "xmlroutetemplates":
        case "XmlRouteTemplates": target.setXmlRouteTemplates(property(camelContext, java.lang.String.class, value)); return true;
        case "xmlroutes":
        case "XmlRoutes": target.setXmlRoutes(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.main.MainConfigurationProperties target = (org.apache.camel.main.MainConfigurationProperties) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "AllowUseOriginalMessage": return target.isAllowUseOriginalMessage();
        case "autoconfigurationenabled":
        case "AutoConfigurationEnabled": return target.isAutoConfigurationEnabled();
        case "autoconfigurationenvironmentvariablesenabled":
        case "AutoConfigurationEnvironmentVariablesEnabled": return target.isAutoConfigurationEnvironmentVariablesEnabled();
        case "autoconfigurationfailfast":
        case "AutoConfigurationFailFast": return target.isAutoConfigurationFailFast();
        case "autoconfigurationlogsummary":
        case "AutoConfigurationLogSummary": return target.isAutoConfigurationLogSummary();
        case "autostartup":
        case "AutoStartup": return target.isAutoStartup();
        case "autowirecomponentproperties":
        case "AutowireComponentProperties": return target.isAutowireComponentProperties();
        case "autowirecomponentpropertiesallowprivatesetter":
        case "AutowireComponentPropertiesAllowPrivateSetter": return target.isAutowireComponentPropertiesAllowPrivateSetter();
        case "autowirecomponentpropertiesdeep":
        case "AutowireComponentPropertiesDeep": return target.isAutowireComponentPropertiesDeep();
        case "autowirecomponentpropertiesnonnullonly":
        case "AutowireComponentPropertiesNonNullOnly": return target.isAutowireComponentPropertiesNonNullOnly();
        case "backlogtracing":
        case "BacklogTracing": return target.isBacklogTracing();
        case "beanintrospectionextendedstatistics":
        case "BeanIntrospectionExtendedStatistics": return target.isBeanIntrospectionExtendedStatistics();
        case "beanintrospectionlogginglevel":
        case "BeanIntrospectionLoggingLevel": return target.getBeanIntrospectionLoggingLevel();
        case "beanpostprocessorenabled":
        case "BeanPostProcessorEnabled": return target.isBeanPostProcessorEnabled();
        case "caseinsensitiveheaders":
        case "CaseInsensitiveHeaders": return target.isCaseInsensitiveHeaders();
        case "clearreifiers":
        case "ClearReifiers": return target.isClearReifiers();
        case "configurationclasses":
        case "ConfigurationClasses": return target.getConfigurationClasses();
        case "configurations":
        case "Configurations": return target.getConfigurations();
        case "consumertemplatecachesize":
        case "ConsumerTemplateCacheSize": return target.getConsumerTemplateCacheSize();
        case "durationhitexitcode":
        case "DurationHitExitCode": return target.getDurationHitExitCode();
        case "durationmaxidleseconds":
        case "DurationMaxIdleSeconds": return target.getDurationMaxIdleSeconds();
        case "durationmaxmessages":
        case "DurationMaxMessages": return target.getDurationMaxMessages();
        case "durationmaxseconds":
        case "DurationMaxSeconds": return target.getDurationMaxSeconds();
        case "endpointbasicpropertybinding":
        case "EndpointBasicPropertyBinding": return target.isEndpointBasicPropertyBinding();
        case "endpointbridgeerrorhandler":
        case "EndpointBridgeErrorHandler": return target.isEndpointBridgeErrorHandler();
        case "endpointlazystartproducer":
        case "EndpointLazyStartProducer": return target.isEndpointLazyStartProducer();
        case "endpointruntimestatisticsenabled":
        case "EndpointRuntimeStatisticsEnabled": return target.isEndpointRuntimeStatisticsEnabled();
        case "fileconfigurations":
        case "FileConfigurations": return target.getFileConfigurations();
        case "inflightrepositorybrowseenabled":
        case "InflightRepositoryBrowseEnabled": return target.isInflightRepositoryBrowseEnabled();
        case "javaroutesexcludepattern":
        case "JavaRoutesExcludePattern": return target.getJavaRoutesExcludePattern();
        case "javaroutesincludepattern":
        case "JavaRoutesIncludePattern": return target.getJavaRoutesIncludePattern();
        case "jmxenabled":
        case "JmxEnabled": return target.isJmxEnabled();
        case "jmxmanagementnamepattern":
        case "JmxManagementNamePattern": return target.getJmxManagementNamePattern();
        case "jmxmanagementstatisticslevel":
        case "JmxManagementStatisticsLevel": return target.getJmxManagementStatisticsLevel();
        case "lightweight":
        case "Lightweight": return target.isLightweight();
        case "loadtypeconverters":
        case "LoadTypeConverters": return target.isLoadTypeConverters();
        case "logdebugmaxchars":
        case "LogDebugMaxChars": return target.getLogDebugMaxChars();
        case "logexhaustedmessagebody":
        case "LogExhaustedMessageBody": return target.isLogExhaustedMessageBody();
        case "logmask":
        case "LogMask": return target.isLogMask();
        case "mdcloggingkeyspattern":
        case "MdcLoggingKeysPattern": return target.getMdcLoggingKeysPattern();
        case "messagehistory":
        case "MessageHistory": return target.isMessageHistory();
        case "name":
        case "Name": return target.getName();
        case "packagescanroutebuilders":
        case "PackageScanRouteBuilders": return target.getPackageScanRouteBuilders();
        case "producertemplatecachesize":
        case "ProducerTemplateCacheSize": return target.getProducerTemplateCacheSize();
        case "routecontrollerbackoffdelay":
        case "RouteControllerBackOffDelay": return target.getRouteControllerBackOffDelay();
        case "routecontrollerbackoffmaxattempts":
        case "RouteControllerBackOffMaxAttempts": return target.getRouteControllerBackOffMaxAttempts();
        case "routecontrollerbackoffmaxdelay":
        case "RouteControllerBackOffMaxDelay": return target.getRouteControllerBackOffMaxDelay();
        case "routecontrollerbackoffmaxelapsedtime":
        case "RouteControllerBackOffMaxElapsedTime": return target.getRouteControllerBackOffMaxElapsedTime();
        case "routecontrollerbackoffmultiplier":
        case "RouteControllerBackOffMultiplier": return target.getRouteControllerBackOffMultiplier();
        case "routecontrollerexcluderoutes":
        case "RouteControllerExcludeRoutes": return target.getRouteControllerExcludeRoutes();
        case "routecontrollerincluderoutes":
        case "RouteControllerIncludeRoutes": return target.getRouteControllerIncludeRoutes();
        case "routecontrollerinitialdelay":
        case "RouteControllerInitialDelay": return target.getRouteControllerInitialDelay();
        case "routecontrollerroutestartuplogginglevel":
        case "RouteControllerRouteStartupLoggingLevel": return target.getRouteControllerRouteStartupLoggingLevel();
        case "routecontrollersuperviseenabled":
        case "RouteControllerSuperviseEnabled": return target.isRouteControllerSuperviseEnabled();
        case "routecontrollerthreadpoolsize":
        case "RouteControllerThreadPoolSize": return target.getRouteControllerThreadPoolSize();
        case "routecontrollerunhealthyonexhausted":
        case "RouteControllerUnhealthyOnExhausted": return target.isRouteControllerUnhealthyOnExhausted();
        case "routefilterexcludepattern":
        case "RouteFilterExcludePattern": return target.getRouteFilterExcludePattern();
        case "routefilterincludepattern":
        case "RouteFilterIncludePattern": return target.getRouteFilterIncludePattern();
        case "routesbuilderclasses":
        case "RoutesBuilderClasses": return target.getRoutesBuilderClasses();
        case "routesbuilders":
        case "RoutesBuilders": return target.getRoutesBuilders();
        case "routescollectorenabled":
        case "RoutesCollectorEnabled": return target.isRoutesCollectorEnabled();
        case "shutdownloginflightexchangesontimeout":
        case "ShutdownLogInflightExchangesOnTimeout": return target.isShutdownLogInflightExchangesOnTimeout();
        case "shutdownnowontimeout":
        case "ShutdownNowOnTimeout": return target.isShutdownNowOnTimeout();
        case "shutdownroutesinreverseorder":
        case "ShutdownRoutesInReverseOrder": return target.isShutdownRoutesInReverseOrder();
        case "shutdownsuppressloggingontimeout":
        case "ShutdownSuppressLoggingOnTimeout": return target.isShutdownSuppressLoggingOnTimeout();
        case "shutdowntimeout":
        case "ShutdownTimeout": return target.getShutdownTimeout();
        case "streamcachinganyspoolrules":
        case "StreamCachingAnySpoolRules": return target.isStreamCachingAnySpoolRules();
        case "streamcachingbuffersize":
        case "StreamCachingBufferSize": return target.getStreamCachingBufferSize();
        case "streamcachingenabled":
        case "StreamCachingEnabled": return target.isStreamCachingEnabled();
        case "streamcachingremovespooldirectorywhenstopping":
        case "StreamCachingRemoveSpoolDirectoryWhenStopping": return target.isStreamCachingRemoveSpoolDirectoryWhenStopping();
        case "streamcachingspoolcipher":
        case "StreamCachingSpoolCipher": return target.getStreamCachingSpoolCipher();
        case "streamcachingspooldirectory":
        case "StreamCachingSpoolDirectory": return target.getStreamCachingSpoolDirectory();
        case "streamcachingspoolthreshold":
        case "StreamCachingSpoolThreshold": return target.getStreamCachingSpoolThreshold();
        case "streamcachingspoolusedheapmemorylimit":
        case "StreamCachingSpoolUsedHeapMemoryLimit": return target.getStreamCachingSpoolUsedHeapMemoryLimit();
        case "streamcachingspoolusedheapmemorythreshold":
        case "StreamCachingSpoolUsedHeapMemoryThreshold": return target.getStreamCachingSpoolUsedHeapMemoryThreshold();
        case "streamcachingstatisticsenabled":
        case "StreamCachingStatisticsEnabled": return target.isStreamCachingStatisticsEnabled();
        case "threadnamepattern":
        case "ThreadNamePattern": return target.getThreadNamePattern();
        case "tracing":
        case "Tracing": return target.isTracing();
        case "tracingpattern":
        case "TracingPattern": return target.getTracingPattern();
        case "usebreadcrumb":
        case "UseBreadcrumb": return target.isUseBreadcrumb();
        case "usedatatype":
        case "UseDataType": return target.isUseDataType();
        case "usemdclogging":
        case "UseMdcLogging": return target.isUseMdcLogging();
        case "xmlrests":
        case "XmlRests": return target.getXmlRests();
        case "xmlroutetemplates":
        case "XmlRouteTemplates": return target.getXmlRouteTemplates();
        case "xmlroutes":
        case "XmlRoutes": return target.getXmlRoutes();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "configurations":
        case "Configurations": return java.lang.Object.class;
        case "routesbuilders":
        case "RoutesBuilders": return org.apache.camel.RoutesBuilder.class;
        default: return null;
        }
    }
}

