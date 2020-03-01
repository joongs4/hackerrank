package com.algorithm.hackerrank.easy;

import java.util.Hashtable;
import java.util.function.Function;

public class Ship {
	private Hashtable<Byte, Byte> containers;

	public Ship(int containerCount, Function<Integer, Integer> fillContainer) {
		this.containers = new Hashtable<Byte, Byte>();

		for (int i = 0; i < containerCount; i++) {
			int intToByte = fillContainer.apply(i);
			this.containers.put((byte) i, (byte) intToByte);
		}
	}

	public byte peekContainer(int containerIndex) {
		short valueFromContainer = this.containers.get((byte) containerIndex);

		return (byte) valueFromContainer;
	}

	public static void main(String[] args) {
		Ship ship = new Ship(10, containerIndex -> containerIndex);

		for (int i = 0; i < 10; i++) {
			System.out.println("Container: " + i + ", cargo: " + ship.peekContainer(i));
		}
	}
}