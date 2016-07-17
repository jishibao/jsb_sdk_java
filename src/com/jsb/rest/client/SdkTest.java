package com.jsb.rest.client;

import java.util.List;

import com.jsb.rest.comm.JSBRestException;
import com.jsb.rest.request.JSBLogisticsDummySendRequest;
import com.jsb.rest.request.JSBPicUploadRequest;
import com.jsb.rest.request.JSBTradeGetRequest;
import com.jsb.rest.request.JSBTradeMemoAddRequest;
import com.jsb.rest.request.JSBTradeMemoUpdateRequest;
import com.jsb.rest.request.JSBTradeSoldGetRequest;
import com.jsb.rest.request.JSBTradesSoldIncrementGetRequest;
import com.taobao.api.domain.Item;
import com.taobao.api.domain.ItemProp;
import com.taobao.api.domain.Order;
import com.taobao.api.domain.SellerCat;
import com.taobao.api.domain.Trade;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.request.AreasGetRequest;
import com.taobao.api.request.ItemSellerGetRequest;
import com.taobao.api.request.ItempropsGetRequest;
import com.taobao.api.request.LogisticsCompaniesGetRequest;
import com.taobao.api.request.LogisticsDummySendRequest;
import com.taobao.api.request.LogisticsOrdersDetailGetRequest;
import com.taobao.api.request.OpenSmsSendmsgRequest;
import com.taobao.api.request.OpenSmsSendmsgRequest.SendMessageRequest;
import com.taobao.api.request.RefundsApplyGetRequest;
import com.taobao.api.request.SellercatsListAddRequest;
import com.taobao.api.request.SellercatsListGetRequest;
import com.taobao.api.request.SellercatsListUpdateRequest;
import com.taobao.api.request.TradeFullinfoGetRequest;
import com.taobao.api.request.TradeGetRequest;
import com.taobao.api.request.TradeMemoAddRequest;
import com.taobao.api.request.TradeMemoUpdateRequest;
import com.taobao.api.request.TradesSoldGetRequest;
import com.taobao.api.request.TradesSoldIncrementGetRequest;
import com.taobao.api.response.AreasGetResponse;
import com.taobao.api.response.ItemSellerGetResponse;
import com.taobao.api.response.ItempropsGetResponse;
import com.taobao.api.response.LogisticsCompaniesGetResponse;
import com.taobao.api.response.LogisticsDummySendResponse;
import com.taobao.api.response.LogisticsOrdersDetailGetResponse;
import com.taobao.api.response.OpenSmsSendmsgResponse;
import com.taobao.api.response.PictureUploadResponse;
import com.taobao.api.response.RefundsApplyGetResponse;
import com.taobao.api.response.SellercatsListAddResponse;
import com.taobao.api.response.SellercatsListGetResponse;
import com.taobao.api.response.SellercatsListUpdateResponse;
import com.taobao.api.response.TradeFullinfoGetResponse;
import com.taobao.api.response.TradeGetResponse;
import com.taobao.api.response.TradeMemoAddResponse;
import com.taobao.api.response.TradeMemoUpdateResponse;
import com.taobao.api.response.TradesSoldGetResponse;
import com.taobao.api.response.TradesSoldIncrementGetResponse;

public class SdkTest
{
    // 夏日来啊
    private static final String AK = "fd8c97673532fe66abfe2f2115e52b26a7c8ee7347c57d598b10c72d5741a036";
    
    private static final String SK = "72edadbfecdfc01bcb952107b3a64cc38c8a3c270be857221e9dc71ebce439d2";
    
    private static final String AK_SandBox = "fd17dbc65a9a6dc03b32342a7002def3b9b4e2778bcc0fbd4fc6b07a394308ca";
    
    private static final String SK_SandBox = "57a136588c076c8f7fcf09282459eac8bbdc5de3dac22e307452cfaaaa6a85a";
    
    private static String mode = "asandbox";
    
