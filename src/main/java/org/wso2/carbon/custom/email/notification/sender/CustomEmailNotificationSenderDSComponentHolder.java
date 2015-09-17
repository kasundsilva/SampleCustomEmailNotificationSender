package org.wso2.carbon.custom.email.notification.sender;

import org.wso2.carbon.user.core.service.RealmService;

public class CustomEmailNotificationSenderDSComponentHolder {

    private static RealmService realmService;


    /**
     * Get realm service
     *
     * @return realmService
     */
    public static RealmService getRealmService() {
        return realmService;
    }

    /**
     * Set RealmService
     *
     * @param realmService
     */
    public static void setRealmService(RealmService realmService) {
        CustomEmailNotificationSenderDSComponentHolder.realmService = realmService;
    }


}
