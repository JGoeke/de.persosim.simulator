package de.persosim.simulator.perso.xstream;

import com.thoughtworks.xstream.XStreamException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

import de.persosim.simulator.protocols.Protocol;

/**
 * This class is a converter which is responsible for serializing/deserializing all kind of protocol objects.
 * 
 * @author jgoeke
 *
 */
public class ProtocolConverter implements Converter {

	@Override
	public boolean canConvert(@SuppressWarnings("rawtypes") Class type) {
		
		String name = type.getName();
		if (name.toLowerCase().endsWith("protocol"))
			return true;
		else
			return false;
	}
	
	@Override
	public void marshal(Object value, HierarchicalStreamWriter writer,
			MarshallingContext context) {
		// nothing to do
	}
	
	@Override
	public Object unmarshal(HierarchicalStreamReader reader,
			UnmarshallingContext context) {
		
		String protocolName = reader.getNodeName();
		
		try {
			@SuppressWarnings("unchecked")
			Class<Protocol> protocol = (Class<Protocol>) Class.forName(protocolName);
			return protocol.newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new XStreamException (protocolName + " is unknown, unmarshaling failed!");
		}
	}
}
