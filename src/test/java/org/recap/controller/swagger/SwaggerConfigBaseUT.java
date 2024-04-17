package org.recap.controller.swagger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.recap.config.SwaggerConfig;


import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Charan Raj C created on 02/05/23
 */
@ExtendWith(MockitoExtension.class)
public class SwaggerConfigBaseUT{

    @InjectMocks
    SwaggerConfig swaggerConfig;
    private static final String BAD_REQUEST_ERROR_MESSAGE = "Bad Request";

    @Test
    public void testGetBadRequestErrorMessage() {
        String errorMessage = swaggerConfig.getBadRequestErrorMessage();
        assertEquals(BAD_REQUEST_ERROR_MESSAGE, errorMessage);
    }
}
