
package org.mule.modules.pagerduty.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.pagerduty.processors.GetIncidentsMessageProcessor;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0", date = "2016-05-12T02:38:48+05:30", comments = "Build mule-devkit-3.7.0.2589.361fd9f")
public class GetIncidentsDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(GetIncidentsDefinitionParser.class);

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(GetIncidentsMessageProcessor.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the @Processor [get-incidents] within the connector [pager-duty] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the @Processor [get-incidents] within the connector [pager-duty] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.addConstructorArgValue("getIncidents");
        builder.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        if (!hasAttribute(element, "config-ref")) {
            throw new BeanDefinitionParsingException(new Problem("It seems that the config-ref for @Processor [get-incidents] within the connector [pager-duty] is null or missing. Please, fill the value with the correct global element.", new Location(parserContext.getReaderContext().getResource()), null));
        }
        parseConfigRef(element, builder);
        parseProperty(builder, element, "since", "since");
        parseProperty(builder, element, "untill", "untill");
        parseProperty(builder, element, "dateRange", "dateRange");
        parseProperty(builder, element, "fields", "fields");
        parseProperty(builder, element, "status", "status");
        parseProperty(builder, element, "incidentKey", "incidentKey");
        parseProperty(builder, element, "service", "service");
        parseProperty(builder, element, "teams", "teams");
        parseProperty(builder, element, "assignedToUser", "assignedToUser");
        parseProperty(builder, element, "urgency", "urgency");
        parseProperty(builder, element, "timeZone", "timeZone");
        parseProperty(builder, element, "sortBy", "sortBy");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        attachProcessorDefinition(parserContext, definition);
        return definition;
    }

}