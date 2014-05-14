package org.ethereum.util;

import java.io.Serializable;

/**
 * www.ethereumJ.com 
 * User: Roman Mandeleil 
 * Created on: 21/04/14 16:26
 */
public class RLPItem implements RLPElement, Serializable {

	byte[] data;

	public RLPItem(byte[] data) {
		this.data = data;
	}

	public byte[] getData() {

		if (data.length == 0)
			return null;
		return data;
	}
}