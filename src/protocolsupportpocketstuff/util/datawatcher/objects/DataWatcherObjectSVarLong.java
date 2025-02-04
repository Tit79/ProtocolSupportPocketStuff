package protocolsupportpocketstuff.util.datawatcher.objects;

import io.netty.buffer.ByteBuf;
import protocolsupport.api.ProtocolVersion;
import protocolsupport.protocol.serializer.VarNumberSerializer;
import protocolsupport.protocol.types.networkentity.metadata.ReadableNetworkEntityMetadataObject;

public class DataWatcherObjectSVarLong extends ReadableNetworkEntityMetadataObject<Long> {

	public DataWatcherObjectSVarLong() {
	}

	public DataWatcherObjectSVarLong(long value) {
		this.value = value;
	}

	public DataWatcherObjectSVarLong(int value) {
		this.value = (long) value;
	}

	@Override
	public void readFromStream(ByteBuf from) {
		this.value = VarNumberSerializer.readSVarLong(from);
	}

	@Override
	public void writeToStream(ByteBuf to, ProtocolVersion version, String locale) {
		VarNumberSerializer.writeSVarLong(to, value);
	}

}