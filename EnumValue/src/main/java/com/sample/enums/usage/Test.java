package com.sample.enums.usage;

import com.sample.enums.SampleEnum;
import com.sample.enums.core.EnumCode;

public class Test {

	public static void main(final String[] args) {
		
		final String someString = "CONS1";
		final EnumCode<SampleEnum> enumCode = SampleEnum.lookupByCode(someString);
		final String someNonExistingString = "CONS2";
		final EnumCode<SampleEnum> enumCode2 = SampleEnum.lookupByCode(someNonExistingString);

		System.out.println(enumCode.equals(SampleEnum.CONSTANT1));
		System.out.println(enumCode.getCode());
		System.out.println(enumCode.equals(someNonExistingString));
		
		System.out.println(enumCode.getEnumObject().isPresent());
		System.out.println(enumCode2.getEnumObject().isPresent());
		System.out.println(enumCode2.getCode());
		
	}

}
