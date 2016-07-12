package com.jsb.rest.request;

import com.jsb.rest.client.JSBHttpMethod;
import com.taobao.api.ApiRuleException;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.response.PictureUploadResponse;

public class JSBPicUploadRequest extends JSBRequest<PictureUploadResponse>
{ 
    public JSBPicUploadRequest()
    {
        super();
    }
    
    public void setUrl(String url)
    {
        queryMaps.put("url", url);
    }
    
    public void setTitle(String title)
    {
        queryMaps.put("title", title);
    }
    
    @Override
    public String getResourceUrl()
    {
        return "multimedia/picture/upload";
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
        RequestCheckUtils.checkNotEmpty(queryMaps.get("url"), "url");
        RequestCheckUtils.checkNotEmpty(queryMaps.get("title"), "title");
    }
    
}
