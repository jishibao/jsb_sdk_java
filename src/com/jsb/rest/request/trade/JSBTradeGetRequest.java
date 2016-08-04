package com.jsb.rest.request.trade;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
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
        RequestCheckUtils.checkNumeric(queryMaps.get("tid"), "tid");
    }

    @Override
    public Object getEntity()
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void postHandler()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getType()
    {
        // TODO Auto-generated method stub
        return null;
    }


    
}
