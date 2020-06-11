package org.kie.firealarm.func;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import org.kie.api.runtime.rule.AccumulateFunction;

public class TestFunction implements AccumulateFunction<ExampleTestObject> {

    @Override
    public void readExternal(final ObjectInput in) {
    }

    @Override
    public ExampleTestObject createContext() {
        return null;
    }

    @Override
    public void init(final ExampleTestObject context) {
    }

    @Override
    public void accumulate(final ExampleTestObject context, final Object value) {
    }

    @Override
    public void reverse(final ExampleTestObject context, final Object value) {
    }

    @Override
    public Object getResult(final ExampleTestObject context) {
        return 1;
    }

    @Override
    public boolean supportsReverse() {
        return true;
    }

    @Override
    public Class<?> getResultType() {
        return Number.class;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {

    }
}