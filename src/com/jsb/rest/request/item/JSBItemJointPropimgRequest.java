package com.jsb.rest.request.item;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.ItemJointPropimgResponse;

public class JSBItemJointPropimgRequest extends JSBRequest<ItemJointPropimgResponse>
{
    
    public JSBItemJointPropimgRequest()
    {
        super();
    }
    
    public void setItemId(String num_iid)
    {
        queryMaps.put("num_iid", num_iid);
    }
    
    public void setProperties(String properties)
    {
        queryMaps.put("properties", properties);
    }
    
    public void setId(String id)
    {
        queryMaps.put("id", id);
    }
    
    public void setPosition(String position)
    {
        queryMaps.put("position", position);
    }
    
    public void setPicPath(String picPath)
    {
        queryMaps.put("pic_path", picPath);
    }
    
    @Override
    public String getResourceUrl()
    {
        return "item/ItemJointPropimgRequest";
    }
    
    @Override
    public JSBHttpMethod getMethod()
    {
        return JSBHttpMethod.JSB_METHOD_PUT;
    }
    
    @Override
    public Class<ItemJointPropimgResponse> getResponseClass()
    {
        return ItemJointPropimgResponse.class;
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
