package com.jsb.rest.request;

import com.jsb.rest.client.JSBHttpMethod;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.LogisticsDummySendResponse;

public class JSBRestLogisticsDummySendRequest extends JSBRequest<LogisticsDummySendResponse>
{
    
    @Override
    public String getResourceUrl()
    {
        return "logistics/LogisticsDummySendRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }
    
    @Override
    public Class<LogisticsDummySendResponse> getResponseClass()
    {
        return LogisticsDummySendResponse.class;
    }
    
    public void setTid(String tid)
    {
        queryMaps.put("tid", tid);
    }
    
    @Override
    public void checkParameter()
        throws ApiRuleException
    {
        RequestCheckUtils.checkNumeric(queryMaps.get("tid"), "tid");
    }
}
