package org.recap.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by Anithav on 16/06/20.
 */
@ExtendWith(MockitoExtension.class)
public class BulkRequestInformationUT {

    @Test
    public void bulkRequestInformation() {
        BulkRequestInformation bulkRequestInformation = new BulkRequestInformation();
        bulkRequestInformation.setPatronBarcode("123");
        bulkRequestInformation.setRequestingInstitution("PUL");
        assertNotNull(bulkRequestInformation.getPatronBarcode());
        assertNotNull(bulkRequestInformation.getRequestingInstitution());
    }
}
