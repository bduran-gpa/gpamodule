package com.gpamodule.gpamodule;

import com.inductiveautomation.ignition.gateway.clientcomm.ClientReqSession;
import com.inductiveautomation.ignition.gateway.localdb.persistence.PersistenceSession;
import com.inductiveautomation.ignition.gateway.model.GatewayContext;

import java.util.List;

public class GatewayScriptModule extends AbstractScriptModule {


    private final GatewayContext context;

    public GatewayScriptModule(GatewayContext context) {
        this.context = context;
    }

    @Override
    protected int multiplyImpl(int arg0, int arg1) {
        return arg0 * arg1;
    }

	@Override
	protected String helloWorldImpl(String name) {
		return "Hello " + name;
	}

    @Override
    protected long getMemUsageImpl() {
        long sm = context.getPerformanceMonitor().getCurrentMemoryUsage();
        return sm;
    }

}