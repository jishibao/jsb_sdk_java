package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemImgUploadResponse;

public class JSBItemImgUrlUploadRequest extends JSBRequest<ItemImgUploadResponse>
{
    
    public JSBItemImgUrlUploadRequest()
    {
        super();
    }
    
    public void setMajor(boolean is_major)
    {
        queryMaps.put("is_major", String.valueOf(is_major));
    }
    
    public void setItemId(String num_iid)
    {
        queryMaps.put("num_iid", num_iid);
    }
    
    @Override
    public String getResourceUrl()
    {
        return "item/ItemImgUrlUploadRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }
    
    @Override
    public Class<ItemImgUploadResponse> getResponseClass()
    {
        return ItemImgUploadResponse.class;
    }
    
    @Override
    public void checkParameter()
        throws ApiRuleException
    {
        
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
    
    public void setUrl(String url)
    {
        queryMaps.put("url", url);
    }
    
}
