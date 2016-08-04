package com.jsb.rest.request.multimedia;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.PictureCategoryAddResponse;

public class JSBPictureCategoryAddRequest extends JSBRequest<PictureCategoryAddResponse>
{
   
    
    public JSBPictureCategoryAddRequest()
    {
        super();
    }  
    
    public void setPictureCategoryName(String picture_category_name)
    {
        queryMaps.put("picture_category_name", picture_category_name);
    }
    
    @Override
    public String getResourceUrl()
    {
        return "multimedia/PictureCategoryAddRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }
    
    @Override
    public Class<PictureCategoryAddResponse> getResponseClass()
    {
        return PictureCategoryAddResponse.class;
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
    
}
