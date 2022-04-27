package com.example.demo.workoption;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-27T15:53:06+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.2 (Oracle Corporation)"
)
@Component
public class WorkOptionMapperImpl implements WorkOptionMapper {

    @Override
    public WorkOption toEntity(WorkOptionDto workOptionDto) {
        if ( workOptionDto == null ) {
            return null;
        }

        WorkOption workOption = new WorkOption();

        workOption.setId( workOptionDto.getId() );
        workOption.setOption( workOptionDto.getOption() );
        workOption.setDescription( workOptionDto.getDescription() );

        return workOption;
    }

    @Override
    public WorkOptionDto toDto(WorkOption workOption) {
        if ( workOption == null ) {
            return null;
        }

        Integer id = null;
        String option = null;
        String description = null;

        id = workOption.getId();
        option = workOption.getOption();
        description = workOption.getDescription();

        WorkOptionDto workOptionDto = new WorkOptionDto( id, option, description );

        return workOptionDto;
    }

    @Override
    public void updateWorkOptionFromWorkOptionDto(WorkOptionDto workOptionDto, WorkOption workOption) {
        if ( workOptionDto == null ) {
            return;
        }

        if ( workOptionDto.getId() != null ) {
            workOption.setId( workOptionDto.getId() );
        }
        if ( workOptionDto.getOption() != null ) {
            workOption.setOption( workOptionDto.getOption() );
        }
        if ( workOptionDto.getDescription() != null ) {
            workOption.setDescription( workOptionDto.getDescription() );
        }
    }
}