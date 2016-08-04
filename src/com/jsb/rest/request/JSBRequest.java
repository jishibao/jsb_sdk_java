package com.jsb.rest.request;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.jsb.rest.client.JSBHttpMethod;
import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoResponse;

public abstract class JSBRequest<T extends TaobaoResponse> 
{
    protected Map<String, String> queryMaps;
    
    public JSBRequest()
    {
        queryMaps = new HashMap<String, String>();
    }
    
    public abstract String getResourceUrl();
    
    public abstract JSBHttpMethod getMethod();
    
    public abstract Class<T> getResponseClass();
    
    public abstract Object getEntity();
    
    public abstract void postHandler();
    
    public abstract String getType();
    
    public abstract void checkParameter() throws ApiRuleException;
    
    public String getQueryStr()
    {
        StringBuilder builder = new StringBuilder();
        
        for (Entry<String, String> entry : queryMaps.entrySet())
        {
            builder.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
        }
        String result = builder.toString();
        if (result.contains("&"))
        {
            result = result.substring(0, result.lastIndexOf("&"));
        }
        return result;
    }
}
