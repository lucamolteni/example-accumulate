package org.kie.firealarm;

import java.util.*;
import org.drools.model.*;
import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import java.time.*;
import java.time.format.*;
import java.text.*;
import org.drools.core.util.*;
import org.drools.model.Model;

public class Rules29F6F105BDF79DB8B0D84A034123A6C8 implements Model {

    public final static DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DateUtils.getDateFormatMask(),
                                                                                            Locale.ENGLISH);

    @Override
    public String getName() {
        return "org.kie.firealarm";
    }

    public static Date string_2_date(String s) {
        return GregorianCalendar.from(LocalDate.parse(s,
                                                      DATE_TIME_FORMATTER).atStartOfDay(ZoneId.systemDefault()))
                                .getTime();
    }

    @Override
    public List<org.drools.model.EntryPoint> getEntryPoints() {
        return Collections.emptyList();
    }

    @Override
    public List<org.drools.model.Global> getGlobals() {
        return globals;
    }

    @Override
    public List<org.drools.model.TypeMetaData> getTypeMetaDatas() {
        return typeMetaDatas;
    }

    List<org.drools.model.Global> globals = Collections.emptyList();

    List<org.drools.model.TypeMetaData> typeMetaDatas = Collections.emptyList();

    /**
     * With the following expression ID:
     * org.drools.modelcompiler.builder.generator.DRLIdGenerator@70313b0b
     */
    @Override
    public List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public List<Rule> getRulesList() {
        return Arrays.asList(Rules29F6F105BDF79DB8B0D84A034123A6C8RuleMethods0.rule_rule_32accumulate());
    }

    List<org.drools.model.Rule> rules = getRulesList();

    @Override
    public List<org.drools.model.Query> getQueries() {
        return java.util.Collections.emptyList();
    }
}
