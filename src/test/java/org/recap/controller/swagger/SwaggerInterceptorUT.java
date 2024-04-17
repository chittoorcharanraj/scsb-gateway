package org.recap.controller.swagger;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Ignore;
import org.recap.config.SwaggerInterceptor;
import org.recap.util.MD5EncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.servlet.ModelAndView;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


/**
 * Created by hemalathas on 25/1/17.
 */
@Ignore
public class SwaggerInterceptorUT {

    @Autowired
    SwaggerInterceptor swaggerInterceptor;

    @Autowired
    HttpServletRequest httpServletRequest;

    @Autowired
    private HttpServletResponse httpServletResponse;

    public static final String KEY = "api_key";

    @Ignore
    public void testPreHandle() throws Exception {
        httpServletRequest.setAttribute("api_key", "scsb");
        boolean continueExport = swaggerInterceptor.preHandle(httpServletRequest, httpServletResponse, new Object());
        assertTrue(!continueExport);
    }

    @Ignore
    public void testAuthentication() throws Exception {
        String randomString = RandomStringUtils.random(10, true, true);
        httpServletRequest.setAttribute(KEY, randomString);
        boolean continueExport = swaggerInterceptor.preHandle(httpServletRequest, httpServletResponse, new Object());
        assertTrue(!continueExport);
    }

    @Ignore
    public void testPostHandle() throws Exception {
        swaggerInterceptor.postHandle(httpServletRequest, httpServletResponse, new Object(), new ModelAndView());
    }

    @Ignore
    public void testAfterCompletion() throws Exception {
        swaggerInterceptor.afterCompletion(httpServletRequest, httpServletResponse, new Object(), new Exception());
    }

    @Ignore
    public void testgetMd5EncoderUtil() throws Exception {
        MD5EncoderUtil EncoderUtil = swaggerInterceptor.getMd5EncoderUtil();
        assertNotNull(EncoderUtil);
    }

    @Ignore
    public void testgetScsbApiKey() throws Exception {
        String ScsbApiKey = swaggerInterceptor.getScsbApiKey();
        assertNotNull(ScsbApiKey);
    }

    @Ignore
    public void testgetScsbapiKey() {
        String ScsbApiKey = swaggerInterceptor.getScsbApiKey();
    }

    @Ignore
    public void getMd5EncoderUtiltest() {
        MD5EncoderUtil EncoderUtil = swaggerInterceptor.getMd5EncoderUtil();
    }

    @Ignore
    public void matchingWithInstitutionKeysTest(){
        ReflectionTestUtils.invokeMethod(swaggerInterceptor, "matchingWithInstitutionKeys", "key");
    }

}