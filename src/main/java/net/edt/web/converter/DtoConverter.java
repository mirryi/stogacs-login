package net.edt.web.converter;

public interface DtoConverter<E, D> {

    E convertToEntity(D dto);

    D convertToDto(E entity);

}