    private static String getAK()
    {
        if (mode.equals("sandbox"))
            return AK_SandBox;
        return AK;
    }
    
    private static String getSK()
    {
        if (mode.equals("sandbox"))
            return SK_SandBox;
        return SK;
    }
    
    // public static void testTradeFullGet()
    // throws JSBRestException
    // {
    // JSBClient client = new JSBClient(getAK(), getSK());
    // TradeFullinfoGetRequest req = new TradeFullinfoGetRequest();
    // req.setFields("tid,type,status,payment,orders");
    // req.setTid(1988482578932334L);
    // TradeFullinfoGetResponse rsp = client.execute(req);
    // System.out.println(rsp.getBody());
    // Trade trade = rsp.getTrade();
    // System.out.println(trade.getTid());
    // List<Order> orders = trade.getOrders();
    // for (Order order : orders)
    // {
    // System.out.println(order.getTitle());
    // }
    //
    // }
    
    public static void testLogisticsCompaniesGetRequest()
        throws JSBRestException
    {   
        LogisticsCompaniesGetRequest req = new LogisticsCompaniesGetRequest();
        req.setFields("id,code,name,reg_mail_no");
        JSBClient client = new JSBClient(getAK(), getSK());
        LogisticsCompaniesGetResponse resp = client.execute(req);
        System.out.println(resp.getBody());
    }
    
    public static void testAreasGetRequest()
        throws JSBRestException
    {
        AreasGetRequest req = new AreasGetRequest();
        req.setFields("id");
        JSBClient client = new JSBClient(getAK(), getSK());
        AreasGetResponse resp = client.execute(req);
        System.out.println(resp.getBody());
    }
    
    public static void testItemSellerGetRequest()
        throws JSBRestException
    {
        ItemSellerGetRequest req = new ItemSellerGetRequest();
        req.setFields("num_iid,title,props,price,approve_status,sku");
        req.setNumIid(2200783011403L);
        JSBClient client = new JSBClient(getAK(), getSK());
        ItemSellerGetResponse rsp = client.execute(req);
        Item item = rsp.getItem();
        System.out.println(item.getTitle());
        System.out.println(rsp.getBody());
    }
    
