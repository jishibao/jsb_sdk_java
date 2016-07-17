package com.jsb.rest.request;

import com.jsb.rest.client.JSBHttpMethod;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.TradeMemoAddResponse;

public class JSBTradeMemoAddRequest extends JSBRequest<TradeMemoAddResponse>
{
    public JSBTradeMemoAddRequest()
    {
        super();
    }
    
    public void setMemo(String memo)
    {
        queryMaps.put("memo", memo);
    }
    
    public void setFlag(Long flag)
    {
        queryMaps.put("flag", String.valueOf(flag));
    }
    
    public void setTid(String tid)
    {
        queryMaps.put("tid", tid);
    }
    
    @Override
    public String getResourceUrl()
    {
        return "trade/TradeMemoAddRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }
    
    @Override
    public Class<TradeMemoAddResponse> getResponseClass()
    {
        return TradeMemoAddResponse.class;
    }
    
    @Override
    public void checkParameter()
        throws ApiRuleException
    {
        RequestCheckUtils.checkNotEmpty(queryMaps.get("memo"), "memo");
        RequestCheckUtils.checkNumeric(queryMaps.get("tid"), "tid");
    }
    
}