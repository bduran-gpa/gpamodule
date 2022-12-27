package com.gpamodule.gpamodule.client;

import com.gpamodule.gpamodule.AbstractScriptModule;
import com.gpamodule.gpamodule.MathBlackBox;
import com.inductiveautomation.ignition.client.gateway_interface.ModuleRPCFactory;
import com.inductiveautomation.ignition.client.model.ClientContext;

public class ClientScriptModule extends AbstractScriptModule {

    private final MathBlackBox rpc;

    public ClientScriptModule() {
        rpc = ModuleRPCFactory.create(
            "com.gpamodule.gpamodule",
            MathBlackBox.class
        );
    }

    @Override
    protected int multiplyImpl(int arg0, int arg1) {
        return rpc.multiply(arg0, arg1);
    }

	@Override
	protected String helloWorldImpl(String name) {
		// TODO Auto-generated method stub
		return rpc.helloWrold(name);
	}

    @Override
    protected long getMemUsageImpl() {
        return rpc.getMemUsage();
    }


}