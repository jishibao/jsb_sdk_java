package com.jsb.rest.comm;

import net.sf.json.JsonConfig;
import net.sf.json.processors.DefaultValueProcessor;

public class JSONHelper
{
    public static JsonConfig jsonConfig = new JsonConfig();
    static
    {
        jsonConfig.registerJsonValueProcessor(java.util.Date.class, new JsonDateValueProcessor());
        jsonConfig.registerDefaultValueProcessor(Integer.class, new DefaultValueProcessor()
        {
            @SuppressWarnings("rawtypes")
            public Object getDefaultValue(Class type)
            {
                return null;
            }
        });
        jsonConfig.registerDefaultValueProcessor(Long.class, new DefaultValueProcessor()
        {
            @SuppressWarnings("rawtypes")
            public Object getDefaultValue(Class type)
            {
                return null;
            }
        });
        
        jsonConfig.registerDefaultValueProcessor(Boolean.class, new DefaultValueProcessor()
        {
            @SuppressWarnings("rawtypes")
            public Object getDefaultValue(Class type)
            {
                return null;
            }
        });
        
    }
    
}
