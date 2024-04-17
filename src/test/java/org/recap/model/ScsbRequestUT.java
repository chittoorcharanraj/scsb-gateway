package org.recap.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ScsbRequestUT{

    @Test
    public void scsbRequest(){
        ScsbRequest scsbRequest=new ScsbRequest();
        scsbRequest.setReportType("Incremental");
        scsbRequest.setTransmissionType("1");
        scsbRequest.setDateFrom(new Date());
        scsbRequest.setDateTo(new Date());
        assertEquals("Incremental",scsbRequest.getReportType());
    }
}
