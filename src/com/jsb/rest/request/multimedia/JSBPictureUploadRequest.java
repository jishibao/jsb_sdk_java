package com.jsb.rest.request.multimedia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import com.jsb.rest.client.JSBHttpMethod;
import com.jsb.rest.request.JSBRequest;
import com.taobao.api.ApiRuleException;
import com.taobao.api.response.PictureUploadResponse;

public class JSBPictureUploadRequest extends JSBRequest<PictureUploadResponse>
{
    private File picFile;
    
    public JSBPictureUploadRequest()
    {
        super();
    }  
    
    public void setTitle(String title)
    {
        queryMaps.put("image_input_title", title);
    }
    
    @Override
    public String getResourceUrl()
    {
        return "multimedia/PictureUploadRequest";
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
        if (picFile.length() > 34 * 1024 * 1024)
        {
            throw new ApiRuleException("41", "client-error:Invalid arguments: picture is too large");
        }
    }
    
    @Override
    public Object getEntity()
    {
        // File a = new File("D:\\2016-10-16_234138.jpg");
        int fileSize = (int)picFile.length();
        byte[] tempbytes = new byte[fileSize];
        InputStream in = null;
        try
        {
            in = new FileInputStream(picFile);
            // 读入多个字节到字节数组中，byteread为一次读入的字节数
            int byteReaded = 0;
            while (byteReaded < fileSize)
            {
                int left = fileSize-byteReaded;
                byteReaded += in.read(tempbytes, byteReaded, left);
            }
        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        finally
        {
            if (null != in)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return tempbytes;
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
    
    public void setFilePath(String filePath)
    {
        picFile = new File(filePath);
    }
    
}
