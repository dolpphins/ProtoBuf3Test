package com;

import com.google.protobuf.InvalidProtocolBufferException;

public class Test {
	
	public static void main(String[] args) throws InvalidProtocolBufferException {
		
		AnimalOuterClass.Animal.Builder builder = AnimalOuterClass.Animal.newBuilder();
		builder.setAge(12);
		builder.setName("haha");
		AnimalOuterClass.Animal animal = builder.build();
		// ���л�
		byte[] data = animal.toByteArray();
		// ʮ��������ʽ��ӡ
		for (byte b : data) {
			System.out.print(String.format("%02X", b & 0xFF));
		}
		System.out.println();
		// �����л�
		AnimalOuterClass.Animal newAnimal = AnimalOuterClass.Animal.parseFrom(data);
		System.out.println("name:" + newAnimal.getName());
		System.out.println("age:" + newAnimal.getAge());
		
		
		
	}
	
}
