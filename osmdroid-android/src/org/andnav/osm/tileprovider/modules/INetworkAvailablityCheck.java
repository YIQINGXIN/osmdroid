package org.andnav.osm.tileprovider.modules;

public interface INetworkAvailablityCheck {

	boolean getNetworkAvailable();

	boolean getWiFiNetworkAvailable();

	boolean getCellularDataNetworkAvailable();

	boolean getRouteToPathExists(int hostAddress);
}
