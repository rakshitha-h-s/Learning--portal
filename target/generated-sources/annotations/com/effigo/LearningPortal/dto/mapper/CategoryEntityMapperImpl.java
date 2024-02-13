package com.effigo.LearningPortal.dto.mapper;

import com.effigo.LearningPortal.dto.request.CategoryEntityrequest;
import com.effigo.LearningPortal.dto.response.CategoryEntityresponse;
import com.effigo.LearningPortal.entity.CategoryEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-13T17:07:16+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class CategoryEntityMapperImpl implements CategoryEntityMapper {

    @Override
    public CategoryEntity fromRequestToEntity(CategoryEntityrequest courseentityRequest) {
        if ( courseentityRequest == null ) {
            return null;
        }

        CategoryEntity categoryEntity = new CategoryEntity();

        return categoryEntity;
    }

    @Override
    public CategoryEntityresponse fromEntityToResponse(CategoryEntity courseEntity) {
        if ( courseEntity == null ) {
            return null;
        }

        CategoryEntityresponse categoryEntityresponse = new CategoryEntityresponse();

        categoryEntityresponse.setCategory_id( courseEntity.getCategory_id() );

        return categoryEntityresponse;
    }
}
