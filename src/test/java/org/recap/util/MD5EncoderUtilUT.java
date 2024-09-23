package org.recap.util;

import java.security.NoSuchAlgorithmException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {MD5EncoderUtil.class})
@ExtendWith(SpringExtension.class)
public class MD5EncoderUtilUT {
    @Autowired
    private MD5EncoderUtil mD5EncoderUtil;

    @Test
    public void getMD5EncodingStringtTest() throws NoSuchAlgorithmException {
        mD5EncoderUtil.getMD5EncodingString("test");
    }


    @Test
    public void matchingTest() {
        mD5EncoderUtil.matching("orig", "compare");
    }
}
