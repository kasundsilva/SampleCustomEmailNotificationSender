package org.wso2.carbon.custom.email.notification.sender.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;
import org.wso2.carbon.custom.email.notification.sender.CustomEmailNotificationSenderDSComponentHolder;
import org.wso2.carbon.user.core.service.RealmService;

/**
 * @scr.component name="custom.email.notification.sender.dscomponent" immediate=true
 * @scr.reference name="realm.service"
 * interface="org.wso2.carbon.user.core.service.RealmService"cardinality="1..1"
 * policy="dynamic" bind="setRealmService" unbind="unsetRealmService"
 */

public class CustomEmailNotificationSenderDSComponent {
    private static Log log = LogFactory.getLog(CustomEmailNotificationSenderDSComponent.class);

    protected void activate(ComponentContext ctxt) {

        log.info("CustomEmailNotificationSenderDSComponent bundle activated successfully..");
    }

    protected void deactivate(ComponentContext ctxt) {
        if (log.isDebugEnabled()) {
            log.debug("CustomEmailNotificationSenderDSComponent is deactivated ");
        }
    }

    protected void setRealmService(RealmService realmService) {
        if (log.isDebugEnabled()) {

            log.debug("Setting the Realm Service");
        }
        CustomEmailNotificationSenderDSComponentHolder.setRealmService(realmService);
    }

    protected void unsetRealmService(RealmService realmService) {
        if (log.isDebugEnabled()) {
            log.debug("UnSetting the Realm Service");
        }
        CustomEmailNotificationSenderDSComponentHolder.setRealmService(null);
    }

    public static RealmService getRealmService() {
        return CustomEmailNotificationSenderDSComponentHolder.getRealmService();
    }

}
