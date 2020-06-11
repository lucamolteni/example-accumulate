package org.kie.firealarm;

import java.util.*;
import org.drools.model.*;
import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import java.time.*;
import java.time.format.*;
import java.text.*;
import org.drools.core.util.*;
import static org.kie.firealarm.Rules29F6F105BDF79DB8B0D84A034123A6C8.*;

public class Rules29F6F105BDF79DB8B0D84A034123A6C8RuleMethods0 {

    /**
     * Rule name: rule accumulate
     */
    public static org.drools.model.Rule rule_rule_32accumulate() {
        final org.drools.model.Variable<org.kie.firealarm.Fire> var_$fire = D.declarationOf(org.kie.firealarm.Fire.class,
                                                                                            DomainClassesMetadata29F6F105BDF79DB8B0D84A034123A6C8.org_kie_firealarm_Fire_Metadata_INSTANCE,
                                                                                            "$fire");
        final org.drools.model.Variable<org.kie.firealarm.Room> var_$room = D.declarationOf(org.kie.firealarm.Room.class,
                                                                                            DomainClassesMetadata29F6F105BDF79DB8B0D84A034123A6C8.org_kie_firealarm_Room_Metadata_INSTANCE,
                                                                                            "$room");
        org.drools.model.Rule rule = D.rule("org.kie.firealarm",
                                            "rule accumulate").build(D.pattern(var_$fire).bind(var_$room,
                                                                                               (org.kie.firealarm.Fire _this) -> _this.getRoom(),
                                                                                               D.reactOn("room")),
                                                                     D.on(var_$room).execute((org.kie.firealarm.Room $room) -> {
                                                                         {
                                                                             System.out.println("Fire in room " + $room.getName());
                                                                         }
                                                                     }));
        return rule;
    }
}
