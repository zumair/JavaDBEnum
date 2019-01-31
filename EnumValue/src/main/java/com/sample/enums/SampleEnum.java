package com.sample.enums;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import com.sample.enums.core.EnumCode;
import com.sample.enums.core.EnumType;

public enum SampleEnum implements EnumType {
	CONSTANT1("CONS1","Some Constant");
	
	private String code;
	private String value;
	private static final Map<String, SampleEnum> map = new LinkedHashMap<String, SampleEnum>();
	static {
		Stream.of(SampleEnum.values()).forEach(x->{
			map.put(x.getCode(), x);
		});
	}
	
	private SampleEnum(final String code, final String value) {
		this.code =  code;
		this.value = value;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getValue() {
		return value;
	}
	
	public static EnumCode<SampleEnum> lookupByCode(final String code) {
		final SampleEnum enumObject =  map.get(code);
		return enumObject == null ? EnumCode.of(code) : EnumCode.of(enumObject);
	}
	
	
	
}
