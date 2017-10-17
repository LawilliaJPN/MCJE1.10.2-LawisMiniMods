package lawi1005.proxy;

import lawi1005.items.LM05Items;

public class ClientProxy implements CommonProxy {
	@Override
	public void init() {
		LM05Items.registerRenders();
	}
}
