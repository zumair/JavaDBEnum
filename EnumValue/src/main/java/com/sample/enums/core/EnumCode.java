package com.sample.enums.core;

import java.util.Optional;

public class EnumCode <E extends EnumType>{
	
	private final  String code;
	private final Optional<E> enumObj;
	
	private EnumCode(final E e) {
		this.code = e.getCode();
		this.enumObj = Optional.of(e);
	}
	
	private EnumCode(final String s) {
		this.code = s;
		this.enumObj = Optional.empty();
	}
	
	public static EnumCode of(final EnumType enumObj) {
		return new EnumCode(enumObj);
	}
	
	public static EnumCode of(final String code) {
		return new EnumCode(code);
	}
	
	public boolean hasEnumObject() {
		return this.enumObj.isPresent();
	}
	
	public Optional<E> getEnumObject() {
		return enumObj;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public boolean equals(final String str) {
		return code.equalsIgnoreCase(str);
	}
	
	public boolean equals(final E e) {
		return code.equalsIgnoreCase(e.getCode());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (code == null ? 0 : code.hashCode());
		result = prime * result + (enumObj == null ? 0 : enumObj.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final EnumCode other = (EnumCode) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (enumObj == null) {
			if (other.enumObj != null)
				return false;
		} else if (!enumObj.equals(other.enumObj))
			return false;
		return true;
	}
	
	
	
}
