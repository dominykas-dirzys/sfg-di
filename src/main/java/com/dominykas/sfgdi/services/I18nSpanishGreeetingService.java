package com.dominykas.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ESP", "default"})
@Service("i18nService")
public class I18nSpanishGreeetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ESP";
    }
}
