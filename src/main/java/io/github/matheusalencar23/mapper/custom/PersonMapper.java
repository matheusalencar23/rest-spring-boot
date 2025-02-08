package io.github.matheusalencar23.mapper.custom;

import java.util.Date;

import org.springframework.stereotype.Service;

import io.github.matheusalencar23.data.vo.v2.PersonVOV2;
import io.github.matheusalencar23.model.Person;

@Service
public class PersonMapper {
	public PersonVOV2 convertEntityToVo(Person entity) {
		PersonVOV2 vo = new PersonVOV2();
		vo.setId(entity.getId());
		vo.setFirstName(entity.getFirstName());
		vo.setLastName(entity.getLastName());
		vo.setAddress(entity.getAddress());
		vo.setGender(entity.getGender());
		vo.setBirthDay(new Date());
		return vo;
	}
	
	public Person convertVoToEntity(PersonVOV2 vo) {
		Person entity = new Person();
		entity.setId(vo.getId());
		entity.setFirstName(vo.getFirstName());
		entity.setLastName(vo.getLastName());
		entity.setAddress(vo.getAddress());
		entity.setGender(vo.getGender());
		return entity;
	}
}
