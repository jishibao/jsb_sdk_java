package com.jsb.rest.request.trade;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
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
        queryMaps.put("start_created", startCreated);
    }
    
    public void setEndCreated(String startCreated)
    {
        queryMaps.put("end_created", startCreated);
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
