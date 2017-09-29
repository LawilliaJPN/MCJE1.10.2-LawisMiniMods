package lawi1002.proxy;

import lawi1002.items.LM02Items;

public class ClientProxy implements CommonProxy {
	@Override
	public void init() {
		LM02Items.registerRenders();
	}
}
