package com.jsb.rest.request.multimedia;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.PictureUploadResponse;

public class JSBPictureUrlUploadRequest extends JSBRequest<PictureUploadResponse>
{
      
    public JSBPictureUrlUploadRequest()
    {
        super();
    }  
    
    public void setTitle(String title)
    {
        queryMaps.put("title", title);
    }
    
    public void setImageInputTitle(String image_input_title)
    {
        queryMaps.put("image_input_title", image_input_title);
    }
    
    public void setPictureCategoryId(Long picture_category_id)
    {
        queryMaps.put("picture_category_id", String.valueOf(picture_category_id));
    }
    
    @Override
    public String getResourceUrl()
    {
        return "multimedia/PictureUrlUploadRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }
    
    @Override
    public Class<PictureUploadResponse> getResponseClass()
    {
        return PictureUploadResponse.class;
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
    
    public void setUrl(String imageUrl)
    {
        queryMaps.put("url", imageUrl);
    }
    
}
