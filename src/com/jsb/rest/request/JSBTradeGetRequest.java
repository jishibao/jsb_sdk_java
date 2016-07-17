package com.jsb.rest.request;

import com.jsb.rest.client.JSBHttpMethod;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.TradeGetResponse;

public class JSBTradeGetRequest extends JSBRequest<TradeGetResponse>
{
    public JSBTradeGetRequest()
    {
        super();
    }
    
    public void setFields(String fields)
    {
        queryMaps.put("fields", fields);
    }    

    
    public void setTid(String tid)
    {
        queryMaps.put("tid", tid);
    }
    
 
    @Override
    public String getResourceUrl()
    {
        return "trade/TradeGetRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_GET;
    }
    
    @Override
    public Class<TradeGetResponse> getResponseClass()
    {
        return TradeGetResponse.class;
    }
    
    @Override
    public void checkParameter()
        throws ApiRuleException
    {
        RequestCheckUtils.checkNotEmpty(queryMaps.get("fields"), "fields");
        RequestCheckUtils.checkNumeric(queryMaps.get("tid"), "tid");
    }
    
}
