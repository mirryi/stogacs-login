package net.edt.web.converter;

import net.edt.persistence.domain.User;
import net.edt.web.dto.RegistrationContext;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RegistrationToUserConverter {

    @Autowired
    private ModelMapper modelMapper;

    public User convertToUser(RegistrationContext context) {
        return modelMapper.map(context, User.class);
    }

}
