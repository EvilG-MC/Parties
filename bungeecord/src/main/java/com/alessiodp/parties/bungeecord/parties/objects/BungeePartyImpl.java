package com.alessiodp.parties.bungeecord.parties.objects;

import com.alessiodp.parties.common.PartiesPlugin;
import com.alessiodp.parties.common.parties.objects.PartyImpl;

public class BungeePartyImpl extends PartyImpl {
	
	public BungeePartyImpl(PartiesPlugin plugin, String name) {
		super(plugin, name);
	}
	
	@Override
	public void callChange() {
		// Nothing to do
	}
}
