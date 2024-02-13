package com.effigo.LearningPortal.dto.mapper;

import com.effigo.LearningPortal.dto.request.UserEntityrequest;
import com.effigo.LearningPortal.dto.response.UserEntityresponse;
import com.effigo.LearningPortal.entity.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-13T17:07:16+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class UserEntityMapperImpl implements UserEntityMapper {

    @Override
    public UserEntity fromRequestToEntity(UserEntityrequest userentityRequest) {
        if ( userentityRequest == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setU_id( userentityRequest.getU_id() );
        userEntity.setUserType( userentityRequest.getUserType() );
        userEntity.setUsername( userentityRequest.getUsername() );
        userEntity.setPassword( userentityRequest.getPassword() );

        return userEntity;
    }

    @Override
    public UserEntityresponse fromEntityToResponse(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserEntityresponse userEntityresponse = new UserEntityresponse();

        userEntityresponse.setU_id( userEntity.getU_id() );
        userEntityresponse.setUsername( userEntity.getUsername() );
        userEntityresponse.setPassword( userEntity.getPassword() );
        userEntityresponse.setUserType( userEntity.getUserType() );

        return userEntityresponse;
    }
}
