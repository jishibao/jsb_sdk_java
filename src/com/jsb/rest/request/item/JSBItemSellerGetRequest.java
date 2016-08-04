package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemSellerGetResponse;

public class JSBItemSellerGetRequest extends JSBRequest<ItemSellerGetResponse>
{
    
    public JSBItemSellerGetRequest()
    {
        super();
    }
    
    public void setItemId(String num_iid)
    {
        queryMaps.put("num_iid", num_iid);
    }
    
    public void setFields(String fields)
    {
        queryMaps.put("fields", fields);
    }
    
    @Override
    public String getResourceUrl()
    {
        return "item/ItemSellerGetRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_GET;
    }
    
    @Override
    public Class<ItemSellerGetResponse> getResponseClass()
    {
        return ItemSellerGetResponse.class;
    }
    
    @Override
    public void checkParameter()
        throws ApiRuleException
    {
        // String num_iid = queryMaps.get("num_iid");
        // if (StringUtils.isEmpty(num_iid) || !)
        // {
        // throw new ApiRuleException("41", "client-error:Invalid arguments: picture is too large");
        // }
    }
    
    @Override
    public Object getEntity()
    {
        
        return null;
    }
    
    @Override
    public void postHandler()
    {
        
    }
    
    @Override
    public String getType()
    {
        // TODO Auto-generated method stub
        return null;
    }
    
}
