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
    public void testGetMD5EncodingString() throws NoSuchAlgorithmException {
        mD5EncoderUtil.getMD5EncodingString("27c7cf400229103e00c6d8830029e29b");
    }


    @Test
    public void testMatching() {
        mD5EncoderUtil.matching("27c7cf400229103e00c6d8830029e29b", "27c7cf400229103e00c6d8830029e29b");
    }
}
