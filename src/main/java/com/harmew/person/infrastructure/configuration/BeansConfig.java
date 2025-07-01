package com.harmew.person.infrastructure.configuration;

import com.harmew.person.core.gateways.PersonGateway;
import com.harmew.person.core.usecases.CreatePersonUseCase;
import com.harmew.person.core.usecases.CreatePersonUseCaseImpl;
import com.harmew.person.core.usecases.GetAllPersonsUseCase;
import com.harmew.person.core.usecases.GetAllPersonsUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePersonUseCase createPersonUseCase(PersonGateway personGateway) {
        return new CreatePersonUseCaseImpl(personGateway);
    }

    @Bean
    public GetAllPersonsUseCase getAllPersonsUseCase(PersonGateway personGateway) {
        return new GetAllPersonsUseCaseImpl(personGateway);
    }
}
