package com.jsb.rest.request;

import com.jsb.rest.client.JSBHttpMethod;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.TradesSoldGetResponse;

public class JSBTradeSoldGetRequest extends JSBRequest<TradesSoldGetResponse>
{
    public JSBTradeSoldGetRequest()
    {
        super();
    }
    
    public void setFields(String fields)
    {
        queryMaps.put("fields", fields);
    }
    
    public void setStartCreated(String startCreated)
    {
        queryMaps.put("startCreated", startCreated);
    }
    
    public void setTitle(String title)
    {
        queryMaps.put("title", title);
    }
    
    public void setStatus(String status)
    {
        queryMaps.put("status", status);
    }
    
    @Override
    public String getResourceUrl()
    {
        return "trade/TradesSoldGetRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_GET;
    }
    
    @Override
    public Class<TradesSoldGetResponse> getResponseClass()
    {
        return TradesSoldGetResponse.class;
    }
    
    @Override
    public void checkParameter()
        throws ApiRuleException
    {
        RequestCheckUtils.checkNotEmpty(queryMaps.get("fields"), "fields");
    }
    
}