    public static void testTradeFullGet()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        TradeFullinfoGetRequest req = new TradeFullinfoGetRequest();
        req.setFields("tid,type,status,payment,orders");
        req.setTid(1988482578932334L);
        TradeFullinfoGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
        Trade trade = rsp.getTrade();
        System.out.println(trade.getTid());
        List<Order> orders = trade.getOrders();
        for (Order order : orders)
        {
            System.out.println(order.getTitle());
        }
        
    }
    
    public static void testSendSms()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        OpenSmsSendmsgRequest req = new OpenSmsSendmsgRequest();
        SendMessageRequest obj1 = new SendMessageRequest();
        obj1.setTemplateId(123L);
        obj1.setSignatureId(123L);
        obj1.setExternalId("2211111122");
        obj1.setMobile("13398172767");
        obj1.setDeviceLimit(123L);
        obj1.setSessionLimit(123L);
        obj1.setDeviceLimitInTime(123L);
        obj1.setMobileLimit(123L);
        obj1.setSessionLimitInTime(123L);
        obj1.setMobileLimitInTime(123L);
        obj1.setSessionId("demo");
        obj1.setDomain("demo");
        obj1.setDeviceId("demo");
        obj1.setDelayTime(123L);
        obj1.setSignature("淘宝网");
        req.setSendMessageRequest(obj1);
        OpenSmsSendmsgResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }
    
    public static void testTradeSoldGet()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        TradesSoldGetRequest req = new TradesSoldGetRequest();
        req.setFields("tid,type,status,payment");
        req.setStartCreated(StringUtils.parseDateTime("2016-06-10 22:00:00"));
        req.setEndCreated(StringUtils.parseDateTime("2016-06-20 22:59:59"));
        
        req.setPageNo(1L);
        req.setPageSize(40L);
        req.setUseHasNext(true);
        TradesSoldGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
        List<Trade> trades = rsp.getTrades();
        for (Trade trade : trades)
        {
            System.out.println(trade.getTid());
            List<Order> orders = trade.getOrders();
            if (null == orders)
                continue;
            for (Order order : orders)
            {
                System.out.println(order.getTitle());
            }
        }
   
    }
    
    public static void testTradesSoldIncrementGet()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        TradesSoldIncrementGetRequest req = new TradesSoldIncrementGetRequest();
        // req.setStatus("WAIT_BUYER_CONFIRM_GOODS");
        req.setFields("tid,type,status,payment,orders,rx_audit_status");
        req.setStartModified(StringUtils.parseDateTime("2016-06-20 00:00:00"));
        req.setEndModified(StringUtils.parseDateTime("2016-06-20 23:59:59"));
        req.setPageNo(1L);
        req.setPageSize(40L);
        req.setUseHasNext(true);
        TradesSoldIncrementGetResponse rsp = client.execute(req);
        List<Trade> trades = rsp.getTrades();
        for (Trade trade : trades)
        {
            System.out.println(trade.getTid());
            List<Order> orders = trade.getOrders();
            for (Order order : orders)
            {
                System.out.println(order.getTitle());
            }
        }
    }
    
    public static void testLogisticsOrdersDetailGetRequest()
        throws JSBRestException
    {
        LogisticsOrdersDetailGetRequest req = new LogisticsOrdersDetailGetRequest();
        req.setFields("receiver_mobile,tid,order_code,seller_nick,buyer_nick,item_title,receiver_location,status,type,company_name,created,is_quick_cod_order,sub_tids,is_split");
        req.setType("express");
        req.setPageNo(1L);
        req.setPageSize(40L);
        JSBClient client = new JSBClient(getAK(), getSK());
        LogisticsOrdersDetailGetResponse resp = client.execute(req);
        System.out.println(resp.getBody());
    }
    
    public static void testTradeGet()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        TradeGetRequest req = new TradeGetRequest();
        req.setFields("tid,type,status,payment,seller_memo");
        req.setTid(1988482578932334L);
        TradeGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }
    
    public static void testTradeMemoAdd()
        throws JSBRestException
    {
        TradeMemoAddRequest req = new TradeMemoAddRequest();
        req.setTid(1988482578932334L);
        req.setMemo("交易备注");
        req.setFlag(1L);
        JSBClient client = new JSBClient(getAK(), getSK());
        TradeMemoAddResponse rsp = client.execute(req);
        System.out.println(rsp.isSuccess() + " " + rsp.getBody());
    }
    
    public static void testTradeMemoUpdate()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        TradeMemoUpdateRequest req = new TradeMemoUpdateRequest();
        req.setTid(1988482578932334L);
        req.setMemo("交易备注new");
        req.setFlag(1L);
        // req.setReset(true);
        TradeMemoUpdateResponse rsp = client.execute(req);
        System.out.println(rsp.isSuccess() + " " + rsp.getBody());
    }
    
    public static void testLogisticsDummySend()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        
        LogisticsDummySendRequest req = new LogisticsDummySendRequest();
        req.setTid(2003142416134634L);
        LogisticsDummySendResponse rsp = client.execute(req);
        System.out.println(rsp.isSuccess() + " " + rsp.getBody());
    }
    
    public static void testSellercatsListAddRequest()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        SellercatsListAddRequest req = new SellercatsListAddRequest();
        req.setName("店铺一级类目");
        // req.setPictUrl("http://host/image_path");
        req.setParentCid(0L);
        
        SellercatsListAddResponse rsp = client.execute(req);
        System.out.println(rsp.getSellerCat().getName());
        System.out.println(rsp.getBody());
    }
    
    public static void testSellercatsListUpdateRequest()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        SellercatsListUpdateRequest req = new SellercatsListUpdateRequest();
        req.setCid(1240534939L);
        req.setName("我的类目");
        SellercatsListUpdateResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
        System.out.println(rsp.getSellerCat().getName());
    }
    
    public static void testSellercatsListGetRequest()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        SellercatsListGetRequest req = new SellercatsListGetRequest();
        req.setNick("夏日来啊");
        req.setFields("cid,name");
        SellercatsListGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
        for (SellerCat cat : rsp.getSellerCats())
        {
            System.out.println(cat.getName());
        }
    }
    
    public static void testRefund()
        throws JSBRestException
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        RefundsApplyGetRequest req = new RefundsApplyGetRequest();
        req.setFields("refund_id, tid, title, buyer_nick, seller_nick, total_fee, status, created, refund_fee");
        req.setStatus("WAIT_SELLER_CONFIRM_GOODS");
        req.setSellerNick("夏日来啊");
        req.setType("fixed");
        req.setPageNo(1L);
        req.setPageSize(40L);
        RefundsApplyGetResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());
    }
    
  
    
    // public static void testRestTradeGetRequest()
    // {
    // JSBClient client = new JSBClient(getAK(), getSK());
    // try
    // {
    // String response =
    // client.executeGet("/trade/TradeGetRequest", "id=123456&fields=tid,type,status,payment,orders");
    // System.out.println(response);
    // }
    // catch (Exception e)
    // {
    // e.printStackTrace();
    // }
    // }
    //
    // public static void testRestTradeSoldGetRequest()
    // {
    // JSBClient client = new JSBClient(getAK(), getSK());
    // try
    // {
    // String response =
    // client.executeGet("/trade/TradesSoldGetRequest",
    // "fields=tid,type,status,payment&start=2017-06-28+22:10:10&status=WAIT_SELLER_SEND_GOODS");
    // System.out.println(response);
    // }
    // catch (Exception e)
    // {
    // e.printStackTrace();
    // }
    // }
    //
    // public static void testRestLogisticsDummySendRequest()
    // {
    // JSBClient client = new JSBClient(getAK(), getSK());
    // try
    // {
    // String response = client.executePut("/logistics/LogisticsDummySendRequest", "tid=123456");
    // System.out.println(response);
    // }
    // catch (Exception e)
    // {
    //
    // e.printStackTrace();
    // }
    // }
    
    public static void testRestPicUpload()
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        JSBPicUploadRequest req = new JSBPicUploadRequest();
        req.setUrl("http://127.0.0.1");
        req.setTitle("sdfasdf");
        try
        {
            PictureUploadResponse resp = client.executeJsbReq(req);
            System.out.println(resp.getBody());
            System.out.println(resp.isSuccess());
        }
        catch (Exception e)
        {
            
            e.printStackTrace();
        }
    }
    
    public static void testRestLogisticsDummySend()
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        JSBLogisticsDummySendRequest req = new JSBLogisticsDummySendRequest();
        req.setTid("2003142416134634");
        try
        {
            LogisticsDummySendResponse resp = client.executeJsbReq(req);
            System.out.println(resp.getBody());
            System.out.println(resp.isSuccess());
        }
        catch (Exception e)
        {
            
            e.printStackTrace();
        }
    }
    
    // public static void testRestGetProperties()
    // {
    // JSBClient client = new JSBClient(getAK(), getSK());
    // try
    // {
    // String response = client.executeGet("/test", "tid=123456");
    // System.out.println(response);
    // }
    // catch (Exception e)
    // {
    // e.printStackTrace();
    // }
    // }
    
    public static boolean process()
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        List<ItemProp> propList = null;
        ItempropsGetRequest req = new ItempropsGetRequest();
        req.setFields("pid,name,must,multi,prop_values");
        req.setCid(50000436L);
        // request.setIsKeyProp(true);
        // request.setIsSaleProp(true);
        // request.setIsColorProp(true);
        // request.setIsEnumProp(true);
        // request.setIsInputProp(true);
        // req.setIsItemProp(true);
        req.setType(1L);
        // request.setAttrKeys("");
        try
        {
            ItempropsGetResponse response = client.execute(req);
            System.out.println(response.isSuccess());
            if (response.isSuccess())
            {
                propList = response.getItemProps();
                for (ItemProp prop : propList)
                {
                    System.out.println(prop.getName());
                }
                return true;
            }
        }
        catch (JSBRestException e)
        {
            e.printStackTrace();
        }
        return false;
    }
    
    
    public static void testRestTradeSoldGetRequest()
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        JSBTradeSoldGetRequest req = new JSBTradeSoldGetRequest();
        req.setFields("tid,type,status,payment");
        try
        {
            TradesSoldGetResponse resp = client.executeJsbReq(req);
            System.out.println(resp.getBody());
            System.out.println(resp.isSuccess());
        }
        catch (Exception e)
        {
            
            e.printStackTrace();
        }
    }
    
    public static void testRestTradeGetRequest()
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        JSBTradeGetRequest req = new JSBTradeGetRequest();
        req.setFields("tid,type,status,payment");
        req.setTid("1988482578932334");
        try
        {
            TradeGetResponse resp = client.executeJsbReq(req);
            System.out.println(resp.getBody());
            System.out.println(resp.isSuccess());
        }
        catch (Exception e)
        {
            
            e.printStackTrace();
        }
    }  
    
    public static void testRestTradeMemoAddRequest()
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        JSBTradeMemoAddRequest req = new JSBTradeMemoAddRequest();        
        req.setTid("1988482578932334");
        req.setMemo("this is a test");
        req.setFlag(0L);
        try
        {
            TradeMemoAddResponse resp = client.executeJsbReq(req);
            System.out.println(resp.getBody());
            System.out.println(resp.isSuccess());
        }
        catch (Exception e)
        {
            
            e.printStackTrace();
        }
    }  
    
    
    public static void testRestTradeMemoUpdateRequest()
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        JSBTradeMemoUpdateRequest req = new JSBTradeMemoUpdateRequest();        
        req.setTid("1988482578932334");
        req.setMemo("this is a test new");
        req.setFlag(0L);
        req.setReset(true);
        try
        {
            TradeMemoUpdateResponse resp = client.executeJsbReq(req);
            System.out.println(resp.getBody());
            System.out.println(resp.isSuccess());
        }
        catch (Exception e)
        {           
            e.printStackTrace();
        }
    }  
    
    public static void testRestTradesSoldIncrementGetRequest()
    {
        JSBClient client = new JSBClient(getAK(), getSK());
        JSBTradesSoldIncrementGetRequest  req = new JSBTradesSoldIncrementGetRequest();
        req.setFields("tid,type,status,payment");
        req.setStartModified("2016-02-06 12:0:0");
        req.setEndModified("2016-02-06 14:0:0");
        try
        {
            TradesSoldIncrementGetResponse  resp = client.executeJsbReq(req);
            System.out.println(resp.getBody());
            System.out.println(resp.isSuccess());
        }
        catch (Exception e)
        {
            
            e.printStackTrace();
        }
    }
    
    public static void main(String args[])
    {
        try
        {
           JSBClient.setServerUrl("http://127.0.0.1:9080/JSB/rest/");
           testRestTradesSoldIncrementGetRequest();
          // testRestTradeMemoUpdateRequest();
           //testRestTradeMemoAddRequest();
           // testRestLogisticsDummySend();
            // testRestPicUpload();
             //testRestTradeGetRequest();
             //testRestTradeSoldGetRequest();
            // testRestLogisticsDummySendRequest();
            // testRefund();
            // testSendSms();
            
            // process();
            // testTradesSoldIncrementGet();
            // testSellercatsListGetRequest();
            // testTradeMemoUpdate();
             //testTradeSoldGet();
            // testTradesSoldIncrementGet();
            // testTradeFullGet();
            // testTradeMemoAdd();
            // testTradeMemoUpdate();
             //testTradeGet();
             //testLogisticsDummySend();
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
