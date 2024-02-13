package com.effigo.LearningPortal.dto.mapper;

import com.effigo.LearningPortal.dto.request.FavoriteEntityrequest;
import com.effigo.LearningPortal.dto.response.FavoriteEntityresponse;
import com.effigo.LearningPortal.entity.FavoriteEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-13T19:06:50+0530",
    comments = "version: 1.4.2.Final, compiler: Eclipse JDT (IDE) 3.36.0.v20231114-0937, environment: Java 17.0.9 (Eclipse Adoptium)"
)
public class FavoriteEntityMapperImpl implements FavoriteEntityMapper {

    @Override
    public FavoriteEntity fromRequestToEntity(FavoriteEntityrequest faventityRequest) {
        if ( faventityRequest == null ) {
            return null;
        }

        FavoriteEntity favoriteEntity = new FavoriteEntity();

        favoriteEntity.setCourse_id( faventityRequest.getCourse_id() );
        favoriteEntity.setF_id( faventityRequest.getF_id() );
        favoriteEntity.setU_id( faventityRequest.getU_id() );

        return favoriteEntity;
    }

    @Override
    public FavoriteEntityresponse fromEntityToResponse(FavoriteEntity favEntity) {
        if ( favEntity == null ) {
            return null;
        }

        FavoriteEntityresponse favoriteEntityresponse = new FavoriteEntityresponse();

        favoriteEntityresponse.setCourse_id( favEntity.getCourse_id() );
        favoriteEntityresponse.setF_id( favEntity.getF_id() );
        favoriteEntityresponse.setU_id( favEntity.getU_id() );

        return favoriteEntityresponse;
    }
}
