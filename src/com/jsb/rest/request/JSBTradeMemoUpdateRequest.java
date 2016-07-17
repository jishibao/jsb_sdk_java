package com.jsb.rest.request;

import com.jsb.rest.client.JSBHttpMethod;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.TradeMemoUpdateResponse;

public class JSBTradeMemoUpdateRequest extends JSBRequest<TradeMemoUpdateResponse>
{
    public JSBTradeMemoUpdateRequest()
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
    
    public void setReset(Boolean reset)
    {
        queryMaps.put("reset", String.valueOf(reset));
    }
    
    @Override
    public String getResourceUrl()
    {
        return "trade/TradeMemoUpdateRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }
    
    @Override
    public Class<TradeMemoUpdateResponse> getResponseClass()
    {
        return TradeMemoUpdateResponse.class;
    }
    
    @Override
    public void checkParameter()
        throws ApiRuleException
    {
        //RequestCheckUtils.checkNotEmpty(queryMaps.get("memo"), "memo");
        RequestCheckUtils.checkNumeric(queryMaps.get("tid"), "tid");
    }
    
}