package org.kie.firealarm;
public class DomainClassesMetadata29F6F105BDF79DB8B0D84A034123A6C8 {

    public static final org.drools.model.DomainClassMetadata org_kie_firealarm_Room_Metadata_INSTANCE = new org_kie_firealarm_Room_Metadata();
    private static class org_kie_firealarm_Room_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.firealarm.Room.class;
        }

        @Override
        public int getPropertiesSize() {
            return 1;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "name": return 0;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.kie.firealarm.Room");
        }
    }

    public static final org.drools.model.DomainClassMetadata org_kie_firealarm_Fire_Metadata_INSTANCE = new org_kie_firealarm_Fire_Metadata();
    private static class org_kie_firealarm_Fire_Metadata implements org.drools.model.DomainClassMetadata {

        @Override
        public Class<?> getDomainClass() {
            return org.kie.firealarm.Fire.class;
        }

        @Override
        public int getPropertiesSize() {
            return 1;
        }

        @Override
        public int getPropertyIndex( String name ) {
            switch(name) {
                case "room": return 0;
             }
             throw new RuntimeException("Unknown property '" + name + "' for class class class org.kie.firealarm.Fire");
        }
    }

}