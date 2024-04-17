package org.recap.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by hemalathas on 24/3/17.
 */
@ExtendWith(MockitoExtension.class)
public class ItemRecallResponseUT{

    @Test
    public void testItemRecallResponse(){
        ItemRecallResponse itemRecallResponse = new ItemRecallResponse();
        itemRecallResponse.setAvailable(true);
        itemRecallResponse.setTransactionDate(new Date().toString());
        itemRecallResponse.setInstitutionID("1");
        itemRecallResponse.setPatronIdentifier("463556464");
        itemRecallResponse.setTitleIdentifier("test");
        itemRecallResponse.setExpirationDate(new Date().toString());
        itemRecallResponse.setPickupLocation("PB");
        itemRecallResponse.setQueuePosition("1");
        itemRecallResponse.setBibId("1");
        itemRecallResponse.setISBN("25464");
        itemRecallResponse.setLCCN("424242");

        assertNotNull(itemRecallResponse.getAvailable());
        assertNotNull(itemRecallResponse.getTransactionDate());
        assertNotNull(itemRecallResponse.getInstitutionID());
        assertNotNull(itemRecallResponse.getPatronIdentifier());
        assertNotNull(itemRecallResponse.getTitleIdentifier());
        assertNotNull(itemRecallResponse.getExpirationDate());
        assertNotNull(itemRecallResponse.getPickupLocation());
        assertNotNull(itemRecallResponse.getQueuePosition());
        assertNotNull(itemRecallResponse.getBibId());
        assertNotNull(itemRecallResponse.getISBN());
        assertNotNull(itemRecallResponse.getLCCN());
    }

}