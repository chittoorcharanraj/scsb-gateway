package org.recap.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by hemalathas on 24/3/17.
 */
@ExtendWith(MockitoExtension.class)
public class ItemResponseInformationUT {

    @Test
    public void testItemResponseInformation(){
        ItemResponseInformation itemResponseInformation = new ItemResponseInformation();
        itemResponseInformation.setPatronBarcode("453454564");
        itemResponseInformation.setItemBarcodes(Arrays.asList("4534"));
        itemResponseInformation.setRequestType("Recall");
        itemResponseInformation.setDeliveryLocation("PB");
        itemResponseInformation.setRequestingInstitution("CUL");
        itemResponseInformation.setBibliographicId("1");
        itemResponseInformation.setExpirationDate(new Date().toString());
        itemResponseInformation.setScreenMessage("test");
        itemResponseInformation.setSuccess(true);
        itemResponseInformation.setEmailAddress("test@email.com");
        itemResponseInformation.setTitleIdentifier("test");

        assertNotNull(itemResponseInformation.getPatronBarcode());
        assertNotNull(itemResponseInformation.getBibliographicId());
        assertNotNull(itemResponseInformation.getItemBarcodes());
        assertNotNull(itemResponseInformation.getRequestType());
        assertNotNull(itemResponseInformation.getDeliveryLocation());
        assertNotNull(itemResponseInformation.getRequestingInstitution());
        assertNotNull(itemResponseInformation.getExpirationDate());
        assertNotNull(itemResponseInformation.getScreenMessage());
        assertNotNull(itemResponseInformation.isSuccess());
        assertNotNull(itemResponseInformation.getEmailAddress());
        assertNotNull(itemResponseInformation.getTitleIdentifier());
    }



}