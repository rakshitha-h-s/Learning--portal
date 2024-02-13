package com.effigo.LearningPortal.dto.mapper;

import com.effigo.LearningPortal.dto.request.UserCourseEnrollmentrequest;
import com.effigo.LearningPortal.dto.response.UserCourseEnrollmentresponse;
import com.effigo.LearningPortal.entity.UserCourseEnrollmentEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-13T17:07:16+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class UserCourseEnrollmentMapperImpl implements UserCourseEnrollmentMapper {

    @Override
    public UserCourseEnrollmentEntity fromRequestToEntity(UserCourseEnrollmentrequest usercourseRequest) {
        if ( usercourseRequest == null ) {
            return null;
        }

        UserCourseEnrollmentEntity userCourseEnrollmentEntity = new UserCourseEnrollmentEntity();

        userCourseEnrollmentEntity.setEnrollment_date( usercourseRequest.getEnrollment_date() );
        userCourseEnrollmentEntity.setEnrollment_id( usercourseRequest.getEnrollment_id() );
        userCourseEnrollmentEntity.setU_id( usercourseRequest.getU_id() );
        userCourseEnrollmentEntity.setCourse_id( usercourseRequest.getCourse_id() );

        return userCourseEnrollmentEntity;
    }

    @Override
    public UserCourseEnrollmentresponse fromEntityToResponse(UserCourseEnrollmentEntity usercourseEntity) {
        if ( usercourseEntity == null ) {
            return null;
        }

        UserCourseEnrollmentresponse userCourseEnrollmentresponse = new UserCourseEnrollmentresponse();

        userCourseEnrollmentresponse.setEnrollment_id( usercourseEntity.getEnrollment_id() );
        userCourseEnrollmentresponse.setU_id( usercourseEntity.getU_id() );
        userCourseEnrollmentresponse.setCourse_id( usercourseEntity.getCourse_id() );
        userCourseEnrollmentresponse.setEnrollment_date( usercourseEntity.getEnrollment_date() );

        return userCourseEnrollmentresponse;
    }
}
