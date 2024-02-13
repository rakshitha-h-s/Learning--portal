package com.effigo.LearningPortal.dto.mapper;

import com.effigo.LearningPortal.dto.request.CourseEntityrequest;
import com.effigo.LearningPortal.dto.response.CourseEntityResponse;
import com.effigo.LearningPortal.entity.CourseEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-13T17:07:16+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class CourseEntityMapperImpl implements CourseEntityMapper {

    @Override
    public CourseEntity fromRequestToEntity(CourseEntityrequest courseentityRequest) {
        if ( courseentityRequest == null ) {
            return null;
        }

        CourseEntity courseEntity = new CourseEntity();

        courseEntity.setCourse_id( courseentityRequest.getCourse_id() );
        courseEntity.setCourse_name( courseentityRequest.getCourse_name() );
        courseEntity.setCategory( courseentityRequest.getCategory() );
        courseEntity.setU_id( courseentityRequest.getU_id() );

        return courseEntity;
    }

    @Override
    public CourseEntityResponse fromEntityToResponse(CourseEntity courseEntity) {
        if ( courseEntity == null ) {
            return null;
        }

        CourseEntityResponse courseEntityResponse = new CourseEntityResponse();

        courseEntityResponse.setCourse_id( courseEntity.getCourse_id() );
        courseEntityResponse.setCourse_name( courseEntity.getCourse_name() );
        courseEntityResponse.setCategory( courseEntity.getCategory() );
        courseEntityResponse.setU_id( courseEntity.getU_id() );

        return courseEntityResponse;
    }
}
