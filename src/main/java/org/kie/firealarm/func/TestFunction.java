package org.kie.firealarm.func;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

import org.kie.api.runtime.rule.AccumulateFunction;

public class TestFunction implements AccumulateFunction<Serializable> {

    @Override
    public void readExternal(final ObjectInput in) {
    }

    @Override
    public Serializable createContext() {
        return null;
    }

    @Override
    public void init(final Serializable context) {
    }

    @Override
    public void accumulate(final Serializable context, final Object value) {
    }

    @Override
    public void reverse(final Serializable context, final Object value) {
    }

    @Override
    public Object getResult(final Serializable context) {
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