package com.douglasmatosdev.mapper.custom;

import com.douglasmatosdev.data.dto.v2.PersonDTOV2;
import com.douglasmatosdev.model.Person;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PersonMapper {

    public PersonDTOV2 convertEntityToDTO(Person person) {
        PersonDTOV2 dto = new PersonDTOV2();

        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setGender(person.getGender());
        dto.setBirthDay(new Date());
        dto.setAddress(person.getAddress());

        return dto;
    }

    public Person convertDTOtoEntity(PersonDTOV2 person) {
        Person entity = new Person();

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setGender(person.getGender());
//        dto.setBirthDay(new Date());
        entity.setAddress(person.getAddress());

        return entity;
    }
}
