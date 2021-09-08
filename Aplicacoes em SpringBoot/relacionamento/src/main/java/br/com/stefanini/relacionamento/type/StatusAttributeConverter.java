package br.com.stefanini.relacionamento.type;

import javax.persistence.AttributeConverter;

public class StatusAttributeConverter implements AttributeConverter<Status, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Status attribute) {
		if (attribute == null)
			return null;

		switch (attribute) {
		case ATIVO:
			return 1;

		case INATIVO:
			return 0;

		default:
			throw new IllegalArgumentException(attribute + "not supported");
		}

	}

	@Override
	public Status convertToEntityAttribute(Integer dbData) {
		if (dbData == null)
			return null;

		switch (dbData) {
		case 1:
			return Status.ATIVO;

		case 0:
			return Status.INATIVO;

		default:
			throw new IllegalArgumentException(dbData + "not supported");

		}
	}

}
