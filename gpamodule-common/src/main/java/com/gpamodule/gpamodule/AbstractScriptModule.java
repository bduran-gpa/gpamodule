package com.gpamodule.gpamodule;

import com.inductiveautomation.ignition.common.BundleUtil;
import com.inductiveautomation.ignition.common.script.hints.ScriptArg;
import com.inductiveautomation.ignition.common.script.hints.ScriptFunction;

public abstract class AbstractScriptModule implements MathBlackBox {

    static {
        BundleUtil.get().addBundle(
            AbstractScriptModule.class.getSimpleName(),
            AbstractScriptModule.class.getClassLoader(),
            AbstractScriptModule.class.getName().replace('.', '/')
        );
    }

    @Override
    @ScriptFunction(docBundlePrefix = "AbstractScriptModule")
    public int multiply(
        @ScriptArg("arg0") int arg0,
        @ScriptArg("arg1") int arg1) {

        return multiplyImpl(arg0, arg1);
    }

    protected abstract int multiplyImpl(int arg0, int arg1);
    
    @Override
    public String helloWrold(String name) {
    	return helloWorldImpl(name);
    }
    
    protected abstract String helloWorldImpl(String name);

    @Override
    public long getMemUsage() {
        return getMemUsageImpl();
    }

    protected abstract long getMemUsageImpl();

}