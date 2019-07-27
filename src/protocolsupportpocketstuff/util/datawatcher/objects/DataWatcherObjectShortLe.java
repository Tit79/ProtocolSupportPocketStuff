package protocolsupportpocketstuff.util.datawatcher.objects;

import io.netty.buffer.ByteBuf;
import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.types.networkentity.metadata.ReadableNetworkEntityMetadataObject;

public class DataWatcherObjectShortLe extends ReadableNetworkEntityMetadataObject<Short> {

	public DataWatcherObjectShortLe() {
	}

	public DataWatcherObjectShortLe(short s) {
		value = s;
	}

	public DataWatcherObjectShortLe(int i) {
		value = (short) i;
	}

	@Override
	public void readFromStream(ByteBuf from) {
		this.value = from.readShortLE();
	}

	@Override
	public void writeToStream(ByteBuf to, ProtocolVersion version, String locale) {
		to.writeShortLE(value);
	}

}